package com.joao.commom.data.core.base

import androidx.lifecycle.*
import com.joao.commom.data.core.utils.SingleLiveEvent
import com.joao.commom.data.core.utils.exceptions.DataHttpException
import com.joao.commom.data.core.utils.exceptions.DataIOException
import com.joao.libraries.commom.R
import timber.log.Timber

open class BaseViewModel<T> : ViewModel() {
    private val showProgressEvent = SingleLiveEvent<Void>()
    private val hideProgressEvent = SingleLiveEvent<Void>()
    private val showErrorEvent = SingleLiveEvent<Int>()

    var triedLoadAtLeastOnce: Boolean = false
        private set


    private val _data: MutableLiveData<T> = MutableLiveData()
    open val data: LiveData<T> = _data


    suspend fun doWorkWithProgress(loadData: suspend () -> T) {
        showProgressEvent.call()
        triedLoadAtLeastOnce = true
        try {
            _data.value = loadData()
        } catch (e: Exception) {
            Timber.e(e.message)
            showErrorEvent.value = when (e) {
                is DataIOException -> R.string.error_io
                is DataHttpException ->
                    when (e.statusCode) {
                        404 -> R.string.error_404
                        else -> R.string.error_http_general
                    }
                else -> throw e
            }
        } finally {
            hideProgressEvent.call()
        }
    }
    fun observe(
        owner: LifecycleOwner,
        showProgress: () -> Unit,
        hideProgress: () -> Unit,
        showError: (Int) -> Unit,
        handleData: (T) -> Unit
    ) {
        showProgressEvent.observe(owner, showProgress)
        hideProgressEvent.observe(owner, hideProgress)
        showErrorEvent.observe(owner, Observer(showError))

        data.observe(owner, Observer(handleData))
    }
}