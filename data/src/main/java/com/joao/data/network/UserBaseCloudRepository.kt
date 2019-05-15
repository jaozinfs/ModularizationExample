package com.joao.data.network

import com.joao.commom.data.core.user.Repository
import com.joao.commom.data.core.user.UserParams
import com.joao.data.network.retrofit.ApiEndpointsImp
import com.joao.data.utils.requestutils.SynchronousRequestManagerImpl
import com.joao.data.utils.exceptions.DataHttpException
import com.joao.data.utils.exceptions.DataIOException
import kotlinx.coroutines.Deferred


/**
 *
 * @author João victor
 * @since 22/01/2019
 */
abstract class UserBaseCloudRepository<T, S>( protected val api: ApiEndpointsImp ) :
    Repository<T> where S : Schema<T> {


    var syncRequestGet = SynchronousRequestManagerImpl<S>()
    abstract val getMethod: (UserParams) -> Deferred<S>



    @Throws(DataIOException::class, DataHttpException::class)
    override suspend fun get(userParams: UserParams): T? {
        val result = syncRequestGet.getResult(getMethod(userParams))
        return result.toDomain()
    }



    override suspend fun insert(t: T) = throw java.lang.UnsupportedOperationException()
    suspend fun listResponse(page: Int, key: String?): ResponsePaging<S>  = throw UnsupportedOperationException()
    override suspend fun list(page: Int, apiKey: String?): List<T>  = throw UnsupportedOperationException()
    override suspend fun update(t: T) = throw UnsupportedOperationException()
    override suspend fun delete(t: T) = throw UnsupportedOperationException()
}