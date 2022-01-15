package com.ahmedoalamin.model

data class Data(
    val after: String,
    val before: Any,
    val children: MutableList<Children>,
    val dist: Int,
    val geo_filter: Any,
    val modhash: String
)