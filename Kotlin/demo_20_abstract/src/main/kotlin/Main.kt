abstract class Human{
    abstract fun think()

    //abstact method
    fun talk(){
        println("talking..")
    }
}

class Doctor:Human(){
    override fun think() {
        println("critical thinking")
    }
}

class Alien():Human(){
    override fun think(){
        println("Virtual Thinking")

    }
    

}

fun main(args: Array<String>) {
    var moni : Human =Alien()
    moni.talk()
    moni.think()


}

