const val TEN = 10
const val TWENTY = 20
const val FIFTEEN = 15
const val TWENTYFIVE = 25
fun main() {
    val peanutCup = readln().toInt()
    val weekend = readln().toBoolean()

    if (peanutCup >= TEN && peanutCup <= TWENTY && weekend == false) {
        println(true)
    } else if (peanutCup >= FIFTEEN && peanutCup <= TWENTYFIVE && weekend == true) {
        println(true)
    } else {
        println(false)
    }
}