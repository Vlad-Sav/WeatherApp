package com.plcoding.weatherapp.domain.location

interface LocationTracker {
    suspend fun getCurrentLocation()
}