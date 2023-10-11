open class Human{
    open fun think(){
        println("I am feeling scared")
    }
}

class Alien():Human(){
    override fun think(){
        println("Virtual Thinking")

    }
    

}

fun main(args: Array<String>) {
    var moni=Alien()
    moni.think()


}

