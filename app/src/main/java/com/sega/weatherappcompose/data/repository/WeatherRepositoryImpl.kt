package com.sega.weatherappcompose.data.repository

import com.sega.weatherappcompose.data.remote.WeatherApi
import com.sega.weatherappcompose.domain.model.WeatherInfos
import com.sega.weatherappcompose.domain.repository.WeatherRepository
import com.sega.weatherappcompose.util.Resource
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(): Resource<List<WeatherInfos>> {
        try {
            val response = api.getWeatherForcastedData("Casablanca")
            Timber.i("Api response is ${response}")

        } catch (e: IOException) {
            e.printStackTrace()
            Timber.e("An error occured during getWeatherForcastedData ${e.message} ")
            null
        } catch (ex: HttpException) {
            ex.printStackTrace()
            Timber.e("An error occured during getWeatherForcastedData ${ex.message} ")
            null
        }
        return Resource.Success(null)
    }
}