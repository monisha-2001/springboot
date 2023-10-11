fun main(args: Array<String>) {

    var num=1 .. 5
    for (i in num){
        println(i)
    }

    var num1=1 until 11 //include 1 and exclude 11
    for (i in num1.reversed()){
        println(i)
    }

    var num2=16 downTo 1
    for (a in num2 step 2){
        println(a)
    }
    println("The Count is : ${num2.count()}")

    var ch='A'..'z'
    for (a in ch){
        println(a)
    }
    println("The count is ${ch.count()}")


}