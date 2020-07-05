import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val radio = scanner.nextDouble()

    val pi = 3.1415
    val area = pi * radio.pow(2)

    println(area)
}