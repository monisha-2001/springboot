

fun main(args: Array<String>) {

    var a1 = Alien()

    a1.skills="Java"
    a1.show()

    var a2 = Alien()
    a2.skills="Kotlin"
    a2.show()

    var a3 = a1.plus(a2)
    a3.show()
}

fun Alien.plus(a:Alien):Alien
{
    var newAlien=Alien();
    newAlien.skills=this.skills + " " + a.skills  //here this is a1(see line 14 and a is a2
    return newAlien
}

