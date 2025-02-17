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
fun main() {
    val num_casos = readln().toInt()
    val secuencias= generateSequence {
        val linea = readln()
        if (linea != "0") linea else null
    }.take(num_casos)
    secuencias.forEach {
        val (insectos, aracnidos, crustaceos, escolopendras, anillos) = it.split(" ").map { it.toInt() }
        println(insectos*6+aracnidos*8+crustaceos*10+escolopendras*anillos*2)
    }
}