package com.example.misreservas.ui.theme.navigation

import android.net.Uri

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.example.misreservas.ui.theme.DetalleReservaScreen
import com.example.misreservas.ui.theme.MisReservasScreen
import com.example.misreservas.ui.theme.RenovacionExitosaScreen
import com.example.misreservas.ui.theme.RenovarReservaScreen

object Rutas {

    const val MIS_RESERVAS = "mis_reservas"

    const val DETALLE_RESERVA =
        "detalle_reserva/{nombreLibro}/{fechaReserva}/{codigoReserva}"

    const val RENOVAR_RESERVA =
        "renovar_reserva/{nombreLibro}/{fechaReserva}/{codigoReserva}"

    const val RENOVACION_EXITOSA =
        "renovacion_exitosa/{nombreLibro}/{fechaNueva}"
}

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Rutas.MIS_RESERVAS
    ) {

        composable(Rutas.MIS_RESERVAS) {

            MisReservasScreen(
                onVerReserva = {

                    val nombreLibro = Uri.encode("Clean Code")
                    val fechaReserva = Uri.encode("15/06/2026")
                    val codigoReserva = Uri.encode("RES-2026-001")

                    navController.navigate(
                        "detalle_reserva/$nombreLibro/$fechaReserva/$codigoReserva"
                    )
                }
            )
        }

        composable(
            route = Rutas.DETALLE_RESERVA,
            arguments = listOf(
                navArgument("nombreLibro") {
                    type = NavType.StringType
                },
                navArgument("fechaReserva") {
                    type = NavType.StringType
                },
                navArgument("codigoReserva") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val nombreLibro =
                backStackEntry.arguments?.getString("nombreLibro") ?: ""

            val fechaReserva =
                backStackEntry.arguments?.getString("fechaReserva") ?: ""

            val codigoReserva =
                backStackEntry.arguments?.getString("codigoReserva") ?: ""

            DetalleReservaScreen(
                nombreLibro = nombreLibro,
                fechaReserva = fechaReserva,
                codigoReserva = codigoReserva,

                onBack = {
                    navController.popBackStack()
                },

                onRenovar = {

                    navController.navigate(
                        "renovar_reserva/" +
                                Uri.encode(nombreLibro) + "/" +
                                Uri.encode(fechaReserva) + "/" +
                                Uri.encode(codigoReserva)
                    )
                }
            )
        }

        composable(
            route = Rutas.RENOVAR_RESERVA,
            arguments = listOf(
                navArgument("nombreLibro") {
                    type = NavType.StringType
                },
                navArgument("fechaReserva") {
                    type = NavType.StringType
                },
                navArgument("codigoReserva") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val nombreLibro =
                backStackEntry.arguments?.getString("nombreLibro") ?: ""

            val fechaReserva =
                backStackEntry.arguments?.getString("fechaReserva") ?: ""

            val codigoReserva =
                backStackEntry.arguments?.getString("codigoReserva") ?: ""

            RenovarReservaScreen(
                nombreLibro = nombreLibro,
                fechaReserva = fechaReserva,
                codigoReserva = codigoReserva,

                onBack = {
                    navController.popBackStack()
                },

                onConfirmar = { fechaNueva ->

                    navController.navigate(
                        "renovacion_exitosa/" +
                                Uri.encode(nombreLibro) + "/" +
                                Uri.encode(fechaNueva)
                    )
                }
            )
        }

        composable(
            route = Rutas.RENOVACION_EXITOSA,
            arguments = listOf(
                navArgument("nombreLibro") {
                    type = NavType.StringType
                },
                navArgument("fechaNueva") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val nombreLibro =
                backStackEntry.arguments?.getString("nombreLibro") ?: ""

            val fechaNueva =
                backStackEntry.arguments?.getString("fechaNueva") ?: ""

            RenovacionExitosaScreen(
                nombreLibro = nombreLibro,
                fechaNueva = fechaNueva,

                onVolver = {

                    navController.navigate(Rutas.MIS_RESERVAS) {
                        popUpTo(Rutas.MIS_RESERVAS) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}