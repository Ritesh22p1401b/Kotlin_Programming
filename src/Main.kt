fun main() {
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

    riversArray += "Mississippi"
    println(riversArray.joinToString())

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    // Creates an Array<Int> that initializes with zeros [0, 0, 0]
    val initArray: Array<Int> = Array<Int>(3) { 0 }
    println(initArray.joinToString())


// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }
    println()
    

    val lettersArray = arrayOf("c", "d")
    printAllStrings("a", "b", *lettersArray)

}

fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
}
