import kotlin.math.ceil
import kotlin.math.round

// Lado de la calle
//fun main() {
//    val secuencias= generateSequence {
//        val linea = readln()
//        if (linea != "0") linea else null
//    }
//    secuencias.forEach {
//       if (it.toInt()%2==0) println("DERECHA") else println("IZQUIERDA")
//    }
//}

// Artropodos
//fun main() {
//    val num_casos = readln().toInt()
//    val secuencias= generateSequence {
//        val linea = readln()
//        if (linea != "0") linea else null
//    }.take(num_casos)
//    secuencias.forEach {
//        val (insectos, aracnidos, crustaceos, escolopendras, anillos) = it.split(" ").map { it.toInt() }
//        println(insectos*6+aracnidos*8+crustaceos*10+escolopendras*anillos*2)
//    }
//}

// cociendo huevos
//fun main(){
//    val secuencias= generateSequence {
//        val linea= readln()
//        if (linea != "0 0") linea else null
//    }
//    secuencias.forEach {
//        val (huevos, capacidad) = it.split(" ").map { it.toDouble() }
//        val veces = huevos/capacidad
//        println(ceil(veces).toInt()*10)
//    }
//}

// contando en la arena
//fun main(){
//    val secuencias= generateSequence {
//        val num_unos= readln().toInt()
//        if (num_unos!=0) "1".repeat(num_unos) else null
//    }
//    secuencias.forEach { println(it) }
//}

// El dia de navidad
fun main() {
    val num_casos = readln().toInt()
    val secuencias= generateSequence {
        val linea = readln()
        linea
    }.take(num_casos)
    secuencias.forEach {
        if (it=="25 12") println("SI") else println("NO")
    }
}