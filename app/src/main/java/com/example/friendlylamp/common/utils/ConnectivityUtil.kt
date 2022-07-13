package com.example.friendlylamp.common.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object ConnectivityUtil {
    /**
     * To check if devices has an active internet connection or not.
     *
     * true -> has Internet connection
     * false -> is offline
     *
     * @author Pawan Roy
     * @since 1.0
     * @param context of type [Context]
     * @return result of type [Boolean]
     */
    fun isConnected(context: Context): Boolean {
        return context.connectivityManager().hasInternet()
    }

    private fun Context.connectivityManager() =
        this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private fun ConnectivityManager.hasInternet(): Boolean {
        return this.getNetworkCapabilities(this.activeNetwork)
            ?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) ?: false
    }
}