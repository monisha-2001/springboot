open class Human(){
    fun think(){
        println("I am feeling scared")
    }
}

class Alien():Human(){


}

fun main(args: Array<String>) {
    var moni=Alien()
    moni.think()


}

