package com.joao.data.network.retrofit

import com.joao.commom.data.core.user.UserParams
import com.joao.data.user.schema.UserSchema
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiEndpointsImp{

    @POST("login")
    fun loginRequest(@Body userParams: UserParams) : Deferred<UserSchema>

}