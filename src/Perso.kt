import kotlin.random.Random
/**
 * Représente un personnage du jeu (joueur ou ennemi).
 * Un personnage possède des points de vie, de l'argent et des armes.
 */
class Perso {
    /** Identifiant unique du personnage (peut être null) */
    var id: Long? = null
    /** Nom du personnage */
    var nom: String = ""
    /** Points de vie actuels */
    var pv: Double = 1.0
    /** Points de vie maximum */
    var pvMax: Double = 100.0
    /** Argent du personnage */
    var argent = 1000000
    /** Liste des armes possédées par le personnage */
    var armes: MutableList<Arme> = mutableListOf()
    /** Arme actuellement équipée (peut être null) */
    var armePrincipale: Arme? = null

    /**
     * Constructeur vide
     */
    constructor() {

    }
    /**
     * Constructeur principal permettant d'initialiser un personnage.
     *
     * @param unId identifiant du personnage
     * @param unNom nom du personnage
     * @param unPvMax points de vie maximum
     * @param argent argent initial
     * @param armes liste des armes possédées
     */
    constructor(unId: Long?, unNom: String, unPvMax: Double, argent: Int, armes: MutableList<Arme>) {
        this.id = unId
        this.nom = unNom
        // Les PV actuels sont initialisés au maximum
        this.pv = unPvMax
        this.pvMax = unPvMax
        this.argent = argent
        this.armes = armes

    }
    /**
     * Permet de choisir l'arme principale parmi la liste des armes.
     * L'utilisateur sélectionne un index via la console.
     */
    fun changerArmePrincipale() {
        var numArme = 0
        var choixNum=99
        do {
            // Affichage des armes disponibles
            for (uneArme in this.armes) {
                println(" $numArme => ${uneArme.nom}")
                numArme++
            }
            println("Choisir une arme")
            choixNum = readln().toInt()
        }
        //Tant que num n'est pas un index de la liste d'arme on recommence
        while (choixNum !in this.armes.indices)
        // Attribution de l'arme choisie
        this.armePrincipale = this.armes[choixNum]
    }

    /**
     * Permet de tirer sur une cible avec l'arme principale.
     *
     * @param cible personnage visé
     * @param distance distance entre le tireur et la cible
     */
    fun tire(cible: Perso, distance: Int) {
        if (this.armePrincipale != null) {
            var degats = this.armePrincipale!!.degat
            var nbCritique = Random.nextInt(100)
            if (nbCritique > this.armePrincipale!!.declencheurCritique) {
                degats *= 5
            }
            if (distance < this.armePrincipale!!.porteMax) {
                cible.pv -= degats
                println("${this.nom} tire sur ${cible.nom} il lui inflinge ${degats} PV")
            }
        }
        return

    }
    fun estVivant(): Boolean{
        //TODO
        return true
    }

    fun rechargerArmePrincipale(){
        //TODO
    }

    fun rechargerListeArme(){
        //TODO
    }
}