package com.joao.commom.data.core.base

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import androidx.fragment.app.Fragment
import com.joao.commom.data.core.extensions.createLoadingDialog
import com.joao.commom.data.core.extensions.showAlertMessage

open class BaseFragment : Fragment(){
    //progress dialog
    private val progressDialog by lazy { createLoadingDialog() }

    //observers view model
    open fun  setupObservers() = (Unit)

    fun showProgress(){
        progressDialog.show()
    }

    fun hideProgress(){

        progressDialog.dismiss()
    }

    fun showAlterMessage(message: Int){
        showAlertMessage(message)
    }
}
