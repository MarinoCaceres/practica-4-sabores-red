package mx.tec.sabores.ui.state

import mx.tec.sabores.domain.RatingSummary
import mx.tec.sabores.domain.Review

/** Los tres estados de cualquier pantalla que dependa de la red. */
sealed interface UiState<out T> {
    val reviews: List<Review>
    val summary: RatingSummary
    val restaurant: Any

    data object Cargando : UiState<Nothing>
    data class Exito<T>(val datos: T) : UiState<T>
    data class Error(val mensaje: String) : UiState<Nothing>
}