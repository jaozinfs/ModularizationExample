package com.joao.data.utils.exceptions


class DataHttpException(message: String?, var statusCode: Int, cause:Throwable?) : DataException(message,cause) {
}