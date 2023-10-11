class Human(var n:String){

    var age:Int=0
    var name:String=n


    constructor(age:Int,name:String):this(name) //this(name is a primary constructor,in 2nd constructor,1st constructor is also required
    {
        this.age=age
    }
    fun think()
    {
        println("kotlin is awesome $name : $age")
    }
}

fun main(args: Array<String>) {
    var navin = Human(22,"Monisha")
    navin.think()

}

