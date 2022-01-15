package com.ahmedoalamin.kotlinnews.api

import com.ahmedoalamin.model.ApiResponse
import retrofit2.http.GET

interface ApiService {

    @GET(".json")
    suspend fun getNews(): ApiResponse

}