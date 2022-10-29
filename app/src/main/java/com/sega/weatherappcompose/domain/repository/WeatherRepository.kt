package com.sega.weatherappcompose.domain.repository

import com.sega.weatherappcompose.domain.model.WeatherInfos
import com.sega.weatherappcompose.util.Resource

interface WeatherRepository {

    suspend fun getWeatherData(): Resource<List<WeatherInfos>>

}