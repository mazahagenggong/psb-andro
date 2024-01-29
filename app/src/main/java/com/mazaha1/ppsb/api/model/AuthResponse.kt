package com.mazaha1.ppsb.api.model

data class AuthResponse(
    val success: Boolean,
    val data: UserData?,
    val message: String?
)

data class UserData(
    val id: String,
    val username:String,
    val nama:String,
    val role:String,
    val token:String,
)
