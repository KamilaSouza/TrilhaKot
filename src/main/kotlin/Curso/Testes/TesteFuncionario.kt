package Curso.Testes

import Curso.Funcionario
import Curso.Pessoa
import java.math.BigDecimal

fun main (){
    val kamila = Pessoa( nome = "Kamila Souza", cpf = "123.456.789-10")
    println(kamila.nome)
    println(kamila.cpf)


    val joao = Funcionario("Kamila Souza", "123.456.789-10", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}