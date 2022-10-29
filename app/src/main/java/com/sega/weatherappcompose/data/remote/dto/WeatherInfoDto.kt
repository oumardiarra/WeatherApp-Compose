package com.sega.weatherappcompose.data.remote.dto

import com.squareup.moshi.Json

data class WeatherInfoDto(
    @Json(name = "dt")
    val timeOfDataForecasted: Long,
    @Json(name = "main")
    val mainDto: MainDto,
    @Json(name = "weather")
    val weatherList: List<WeatherDto>

)
