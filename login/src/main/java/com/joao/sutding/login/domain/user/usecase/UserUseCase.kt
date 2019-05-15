package com.joao.sutding.login.domain.user.usecase

import com.joao.commom.data.core.UseCase
import com.joao.commom.data.core.user.UserParams
import com.joao.commom.data.core.user.entities.User
import com.joao.commom.data.core.user.repositorie.UserRepository

class UserUseCase( private val repository: UserRepository) : UseCase<User?, UserParams>{
    override suspend fun execute(params: UserParams): User? = repository.get(params)
}