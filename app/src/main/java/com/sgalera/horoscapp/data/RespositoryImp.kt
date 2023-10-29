package com.sgalera.horoscapp.data

import com.sgalera.horoscapp.data.network.HoroscopeApiService
import com.sgalera.horoscapp.domain.Repository
import javax.inject.Inject

class RespositoryImp @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String) {
        // Call retrofit

    }

}