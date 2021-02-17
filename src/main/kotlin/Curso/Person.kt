package Curso

class person {
    var name: String = "Kamila"
    var cpf: String = "123.456.789-00"
        private set

constructor()

    fun infopessoa () = "$name e $cpf"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main (){
    val kamila = person()
    println(kamila.infopessoa())
    println(kamila.Endereco().rua)
}

