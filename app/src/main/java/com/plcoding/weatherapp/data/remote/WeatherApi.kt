package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast?hourly=temperature_2m," +
            "wathercode,relativehumidity_2m," +
            "windspeed_10m,pressure_msl")
    suspend fun getWeather(
        @Query("latitude") let: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}