package com.ahmedoalamin.kotlinnews.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ahmedoalamin.kotlinnews.repository.MainRepository
import com.ahmedoalamin.kotlinnews.util.Resource

import kotlinx.coroutines.Dispatchers


class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getNews() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}