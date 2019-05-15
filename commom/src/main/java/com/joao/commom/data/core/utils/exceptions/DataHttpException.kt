package com.joao.commom.data.core.utils.exceptions


class DataHttpException(message: String?, var statusCode: Int, cause:Throwable?) : DataException(message,cause) {
}