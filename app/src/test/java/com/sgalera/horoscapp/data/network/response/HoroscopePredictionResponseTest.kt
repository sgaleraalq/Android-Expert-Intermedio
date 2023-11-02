package com.sgalera.horoscapp.data.network.response

import com.sgalera.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test

class HoroscopePredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        // Given
        val horoscopeResponse = anyResponse

        // When
        val predictionModel = horoscopeResponse.toDomain()

        // Then
        predictionModel?.sign shouldBe horoscopeResponse.sign
        predictionModel?.horoscope shouldBe horoscopeResponse.horoscope
    }
}