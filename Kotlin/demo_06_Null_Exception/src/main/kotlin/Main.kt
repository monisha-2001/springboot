fun main(args: Array<String>) {
    var str : String? = null

    var tittu = Alien()

    tittu.name = "Monisha"

    println(tittu.name)

    //to use other func like length,we need to use ? before (.length) as name is null
    println(tittu.name?.length)

    //our own custom code
    var naam : Alien? = Alien()
    naam=null
    println(naam)

    //to use any method with naam,again we need to put ?
    println(naam?.name)

}