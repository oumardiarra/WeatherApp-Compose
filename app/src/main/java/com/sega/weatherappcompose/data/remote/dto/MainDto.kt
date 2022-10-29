package com.sega.weatherappcompose.data.remote.dto

import com.squareup.moshi.Json

data class MainDto(
    @Json(name = "temp")
    val temperature: Double
)
