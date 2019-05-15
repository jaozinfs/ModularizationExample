package com.joao.sutding.login.views.login

import androidx.lifecycle.ViewModel
import com.joao.commom.data.core.user.UserParams
import com.joao.sutding.login.domain.user.usecase.UserUseCase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginFragmentViewModel( private val userUseCase: UserUseCase ) : ViewModel(){


    init {}

    override fun onCleared() {
        super.onCleared()
    }

    fun login(email:String, password:String){
        GlobalScope.launch {
            userUseCase.execute(UserParams(email, password))
         }
    }
}