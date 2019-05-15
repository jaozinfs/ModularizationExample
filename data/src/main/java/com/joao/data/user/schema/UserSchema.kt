package com.joao.data.user.schema

import com.joao.commom.data.core.user.entities.User
import com.joao.data.network.Schema

data class UserSchema(
    val name: String,
    val email: String,
    val token: String

) : Schema<User>{
    override fun toDomain(): User {
        return User(
            0,
            name,
            email,
            token
        )
    }
}