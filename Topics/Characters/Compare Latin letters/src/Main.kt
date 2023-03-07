fun main() {
    val letter1 = readln().first()
    val letter2 = readln().first()

    if(letter1.lowercase() == letter2.lowercase()){
        println("true")
    } else {
        println("false")
    }
}