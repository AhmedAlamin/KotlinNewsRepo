package com.ahmedoalamin.kotlinnews.api

import com.ahmedoalamin.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsAPI {

    @GET(".json")
    suspend fun getNews(
    ): Response<ApiResponse>
}