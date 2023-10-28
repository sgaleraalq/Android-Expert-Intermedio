package com.sgalera.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.sgalera.horoscapp.data.provider.HoroscopeProvider
import com.sgalera.horoscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(val horoscopeProvider: HoroscopeProvider): ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscope()
    }
}