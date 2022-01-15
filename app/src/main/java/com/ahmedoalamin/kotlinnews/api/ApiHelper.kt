package com.ahmedoalamin.kotlinnews.api


class ApiHelper(private val apiService: ApiService) {

    suspend fun getNews() = apiService.getNews()
}