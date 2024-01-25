package com.mazaha1.ppsb

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("auth/login")
    fun login(
        @Body userRequest: UserRequest
    ) : Call<UserResponse>
}