import java.util.*
import kotlin.math.pow

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter a number")
    var num = reader.nextInt()
    var c=0
    var s=0
    var number=num
    while(num!=0){
        c += 1
        num /= 10
    }
    val n=number
    while(number!=0){
        val r=number%10
        s += r.toDouble().pow(c.toDouble()).toInt()
        number /= 10
    }
    if (s == n)
        println("$n is an Armstrong number.")
    else
        println("$n is not an Armstrong number.")
}

