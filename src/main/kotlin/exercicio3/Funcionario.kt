package exercicio3

import exercicio2.Contato

class Funcionario (val id:String,
                          val nome: String,
                          val cpf: String,
                          val salario: Double) {

    val listaFuncionarios: MutableList<Contato> = mutableListOf()

    fun salvarFuncionario(funcionario: Funcionario) {
        listaFuncionarios.add(funcionario)
        println("Funcionario Salvo")
    }

}