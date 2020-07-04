import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    var product = 1L
    for (i in a..b - 1) {
        product *= i
    }
    println(product)
}