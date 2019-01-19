package com.app.laboratorio2.laboritario2.Models

import android.app.Application

class ApplicationExtendedClass: Application() {
    companion object {
        val myMenuOrderObject = MyMenuOrder()
        val menu = arrayOf("Tacos al Pastor", "Tacos de Lomito", "Tacos de Pollo", "Tacos de Res", "Tacos de Chuleta")
    }
}