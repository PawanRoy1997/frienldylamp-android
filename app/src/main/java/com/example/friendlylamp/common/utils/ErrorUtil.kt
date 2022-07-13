package com.example.friendlylamp.common.utils

import android.content.Context
import com.example.friendlylamp.CustomError
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class ErrorUtil {
    private val networkErrorCode = 1001
    private val serverErrorCode = 1002
    private val slowNetworkErrorCode = 1003
    private val unknownErrorCode = 1002

    private val networkErrorStatusCode = 501
    private val serverErrorStatusCode = 501
    private val slowNetworkErrorStatusCode = 501
    private val unknownErrorStatusCode = 501

    //Handle Network Error
    fun isInternetFailure(context: Context?, t: Throwable): Boolean {
        return (isSlowNetwork(t) || isNoNetwork(context))
    }

    private fun isSlowNetwork(t: Throwable): Boolean {
        return when (t) {
            is ConnectException,
            is SocketTimeoutException,
            is UnknownHostException -> true
            else -> false
        }
    }

    private fun isNoNetwork(context: Context?): Boolean {
        return if (context != null) ConnectivityUtil.isConnected(context) else true
    }

    fun getNetworkError(): CustomError {
        return CustomError(networkErrorCode.toString(), networkErrorStatusCode, "", "")
    }

    fun getSlowNetworkError(): CustomError {
        return CustomError(slowNetworkErrorCode.toString(), slowNetworkErrorStatusCode)
    }

    // Handle Server Error
    fun getServerError(): CustomError {
        return CustomError(serverErrorCode.toString(), serverErrorStatusCode)
    }

    fun getUnknownError(t: Throwable): CustomError {
        return CustomError(unknownErrorCode.toString(), unknownErrorStatusCode, message = "Unknown Error")
    }
}