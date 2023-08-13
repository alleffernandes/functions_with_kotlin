import kotlin.math.pow


fun main() {
    getAnos(anos = 2)
    println("Tem ${caracteresDaString("Allef")} caracteres")
    println("Seu cubo é ${cubo(valor = 3.0)}")
    println("${conversorDeDistancia(1.6)} milhas de distância")
    println("${trocaLetra("A Dona Aranha Subiu Pela Parede, Veio a Chuva Forte e à Derrubou")}")

}

fun getAnos(anos: Int): String {
    val meses: Int = anos * 12
    val dias: Int = anos * 365
    val horas: Int = dias * 24
    val minutos: Int = horas * 60
    val segundos: Int = minutos * 60

    return "${println("$anos ano(s) tem $meses meses, $dias dias, $horas horas, $minutos minutos e $segundos segundos")}"
}

fun caracteresDaString(nome: String) : String ="${nome.length}"

fun cubo(valor: Double): Double = valor.pow(valor)

fun conversorDeDistancia(mh: Double): Double = 1.6 / mh

fun trocaLetra(frase: String): String = frase.replace( oldValue = "a", newValue = "x", ignoreCase = true).lowercase()
