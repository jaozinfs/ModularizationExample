package com.joao.data.utils

import com.joao.data.network.Schema


fun <T> List<Schema<T>>.toDomain(): List<T> {
    return this.map { it.toDomain() }
}