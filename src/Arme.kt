/**
 * Représente une arme utilisable par un personnage.
 */
class Arme {
    /** Identifiant de l'arme */
    var id: Long? = null
    /** Nom de l'arme */
    var nom: String = ""
    /** Dégâts de base infligés */
    var degat = 1.0
    /** Type d'arme (ex: pistolet, explosif…) */
    var type = ""
    /** Prix de l'arme */
    var prix = 0.0
    /** Nombre de munitions dans un chargeur */
    var tailleChargeur = 10
    /** Portée maximale de l'arme */
    var porteMax = 100
    /** Seuil de déclenchement d'un coup critique */
    var declencheurCritique = 60

    // TODO : Ajouter la gestion des munitions

    /**
     * Constructeur principal de l'arme.
     *
     * @param id identifiant de l'arme
     * @param nom nom de l'arme
     * @param degat dégâts de base
     * @param type type d'arme
     * @param prix prix de l'arme
     * @param tailleC taille du chargeur
     * @param porte portée maximale
     */
    constructor(
        id: Long?,
        nom: String,
        degat: Double,
        type: String,
        prix: Double,
        tailleC: Int,
        porte: Int
    ) {
        this.id = id
        this.nom = nom
        this.degat = degat
        this.type = type
        this.prix = prix
        this.tailleChargeur = tailleC
        this.porteMax = porte
    }
}