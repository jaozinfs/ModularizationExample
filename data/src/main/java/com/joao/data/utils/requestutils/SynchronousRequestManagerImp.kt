package com.joao.data.utils.requestutils

import com.joao.commom.data.core.utils.exceptions.DataException
import com.joao.commom.data.core.utils.exceptions.DataHttpException
import com.joao.commom.data.core.utils.exceptions.DataIOException
import kotlinx.coroutines.Deferred
import retrofit2.HttpException
import java.io.IOException


/**
 *
 * @author João victor
 * @since 22/01/2019
 */
class SynchronousRequestManagerImpl<T> : SynchronousRequestManager<T> {

    @Throws(DataException::class)
    override suspend fun getResult(deferred: Deferred<T>): T {
        try {
            val result = deferred.await()
            return result
        } catch (e: Exception) {
            when (e) {
                is IOException -> throw DataIOException(e.message, e)
                is HttpException -> throw DataHttpException(e.message, e.code(), e)
                else -> throw e
            }

        }
    }


}