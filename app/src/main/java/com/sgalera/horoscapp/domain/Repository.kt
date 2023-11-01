package com.sgalera.horoscapp.domain

import com.sgalera.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}