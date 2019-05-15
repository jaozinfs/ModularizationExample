package com.joao.commom.data.core.utils

import kotlinx.coroutines.*


private val mainDispatcher = Dispatchers.Main
private val ioDispatcher = Dispatchers.IO

fun launchUI(block: suspend () -> Unit){
    GlobalScope.launch(mainDispatcher) {
        block()
    }
}

suspend fun <T> asyncAwait(block: suspend () -> T): T {
    return GlobalScope.async(ioDispatcher) {
        block()
    }.await()
}