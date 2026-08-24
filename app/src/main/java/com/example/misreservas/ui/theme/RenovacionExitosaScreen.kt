package com.example.misreservas.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RenovacionExitosaScreen(
    nombreLibro: String,
    fechaNueva: String,
    onVolver: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "✓",
            color = Color(0xFF159447),
            fontSize = 80.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Reserva Renovada",
            color = Color(0xFF159447),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = "Libro",
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Text(
                    text = nombreLibro,
                    fontSize = 21.sp
                )

                Spacer(
                    modifier = Modifier.height(20.dp)
                )

                Text(
                    text = "Nueva fecha",
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Text(
                    text = fechaNueva,
                    fontSize = 21.sp
                )
            }
        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Button(
            onClick = onVolver,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "Volver a Mis Reservas"
            )
        }
    }
}