package com.example.myapplication.utils

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface LoginApiService {
    @POST(Companion.VALIDATE_USER_PATH)
    @FormUrlEncoded
    suspend fun validateUserData(@Field("username") username:String,@Field("pass")pass:String) : LoginResponse?

    companion object{
        const val VALIDATE_USER_PATH = "/valiate_user"
    }
}