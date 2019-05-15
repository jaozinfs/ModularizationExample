package com.joao.data.network


data class Response<T>(
    val type: Int,
    val results: List<T>
)