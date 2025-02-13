fun main() {
    val secuencias= generateSequence {
        val linea = readln()
        if (linea != "0") linea else null
    }
    secuencias.forEach {
       if (it.toInt()%2==0) println("DERECHA") else println("IZQUIERDA")
    }
}