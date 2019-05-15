package com.joao.data.user.schema.repositories

import com.joao.commom.data.core.user.UserParams
import com.joao.commom.data.core.user.entities.User
import com.joao.commom.data.core.user.repositorie.UserRepository
import com.joao.data.network.BaseCloudRepository
import com.joao.data.network.retrofit.ApiEndpointsImp
import com.joao.data.user.schema.UserSchema
import kotlinx.coroutines.Deferred

class UserCloudRepository( api : ApiEndpointsImp ) : BaseCloudRepository<User, UserSchema>(api), UserRepository{

    override val getMethod: (UserParams) -> Deferred<UserSchema>
        get() = api::loginRequest
}