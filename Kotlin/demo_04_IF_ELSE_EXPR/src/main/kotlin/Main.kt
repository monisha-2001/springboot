fun main(args: Array<String>) {
    var num1 : Int = 4

    var num2 : Int = 5

    var result : Int = 0

    result = if (num1 > num2)
        num1
    else
        num2

    println(result)


    result=if (num1>num2)
        num1
      else if(num1<num2)
        num2
    else
        0
    println(result)
}