package Juego.SistemaCombate

open class Enemigo(vida:Double=100.00,inventario:ArrayList<Armas> = arrayListOf(),armaEquipada:Armas?,estado:Boolean=false):Persona(vida,inventario, armaEquipada,estado){
    override fun atacar(Humano:Persona): Double {
        this.estado=false//*Lo mismo que en el metodo atacar de Humano
        if (Humano.estado){
            Humano.estado=false
            return Humano.vida}
        this.armaEquipada?.atacar()
        Humano.vida-= this.armaEquipada!!.potenciaFija
        return  Humano.vida
    }


    override fun toString(): String {
        return "        TIPO ENEMIGO BASICO \n"+super.toString()
    }
}