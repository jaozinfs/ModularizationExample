package com.joao.commom.data.core


interface UseCase<T, Params> {
    suspend fun execute(params: Params): T
}