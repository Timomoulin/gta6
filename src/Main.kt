fun main() {

    //Les munitions
    var munition1= Munition(1,"9mm",120)
    var munition2= Munition(2,"roquette",12)
    var munition3= Munition(3,"7,47mm",200)
    var munution4= Munition(4,"5,56mm",100)
    //Les armes
    var pistolet= Arme(1,"pistolet",10.0,"Petit",500.0,12,50,munition1)
    var bazooka= Arme(3,"bazooka",1000.0,"Explosif",500000.0,1,300,munition2)
    var uzi= Arme(2,"uzi",5.0,"Petit",500.0,12,50,munition1)
    var ak47= Arme(4,"ak",12.0,"Grand",1500.0,30,200,munition3)
    var m4= Arme(5,"m4",10.0,"Grand",2500.0,40,300,munution4)



    //Les persos
    var tim=Perso(unNom = "Timothée", unPvMax = 100000.0, argent = 2, unId = 1, armes = mutableListOf<Arme>(pistolet,bazooka))
    var mechant=Perso(unNom = "mechant 1", unPvMax = 100.0, argent = 200, unId = 2, armes = mutableListOf<Arme>(uzi))
    var toto=Perso(unNom = "toto", unPvMax = 150.0, argent = 200, unId = 3, armes = mutableListOf<Arme>(ak47,m4))
    // Ajout d'une arme supplémentaire au méchant
    mechant.armes.add(uzi)

    // Choix des armes principales
    mechant.changerArmePrincipale()
    tim.changerArmePrincipale()

    // Affichage de l'arme sélectionnée
    tim.afficheDetail()
    mechant.afficheDetail()

    // Simulation d'un combat
    mechant.tire(tim, 10)

    tim.afficheDetail()
    mechant.afficheDetail()

    tim.tire(mechant, 1)
}