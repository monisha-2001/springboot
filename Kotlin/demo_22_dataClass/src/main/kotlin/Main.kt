data class Laptop(val brand:String,val price:Int){

    fun show(){
        println("Awesome laptop")
    }
}
fun main(args: Array<String>) {

    var lap1 = Laptop("dell",50000)
    var lap2 = Laptop("Lenovo",70000)

    println(lap1)

    var lap3 = lap2.copy()

    println(lap3)

}

