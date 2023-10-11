import java.math.BigInteger

fun main(args: Array<String>) {

    var num = 5
    println(fact(num))

    //for big integer
    var num1 = BigInteger("70")
    println(fact(num1))


    var factor = 1

    for(i in 1 .. num){
        factor = factor * i
    }
    println(factor)
}


//using recursion
fun fact(num : Int):Int
{
    if(num == 0)
        return 1;
    else
        return num * fact(num-1)  //5*4! -> 4*3! -> 3*2! -> 2*1!
}

//using BigInteger
fun fact(num1 : BigInteger) : BigInteger
{
    if(num1 == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num1 * fact(num1- BigInteger.ONE)
}
