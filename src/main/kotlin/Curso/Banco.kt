package Curso

data class Banco(
    val name: String,
    val numero: Int
) {
    fun info() = "$name + $numero"
}
