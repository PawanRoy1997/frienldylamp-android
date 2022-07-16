package com.example.friendlylamp.common.utils

import arrow.core.left
import arrow.core.right
import com.example.friendlylamp.CustomError
import com.example.friendlylamp.common.utils.api.responses.ApiResponse
import retrofit2.HttpException


suspend fun <T> safeCall(errorHandler: ErrorHandler, call: suspend () -> ApiResponse<T>) {
    try {
        val response = call.invoke()
        if (response.errors.isNullOrEmpty()) {
            response.result.right()
        } else {
            val errors = ""
            response.errors.forEach(errors::plus)
            CustomError(message = errors, statusCode = 422, code = "").left()
        }
    } catch (e: Exception) {
        when (e) {
            is HttpException ->
                errorHandler.handleException(e)
            else ->
                errorHandler.handleThrowable(e)
        }
    }
}