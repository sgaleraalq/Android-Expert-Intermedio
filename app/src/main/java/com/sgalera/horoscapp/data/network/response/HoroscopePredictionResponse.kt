package com.sgalera.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName

data class HoroscopePredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
)