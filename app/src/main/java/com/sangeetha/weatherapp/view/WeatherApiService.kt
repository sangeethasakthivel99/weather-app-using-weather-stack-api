package com.sangeetha.weatherapp.view

import com.sangeetha.weatherapp.CurrentWeatherResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("current")
    fun getCurrentWeather(@Query("access_key") apiKey: String, @Query("query") city: String): Deferred<CurrentWeatherResponse>
}