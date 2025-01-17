import java.util.*;
import kotlin.math.sqrt

fun main(){
    val reader = Scanner(System.`in`)
    println("enter the value of a")
    val a =reader.nextDouble()
    println("enter the value of b")
    val b = reader.nextDouble()
    println("enter the value of c ")
    val c= reader.nextDouble()
    findRoots(a, b, c)

}
// Function to find and display the roots of the quadratic equation
fun findRoots(a: Double, b: Double, c: Double) {
//    finding the discriminant
    val d = b * b - 4 * a * c
    if (d > 0) {
        // Two real and distinct roots
        val root1 = (-b + sqrt(d)) / (2 * a)
        val root2 = (-b - sqrt(d)) / (2 * a)
        println("Two real and distinct roots: $root1 and $root2")
    }
    else if (d == 0.0) {
        // One real root (repeated)
        val root = -b / (2 * a)
        println("One real root: $root")
    }
    else {
        // Complex roots (when discriminant is negative)
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-d) / (2 * a)
        println("Complex roots: $realPart + ${imaginaryPart}i and $realPart - ${imaginaryPart}i")
    }
}

