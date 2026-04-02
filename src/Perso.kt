import kotlin.random.Random

class Perso {
    var id: Long? = null
    var nom:String=""
    var pv: Double=1.0
    var pvMax: Double=100.0
    var argent=1000000

    var armes: MutableList<Arme> = mutableListOf()
    var armePrincipale:Arme?=null

    constructor(){

    }

    constructor(unId: Long?,unNom:String,unPvMax:Double,argent: Int, armes: MutableList<Arme>){
        this.id=unId
        this.nom=unNom
        this.pv=unPvMax
        this.pvMax=unPvMax
        this.argent=argent

        this.armes=armes

    }

    fun choisirUneArme(){
        var numArme=0
        for (uneArme in this.armes){
            println(" $numArme => ${uneArme.nom}")
            numArme++
        }
        println("Choisir une arme")
        var num=readln().toInt()
        this.armePrincipale=this.armes[num]
    }

    fun tire(cible:Perso,distance: Int){
        if (this.armePrincipale!=null){
            var degats= this.armePrincipale!!.degat
            var nbCritique= Random.nextInt(100)
            if (nbCritique> this.armePrincipale!!.declencheurCritique){
                degats*=5
            }
            if (distance<this.armePrincipale!!.porteMax){
                cible.pv-=degats
                println("${this.nom} tire sur ${cible.nom} il lui inflinge ${degats} PV")
            }
        }

        return

    }
}