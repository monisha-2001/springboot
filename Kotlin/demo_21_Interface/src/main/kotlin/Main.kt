interface A{
    fun show()

    fun abc(){
        println("abc in A")
    }
}

interface B{
    fun display()

    fun abc(){
        println("abc in B")
    }
}

class C : A,B //class C implements(:) A and B (multiple inheritance)
{
    override fun show() {
        println("show the magic")
    }

    override fun display() {
        println("display the adventure")
    }

    //when we have two methods same in both the interface,then we define own method to override both
    override fun abc(){
//        println("abc in C")

        //to get the method displayed in interface A or B we use "generic"
        super<A>.abc()
    }


}


fun main(args: Array<String>) {
    var inter = C()
    inter.show()
    inter.display()
    inter.abc()
}

