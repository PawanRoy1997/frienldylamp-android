package com.example.friendlylamp.common.utils.api.responses

import com.google.gson.annotations.SerializedName

data class ApiResponse<T> (
    @SerializedName("message")
    val message: String?,
    @SerializedName("result")
    val result: T?,
    @SerializedName("errors")
    val errors: ArrayList<String>?
)