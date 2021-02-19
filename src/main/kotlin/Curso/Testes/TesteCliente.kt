package Curso.Testes

import Curso.Cliente
import Curso.ClienteTipo


fun main() {
    val jose = Cliente(
        nome = "jose da silva",
        cpf = "12345678910",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"

    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}