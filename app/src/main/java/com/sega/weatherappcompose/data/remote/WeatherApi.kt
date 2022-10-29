package com.sega.weatherappcompose.data.remote

import com.sega.weatherappcompose.data.remote.dto.ForecastDataInfosDto
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {
    @GET("forecast")
    suspend fun getWeatherForcastedData(
        @Query("q") cityName: String,
        @Query("APPID") apiKey: String = API_KEY
    ): ForecastDataInfosDto

    companion object {
        const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
        const val API_KEY = "bc7e51b8f48db7db94f6b41046837c57"
    }

}