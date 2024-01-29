package com.mazaha1.ppsb.api.services

import com.mazaha1.ppsb.api.adapter.Auth
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Server {
    private const val BASE_URL = "https://psb.abunaum98.tech/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val auth: Auth = retrofit.create(Auth::class.java)
}