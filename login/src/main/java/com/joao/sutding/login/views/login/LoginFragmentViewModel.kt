package com.joao.sutding.login.views.login


import com.joao.commom.data.core.base.BaseViewModel
import com.joao.commom.data.core.user.UserParams
import com.joao.commom.data.core.user.entities.User
import com.joao.commom.data.core.utils.asyncAwait
import com.joao.sutding.login.domain.user.usecase.UserUseCase

class LoginFragmentViewModel( private val userUseCase: UserUseCase ) : BaseViewModel<User?>(){


    init {}

    override fun onCleared() {
        super.onCleared()
    }

    suspend fun login(email:String, password:String){
       doWorkWithProgress {
            asyncAwait {
                userUseCase.execute(UserParams(email, password))
            }
       }
    }
}