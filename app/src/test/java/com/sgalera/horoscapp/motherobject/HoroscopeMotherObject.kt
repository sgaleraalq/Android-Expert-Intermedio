package com.sgalera.horoscapp.motherobject

import com.sgalera.horoscapp.data.network.response.HoroscopePredictionResponse
import com.sgalera.horoscapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {

    val anyResponse = HoroscopePredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}