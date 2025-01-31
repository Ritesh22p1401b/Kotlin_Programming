import java.util.*;

fun main() {
    val read = Scanner(System.`in`)
    println("Enter the number of array element")
    val n = read.nextInt()
    val arr = Array(n){
        read.nextInt()
    }
    var max = arr[0]
    var min = arr[0]

    for(num in arr){
        if(num<min){
            min = num
        }
        if(num>max){
            max=num
        }
    }
    println(min)
    println(max)
}
