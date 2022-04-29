package Juego.SistemaCombate

open class ArmaFuego(potencia:Double=40.00,var cargada:Boolean=true):Armas(potencia) {
    fun cargar() {
        if (!cargada) {
            println("CARGANDO")
            cargada = true
            potencia = potenciaFija
        } else println("YA ESTA CARGADA!!")
    }

    fun disparar(): Boolean {
        if (cargada) return true
        return false
    }

    override fun atacar(): String {
        if (disparar()) {
            this.cargada = false
            return super.atacar()
        } else {
            this.potencia = 0.0
        }
        return super.atacar()
    }

    override fun toString(): String {
        var msj = ""
        if (cargada) msj = "ESTA CARGADA!!!"
        else msj = "SIN MUNICION!!"
        return """
            DATOS ARMA FUEGO
        Potencia:${potencia}
        Cargada:${msj}
        """.trimIndent()
    }
}
