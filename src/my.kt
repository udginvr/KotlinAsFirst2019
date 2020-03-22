fun multiplyAll(list: List<Int>) = list.fold(1.0) { zzz, previousResult ->
    previousResult * zzz
}

/**
 * Пример главной функции
 */
fun main() {
    println(multiplyAll(listOf(3, 4, 5)))
}