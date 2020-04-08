fun multiplyAll(list: List<Int>) = list.fold(1.0) { zzz, previousResult ->
    previousResult * zzz
}

/**
 * Пример главной функции
 */
fun main() {
//    println(multiplyAll(listOf(3, 4, 5)))
    val tstamp = 62703026 / 1000
    println("${tstamp / 3600}:${tstamp % 3600 / 60}:${tstamp % 60}")
}