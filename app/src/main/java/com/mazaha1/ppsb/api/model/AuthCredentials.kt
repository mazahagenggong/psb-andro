package com.mazaha1.ppsb.api.model

data class AuthCredentials(
    val username: String,
    val password: String,
    val remember: Boolean
)
