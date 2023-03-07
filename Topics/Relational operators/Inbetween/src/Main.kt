import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    var num2 = scanner.nextInt()
    var num3 = scanner.nextInt()

    if (num2 > num3) {
        val temp = num3
        num3 = num2
        num2 = temp
    }
    println(num1 >= num2 && num1 <= num3)
}
