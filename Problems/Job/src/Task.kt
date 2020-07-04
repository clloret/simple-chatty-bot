import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nextInt = scanner.nextInt()

    val validRange = 18..59
    val valid = nextInt in validRange
    println(valid.toString())
}