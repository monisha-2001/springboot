
fun main(args: Array<String>) {

//    var values = listOf<Int>(1,3,5,7)
var values = mutableListOf(1,3,5,7)


    for (i in values){
        println(i)

    }

    println(values.get(0))

    //to add a new value it is not supported by listof, so we use mutableListOf
    values.add(9)

    values.add(0,11)

    println(values)

}

