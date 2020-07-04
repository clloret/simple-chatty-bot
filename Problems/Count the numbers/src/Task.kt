import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()

    var number = 0
    for (i in a..b) {
        val mod = i % n
        if (mod == 0) {
            number++
        }
    }
    println(number)
}