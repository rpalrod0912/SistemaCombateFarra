package Juego.SistemaCombate

class Escopeta(potencia:Double=60.00,cargada:Boolean=true,var recortada:Boolean=false,var aumentoRecortada:Double=40.00):ArmaFuego(potencia,cargada) {
    override fun atacar(): String {
        if (recortada)potencia+=aumentoRecortada
        return super.atacar()
    }

    override fun toString():String{
        var mensaje:String=""
        if (recortada) mensaje="RECORTADA"
        else mensaje="ESCOPETA NORMAL"
        return "DATOS ESCOPETA \n"+return super.toString()+"\n TIPO:{$mensaje}"
    }
}
