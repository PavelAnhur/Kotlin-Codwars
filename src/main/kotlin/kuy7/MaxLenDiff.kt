package kuy7

fun main() {
    val a1 = arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    val a2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    println(maxDiffLen(a1, a2))
}

fun maxDiffLen(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1

    val maxList = mutableListOf<Int>()
    var maxDiff = 0
    var absValue: Int
    for (strFromA1 in a1) {
        for (strFromA2 in a2) {
            absValue = kotlin.math.abs(strFromA1.length - strFromA2.length)
            if (absValue > maxDiff) {
                maxDiff = absValue
            }
        }
        maxList.add(maxDiff)
    }

    return maxList.maxOf { it }
}
