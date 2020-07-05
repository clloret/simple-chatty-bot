import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val isPositive = if (number > 0) "YES" else "NO"
    println(isPositive)
}