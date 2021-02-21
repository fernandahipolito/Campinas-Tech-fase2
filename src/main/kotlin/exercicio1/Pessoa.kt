package exercicio1

class Pessoa(
    private val nome: String = "Fernanda",
    private val nascimento: String = "14/04/1978",
    private val altura: Double = 1.56,
    private val anoNascimento: Int = 1978,
    val idade: Int = (2021 - (anoNascimento))) {


        val nome1 = nome
        val nascimento1 = nascimento
        val altura1 = altura
        val anoNascimento1 = anoNascimento
        val idade1 = idade

        fun getAltura(altura1: Double): Double {
            return altura1
        }

        fun getNascimento(nascimento1: String): String {
            return nascimento1
        }

        fun getNome(nome1: String): String {
            return nome1
        }

        fun getAnoNascimento(anoNascimento1: Int): Int {
            return anoNascimento1
        }

        fun getIdade(idade1: Int): Int {
            return idade1
        }
    }
