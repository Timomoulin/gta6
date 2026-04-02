fun main() {
    var pistolet= Arme(1,"pistolet",10.0,"Petit",500.0,12,50)
    var bazooka= Arme(3,"bazooka",1000.0,"Explosif",500000.0,1,300)
    var pistolet2= Arme(2,"pistolet",-10.0,"Petit",500.0,12,50)
    var tim=Perso(unNom = "Timothée", unPvMax = 100000.0, argent = 2, unId = 1, armes = mutableListOf<Arme>(pistolet,bazooka))
    var harin=Perso(unNom = "Harin", unPvMax = 100.0, argent = 200, unId = 2, armes = mutableListOf<Arme>(pistolet2))


    harin.armes.add(pistolet2)
    harin.choisirUneArme()
    tim.choisirUneArme()
    println(tim.armePrincipale!!.nom)
    harin.tire(tim,10)
    println(tim.pv)
    tim.tire(harin,1)
}