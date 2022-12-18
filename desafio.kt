enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome : String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) :Boolean {
        return inscritos.add(usuario)
    }
}

fun main() {

    val conteudos : List<ConteudoEducacional> = listOf(ConteudoEducacional("Kotlin fundamentos", 12, Nivel.BASICO), ConteudoEducacional("Kotlin funcoes", 6, Nivel.
    BASICO), ConteudoEducacional("Kotlin avançado", 10, Nivel.AVANCADO), ConteudoEducacional("Kotlin desafio", 2, Nivel.INTERMEDIARIO))

    val formacao = Formacao("Denselvovedor Kotlin", conteudos)

    formacao.matricular(Usuario("Pedro Silva"))
    formacao.matricular(Usuario("Ana Paula"))
    formacao.matricular(Usuario("Gustava"))
    formacao.matricular(Usuario("Elias"))

    formacao.inscritos.map { println(it.nome)}
}
