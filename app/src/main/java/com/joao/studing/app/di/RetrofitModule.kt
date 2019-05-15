package com.joao.studing.app.di

import com.joao.data.network.retrofit.ApiEndpointsImp
import com.joao.data.network.retrofit.RetrofitBuilder
import com.joao.data.network.cache.CacheConfig


import com.joao.studing.app.network.BASE_URL
import com.joao.studing.app.network.CACHE_SIZE
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val RetrofitModule = module{
    single {
        RetrofitBuilder.createServiceApi(
            cache = CacheConfig(androidContext(), CACHE_SIZE),
            serviceClass = ApiEndpointsImp::class.java,
            baseUrl = BASE_URL
        )
    }
}