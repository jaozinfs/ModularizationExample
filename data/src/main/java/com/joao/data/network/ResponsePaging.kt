package com.joao.data.network


data class ResponsePaging<T>(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<T>
)