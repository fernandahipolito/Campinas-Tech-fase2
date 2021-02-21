package exercicio2

class Agenda {
    val listaContatos: MutableList<Contato> = mutableListOf()

    fun salvarContato(contato: Contato){
        listaContatos.add(contato)
        println("Contato Salvo")
    }

    fun removeContato (contato: Contato) {
        if (contato in listaContatos){
            listaContatos.remove(contato)
        println("Contato removido")
        }else{
            println("Contato não existe")
        }
    }
    fun buscarContato (contato: Contato) {
        if (contato in listaContatos) {
            listaContatos.contains(contato)
            println(contato)
        } else {
            println("Contato não encontrado")
        }
    }
}