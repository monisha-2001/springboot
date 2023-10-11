fun main(args: Array<String>) {

    val num : Int = 1

    var result = when(num){
        1 -> "One"
        2-> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println("String is $result")
}