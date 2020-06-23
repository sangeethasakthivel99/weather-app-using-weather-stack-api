package com.sangeetha.weatherapp

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

	val request: Request? = null,
	val current: Current? = null,
	val location: Location? = null
)

data class Request(
	val unit: String? = null,
	val query: String? = null,
	val language: String? = null,
	val type: String? = null
)

data class Location(
	val localtime: String? = null,
	val utc_offset: String? = null,
	val country: String? = null,

	@field:SerializedName("localtime_epoch")
	val localtimeEpoch: Int? = null,

	val name: String? = null,

	@field:SerializedName("timezone_id")
	val timezoneId: String? = null,

	val lon: String? = null,
	val region: String? = null,
	val lat: String? = null
)

data class Current(

	@field:SerializedName("weather_descriptions")
	val weatherDescriptions: List<String?>? = null,

	@field:SerializedName("observation_time")
	val observationTime: String? = null,

	@field:SerializedName("wind_degree")
	val windDegree: Int? = null,

	val visibility: Int? = null,

	@field:SerializedName("weather_icons")
	val weatherIcons: List<String?>? = null,

	val feelslike: Int? = null,

	@field:SerializedName("is_day")
	val isDay: String? = null,

	@field:SerializedName("wind_dir")
	val windDir: String? = null,

	val pressure: Int? = null,
	val cloudcover: Int? = null,
	val precip: Double? = null,

	@field:SerializedName("uv_index")
	val uvIndex: Int? = null,

	val temperature: Int? = null,
	val humidity: Int? = null,

	@field:SerializedName("wind_speed")
	val windSpeed: Int? = null,

	@field:SerializedName("weather_code")
	val weatherCode: Int? = null
)
