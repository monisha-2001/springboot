class Human(var n:String){

    fun think()
    {
        var name:String=n
        println("kotlin is awesome $name")
    }
}

fun main(args: Array<String>) {
    var navin = Human("Monisha")
    navin.think()

}

