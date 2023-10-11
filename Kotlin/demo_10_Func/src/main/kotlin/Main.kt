import java.util.TreeMap

fun main(args: Array<String>) {
    sum(4,6)

    var result=add(8,1)
    println(result)

    var res=ad(2,3)
    println(res)

    var m=max(31,6)
    println(m)


}

fun sum(num1:Int,num2:Int){
    println(num1+num2)
}

//instead of println use return -> a good practice
fun add(a:Int,b:Int):Int{
    return a+b
}

//In one line
fun ad(a:Int,b:Int):Int=a+b

fun max(a:Int,b:Int):Int=if(a>b) a else b