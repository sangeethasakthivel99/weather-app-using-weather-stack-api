package com.sangeetha.weatherapp

import androidx.lifecycle.ViewModel
import com.sangeetha.weatherapp.repository.WeatherRepository
import kotlinx.coroutines.Deferred

class WeatherViewModel: ViewModel() {
    val weatherRepository = WeatherRepository()

    fun getTodayWeather(city: String): Deferred<CurrentWeatherResponse> {
        return  weatherRepository.getTodayWeather(city)
    }
}