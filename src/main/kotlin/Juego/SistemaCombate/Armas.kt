package Juego.SistemaCombate

open class Armas(var potencia:Double) {
    open var potenciaFija=this.potencia
    open fun atacar():String{
        val mensaje="HAS CAUSADO ${potenciaFija} puntos de daño"
        return mensaje
    }
    open fun nombreArma():String{
        return "SIN TIPO"
    }
}