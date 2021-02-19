package Curso.Testes

import Curso.Analista
import Curso.Funcionario
import Curso.Gerente
import Curso.Pessoa
import java.math.BigDecimal

fun main (){

    val maria = Gerente ("Kamila Souza",   "123.456.789-10", 4000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

TesteAutenticacao().autentica(maria)
}
