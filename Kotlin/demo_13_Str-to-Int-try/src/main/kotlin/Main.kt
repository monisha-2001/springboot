

fun main(args: Array<String>) {

    //str to Int

    var str : String = "4"

    var num : Int =str.toInt()

    num++

    println(num)

    //try expr
    var str1 : String = "4a"

    var num1 : Int = try {
        str1.toInt()
    }
    catch (e : NumberFormatException){
        -1
    }
    num1++  //-1++ = 0
    println(num1)
}

