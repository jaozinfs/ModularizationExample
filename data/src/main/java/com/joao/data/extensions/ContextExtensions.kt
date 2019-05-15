package com.joao.data.extensions

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

val Context.hasNetwork: Boolean
    get() = run {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        activeNetwork != null && activeNetwork.isConnected
    }

