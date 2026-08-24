package com.example.misreservas.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RenovarReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onBack: () -> Unit,
    onConfirmar: (String) -> Unit
) {

    var fechaNueva by remember {

        mutableStateOf(
            "30/06/2026"
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Renovar Reserva",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Libro",
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = nombreLibro,
                fontSize = 21.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Reserva actual",
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(5.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = fechaReserva
                )

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Text(
                    text = "Código: $codigoReserva"
                )
            }
        }

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

        OutlinedTextField(
            value = fechaNueva,

            onValueChange = {
                fechaNueva = it
            },

            modifier = Modifier.fillMaxWidth(),

            label = {
                Text(
                    text = "Fecha nueva"
                )
            },

            singleLine = true
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )

        Button(
            onClick = {

                onConfirmar(
                    fechaNueva
                )
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "Confirmar Renovación"
            )
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Button(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "Volver"
            )
        }
    }
}