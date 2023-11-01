package com.sgalera.horoscapp.data

import android.util.Log
import com.sgalera.horoscapp.data.network.HoroscopeApiService
import com.sgalera.horoscapp.domain.Repository
import com.sgalera.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RespositoryImp @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        // Call retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("sgalera", "Ha ocurrido un error ${it.message}") }
        return null
    }
}