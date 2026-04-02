fun main() {
    //Les armes
    var pistolet= Arme(1,"pistolet",10.0,"Petit",500.0,12,50)
    var bazooka= Arme(3,"bazooka",1000.0,"Explosif",500000.0,1,300)
    var uzi= Arme(2,"uzi",5.0,"Petit",500.0,12,50)
    //Les persos
    var tim=Perso(unNom = "Timothée", unPvMax = 100000.0, argent = 2, unId = 1, armes = mutableListOf<Arme>(pistolet,bazooka))
    var mechant=Perso(unNom = "mechant 1", unPvMax = 100.0, argent = 200, unId = 2, armes = mutableListOf<Arme>(uzi))

    // Ajout d'une arme supplémentaire au méchant
    mechant.armes.add(uzi)

    // Choix des armes principales
    mechant.changerArmePrincipale()
    tim.changerArmePrincipale()

    // Affichage de l'arme sélectionnée
    println(tim.armePrincipale!!.nom)

    // Simulation d'un combat
    mechant.tire(tim, 10)
    println(tim.pv)

    tim.tire(mechant, 1)
}