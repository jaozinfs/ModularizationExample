package com.joao.commom.data.core.utils.exceptions

abstract class DataException(message:String?, cause:Throwable?=null) : Exception(message, cause) {
}