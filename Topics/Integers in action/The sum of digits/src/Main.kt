const val TEN = 10

fun main() {
    var suma = 0
    var number = readln().toInt()

    while (number != 0)
    {
       var remainder = number % TEN
        number = number / TEN
        suma += remainder
    }
    println(suma)
}
