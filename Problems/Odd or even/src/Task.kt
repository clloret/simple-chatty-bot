import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nextInt = scanner.nextInt()
    if (nextInt % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}