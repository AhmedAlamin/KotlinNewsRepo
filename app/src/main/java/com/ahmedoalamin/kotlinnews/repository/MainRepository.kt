package com.ahmedoalamin.kotlinnews.repository

import com.ahmedoalamin.kotlinnews.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getNews()
}