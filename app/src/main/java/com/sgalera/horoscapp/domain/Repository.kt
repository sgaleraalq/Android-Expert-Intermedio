package com.sgalera.horoscapp.domain

interface Repository {
    suspend fun getPrediction(sign: String)
}