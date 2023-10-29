package com.sgalera.horoscapp.data.network

import com.sgalera.horoscapp.data.network.response.HoroscopePredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {
    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String): HoroscopePredictionResponse
}