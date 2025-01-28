import java.util.*;

fun main() {
    val read = Scanner(System.`in`)
    println("Enter the number of array element")
    val n = read.nextInt()
    val arr = Array(n){
        read.nextInt()
    }
    for (i in 0 until n - 1) {
        var swapped = false
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }
        // If no two elements were swapped in the inner loop, the array is sorted
        if (!swapped) break
    }
    println("Min ${arr.first()} ")
    println("Max ${arr.last()}")
}
