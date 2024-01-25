package com.mazaha1.ppsb

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("data")
    @Expose
    var data:User? = null

    class User {
        @SerializedName("id")
        @Expose
        var id:String? = null

        @SerializedName("username")
        @Expose
        var username:String? = null

//        @SerializedName("nama")
//        @Expose
//        var nama:String? = null

//        @SerializedName("role")
//        @Expose
//        var role:String? = null

        @SerializedName("token")
        @Expose
        var token:String? = null
    }
}