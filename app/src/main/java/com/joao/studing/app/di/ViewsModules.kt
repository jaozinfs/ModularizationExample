package com.joao.studing.app.di

import com.joao.commom.data.core.user.repositorie.UserRepository
import com.joao.data.network.retrofit.ApiEndpointsImp
import com.joao.data.user.schema.repositories.UserCloudRepository

import com.joao.sutding.login.domain.user.usecase.UserUseCase
import com.joao.sutding.login.views.login.LoginFragmentViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel

import org.koin.dsl.module.module

val ViewModules = module {
    factory { UserCloudRepository(get() as ApiEndpointsImp) as UserRepository }
    factory { UserUseCase(get()) }
    viewModel { LoginFragmentViewModel(get()) }


}