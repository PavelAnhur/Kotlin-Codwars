package kyu6

fun main() {
    println(solution(200))
    println(bestSolution(200))
}

fun solution(number: Int): Int {
    if (number <= 0) return 0

    val numbersMult3 = mutableListOf<Int>()
    val numbersMult5 = mutableListOf<Int>()

    var counter = number

    while (counter-- > 3) {
        if (counter % 3 == 0) {
            numbersMult3.add(counter)
        }
        if (counter % 5 == 0) {
            numbersMult5.add(counter)
        }
    }

    val setNumbers = numbersMult3.union(numbersMult5)

    return setNumbers.sum()
}

fun bestSolution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()