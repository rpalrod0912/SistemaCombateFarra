package Juego.SistemaCombate

open class Humano(vida:Double=100.0,inventario:ArrayList<Armas> = arrayListOf(), armaEquipada:Armas,estado:Boolean=false):Persona(vida, inventario, armaEquipada,estado) {

    override fun atacar(Enemigo:Persona):Double {
        if (Enemigo.estado){
            Enemigo.estado=false
            return Enemigo.vida
        }
        this.armaEquipada?.atacar()
        Enemigo.vida-=this.armaEquipada!!.potencia
        return Enemigo.vida
    }

    override fun toString(): String {
        return "        TIPO HUMANO BASICO \n"+super.toString()
    }
}

fun main(){
    val miHumano=Humano(vida =140.00, arrayListOf(Cuchillo(),Rifle()), armaEquipada = Hacha(potencia = 90.00, afilada = false,filos=2))
    val miEnemigo=Enemigo(vida=140.00,inventario = arrayListOf(Cuchillo(),Rifle()), armaEquipada = Cuchillo())
    //println(miHumano.atacar(miEnemigo))
    /*println(miEnemigo.atacar(miHumano))
    println(miHumano)
    println(miEnemigo)
    miHumano.añadeArma(Rifle(cargada = false))
    miHumano.armaEquipada=Rifle(cargada = false)
    miHumano.atacar(miEnemigo)
    (miHumano.armaEquipada as Rifle).cargar()
    miHumano.atacar(miEnemigo)
    println(miEnemigo)//
    println(miHumano.atacar(miEnemigo))
    println(miEnemigo)
    (miHumano.armaEquipada as Rifle).cargar()
    println(miHumano.atacar(miEnemigo))
    println(miEnemigo)*/
    miEnemigo.defender()
    miHumano.atacar(miEnemigo)
    println(miEnemigo)
    miHumano.atacar(miEnemigo)
    println(miEnemigo)
}