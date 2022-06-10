package com.example.workmanagerimplementation

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://pbs.twimg.com")
                .build()
                .create(FileApi::class.java)
        }
    }

    @GET("/profile_images/611534117855821824/QwiV9f5W_400x400.jpg")
    suspend fun downloadImage(): Response<ResponseBody>

}