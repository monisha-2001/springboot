data class Alien(var name:String,var points :Int)

fun main(args: Array<String>) {

    var aliens = listOf<Alien>(Alien("monisha",60),Alien("moni",50))


    for (alien in aliens){
        println(alien)
    }


}

