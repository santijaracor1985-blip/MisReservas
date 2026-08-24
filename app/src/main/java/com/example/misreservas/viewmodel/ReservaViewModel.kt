package com.example.misreservas.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ReservaViewModel : ViewModel() {

    var fechaNueva by mutableStateOf("30/06/2026")
        private set

    var reservaRenovada by mutableStateOf(false)
        private set

    fun cambiarFecha(fecha: String) {

        fechaNueva = fecha
    }

    fun renovar() {

        reservaRenovada = true
    }
}