package com.sega.weatherappcompose.data.remote.dto

import com.squareup.moshi.Json

data class ForecastDataInfosDto(
    @Json(name = "cod")
    val code: Int,
    @Json(name = "message")
    val message: String,
    @Json(name = "list")
    val weatherInfoList: List<WeatherInfoDto>
)
