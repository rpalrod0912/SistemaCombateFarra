package Juego.SistemaCombate

open class ArmaBlanca(potencia:Double=70.00,var afilada:Boolean=false, var reduccionSinAfilar:Double=30.00):Armas(potencia) {
    fun afilar(){
        if (!afilada) {println("AFILANDO...")
            afilada=true
            potencia=potenciaFija}
        else println("YA ESTA AFILADA")
    }

    override fun atacar(): String {
        if (afilada) this.potencia
        else{
            this.potencia-=reduccionSinAfilar
        }
        return super.atacar()
    }

    override fun toString(): String {
        var mensaje=""
        if (afilada) mensaje="FILO NUEVO"
        else mensaje="SIN FILO"
        return """
            DATOS ARMA BLANCA:
    Potencia:${potencia}
    ESta Afilada:${mensaje}
        """.trimIndent()
    }
}

