import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat (n) {
        when(scanner.nextInt()) {
            1 -> larger++
            0 -> perfect++
            -1 -> smaller++
        }
    }

    println("$perfect $larger $smaller")
}