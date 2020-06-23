package com.sangeetha.weatherapp.repository

import com.sangeetha.weatherapp.API_KEY
import com.sangeetha.weatherapp.ServiceProvider

class WeatherRepository {

    val serviceProvider = ServiceProvider()

    private val weatherService by lazy {
        serviceProvider.provideWeatherService()
    }

    fun getTodayWeather(city: String) = weatherService.getCurrentWeather( API_KEY, city)
}