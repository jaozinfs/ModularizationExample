package com.joao.commom.data.core.user.entities

data class User(var id: Int,
                var name: String,
                var email: String,
                val token: String)