package com.sangeetha.weatherapp

import com.sangeetha.weatherapp.view.ApiClient
import com.sangeetha.weatherapp.view.WeatherApiService

class ServiceProvider {

    fun provideWeatherService(): WeatherApiService = ApiClient.getApiClient().create(WeatherApiService::class.java)
}