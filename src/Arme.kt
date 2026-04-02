class Arme {
    var id:Long?=null
    var nom:String=""
    var degat=1.0
    var type=""
    var prix=0.0
    var  tailleChargeur=10
    var porteMax=100
    var declencheurCritique=60
    //TODO munition

    constructor(id:Long?,nom:String,degat: Double,type: String,prix: Double,tailleC:Int,porte:Int){
        this.id=id
        this.nom=nom
        this.degat=degat
        this.type=type
        this.prix=prix
        this.tailleChargeur=tailleC
        this.porteMax=porte
    }
}