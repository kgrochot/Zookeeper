fun main() {
    var a = readln().toInt()
    if (a % 2 != 0) {
        a += 1
    } else {
        a += 2
    }
    println(a)
}
