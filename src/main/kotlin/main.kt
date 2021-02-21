import exercicio1.Pessoa
import exercicio2.Agenda
import exercicio2.Contato
import exercicio3.Funcionario

fun main() {

    val p1 = Pessoa()
    val nomePessoa = (p1.getNome(p1.nome1))
    val nascimentoPessoa = (p1.getNascimento(p1.nascimento1))
    val alturaPessoa = (p1.getAltura(p1.altura1))
    val anoNascimentoPessoa = (p1.getAnoNascimento(p1.anoNascimento1))
    val idadePessoa = (p1.getIdade(p1.idade1))

    println(nomePessoa)
    println(nascimentoPessoa)
    println(alturaPessoa)
    println(anoNascimentoPessoa)
    println(idadePessoa)

    println("$nomePessoa nasceu em $nascimentoPessoa, tem $idadePessoa anos e possui $alturaPessoa m de altura.")


}

fun main(){

    val agenda1 = Agenda()
    val contato1 = Contato("Fer", "123")
    val contato2 = Contato ("jose","983098")
    val contato3 = Contato("fran", "9999999")
    val contato4 = Contato ("joao","898087")
    val contato5 = Contato ("joao","566765")

    agenda1.salvarContato(contato1)
    agenda1.removeContato(contato2)
    agenda1.buscarContato(contato4)
    println(agenda1.listaContatos)
  }

fun main(funcionario: Funcionario) {
    val funcionario1 = Funcionario(123,"José","7896545",2000)

    funcionario1.salvarFuncionario(funcionario)
}