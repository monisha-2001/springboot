import java.util.TreeMap

fun main(args: Array<String>) {

    //LISTS

    var num= listOf(1,2,3,4)

    for (i in num){
        println(i)
    }

    for ((i,e) in num.withIndex()){
        println("$i : $e")
    }


    //MAPS
    var aliens=TreeMap<String,Int>()
    aliens["Manoj"]=20
    aliens["gautham"]=10

    //to print this we use for with tuple how we used for no with index
    for ((name,age) in aliens){
        println("$name : $age")
    }
}