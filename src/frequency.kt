
fun main() {
    val numbers = arrayOf(1, 2, 3, 2, 1, 4, 2, 3, 3, 1)

    val frequencyMap = numbers.groupingBy { it }.eachCount()

    println("Frequency of numbers: $frequencyMap")
}
