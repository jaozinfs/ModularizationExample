package com.joao.studing

import android.app.Application
import com.joao.studing.app.di.RetrofitModule
import com.joao.studing.app.di.ViewModules
import org.koin.android.ext.android.startKoin
import timber.log.Timber
import timber.log.Timber.plant

class ModuleAppApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        //start timber for logs
        startTimberProcess()

        // start Koin di
        setupKoin()


    }

    fun startTimberProcess() {
        if (BuildConfig.DEBUG) plant(Timber.DebugTree())
        else {
            //TODO Crash reporting three logging for production com.joao.studing.app
        }
    }

    fun setupKoin(){
        startKoin(
            this, listOf(
                RetrofitModule,
                ViewModules
            )
        )
    }

}