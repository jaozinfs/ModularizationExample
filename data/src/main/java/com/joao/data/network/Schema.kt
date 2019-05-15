package com.joao.data.network

interface Schema<T>{
    fun toDomain() : T
}