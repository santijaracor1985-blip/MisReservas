package com.example.misreservas.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun DetalleReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onBack: () -> Unit,
    onRenovar: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Detalle de Reserva",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "✓ Argumentos recibidos",
            color = Color(0xFF159447),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        Spacer(
            modifier = Modifier.height(20.dp)
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
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = nombreLibro,
                    fontSize = 21.sp
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Autor",
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = "Robert C. Martin"
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Fecha Reserva",
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = fechaReserva
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Código Reserva",
                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = codigoReserva
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Estado: Activa",
                    color = Color(0xFF159447),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(
            modifier = Modifier.weight(1f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Button(
                onClick = onRenovar,
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = "Renovar"
                )
            }

            Button(
                onClick = onBack,
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = "Volver"
                )
            }
        }
    }
}