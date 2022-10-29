package com.sega.weatherappcompose.presentation.weather_infos_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sega.weatherappcompose.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class WeatherInfosListViewModel @Inject constructor(
    private val repository: WeatherRepository
) : ViewModel() {

    init {
        Timber.i("init call for viewModel")
        //getWeatherData()
    }


    fun getWeatherData() {
        viewModelScope.launch {
            Timber.i("getWeatherData called for viewModel")
            repository.getWeatherData()
        }
    }
}