

fun main(args: Array<String>) {

//    var result = calcAmount(50,0.04)
    var result = calcAmount(50)
    println(result)

}

@JvmOverloads //this is for java, where we need to give only one value
fun calcAmount(amt : Int,interest : Double=0.03) : Int{
    return (amt+amt*interest).toInt()

}

