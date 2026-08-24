package com.example.misreservas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.misreservas.ui.theme.MisReservasTheme
import com.example.misreservas.ui.theme.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MisReservasTheme {

                AppNavigation()

            }
        }
    }
}