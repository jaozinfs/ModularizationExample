package com.joao.data.utils.exceptions

abstract class DataException(message:String?, cause:Throwable?=null) : Exception(message, cause) {
}