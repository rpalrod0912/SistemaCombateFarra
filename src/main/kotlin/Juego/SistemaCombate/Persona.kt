package Juego.SistemaCombate

abstract class Persona(var vida:Double,var inventario:ArrayList<Armas> = arrayListOf(),var armaEquipada:Armas,var estado:Boolean) {

    open fun añadeArma(arma:Armas):String{
        var mensaje="EL INVENTARIO HA SIDO ACTUALIZADO"
        if (inventario.size<=5) this.inventario.add(arma)
        else mensaje="NO TIENES HUECO EN EL INVENTARIO, TIRA EL ARMA PARA AÑADIR OTRO OBJETO"
        return mensaje
    }

    open fun retiraArma(arma:Armas):String{
        val mensaje="EL INVENTARIO HA SIDO ACTUALIZADO, TIENES ESPACIO LIBRE"
        inventario.remove(arma)
        return mensaje
    }
    abstract fun atacar(objetivo:Persona):Double

    fun defender():Boolean{
        if (!this.estado) {
            this.estado = true
        }
        return  this.estado
    }
    override fun toString(): String {
        return """
    VIDA :${this.vida}
    INVENTARIO: Tienes ${inventario.size} objetos en el inventario
        """.trimIndent()
    }
}