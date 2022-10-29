package com.sega.weatherappcompose.data.remote.dto

import com.squareup.moshi.Json

data class WeatherDto(
    @Json(name = "icon")
    val icon: String
)
