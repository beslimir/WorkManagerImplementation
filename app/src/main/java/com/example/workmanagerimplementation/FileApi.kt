package com.example.workmanagerimplementation

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://upload.wikimedia.org")
                .build()
                .create(FileApi::class.java)
        }
    }

    @GET("/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/1200px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png")
    suspend fun downloadImage(): Response<ResponseBody>

}