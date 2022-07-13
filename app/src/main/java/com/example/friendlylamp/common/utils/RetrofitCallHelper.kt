package com.example.friendlylamp.common.utils

import retrofit2.HttpException


suspend fun <T> safeCall(errorHandler: ErrorHandler, call: suspend () -> T) {
    try {
        TODO("Not yet implemented")
    } catch (e: Exception) {
        when (e) {
            is HttpException ->
                errorHandler.handleException(e)
            else ->
                errorHandler.handleThrowable(e)
        }
    }
}