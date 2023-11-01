package com.sgalera.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.sgalera.horoscapp.domain.model.PredictionModel

data class HoroscopePredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionModel? {
        return PredictionModel(
                horoscope = horoscope,
                sign = sign
            )
    }
}