package com.mazaha1.ppsb.api.adapter

import com.mazaha1.ppsb.api.model.AuthCredentials
import com.mazaha1.ppsb.api.model.AuthResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Auth {
    @POST("api/auth/signin")
    fun login(@Body credentials: AuthCredentials): Call<AuthResponse>
}