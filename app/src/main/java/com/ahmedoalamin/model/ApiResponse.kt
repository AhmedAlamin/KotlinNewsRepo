package com.ahmedoalamin.model

import java.io.Serializable

data class ApiResponse(
    val `data`: Data,
    val kind: String
):Serializable