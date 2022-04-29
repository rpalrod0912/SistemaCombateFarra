package Juego.SistemaCombate

class Hacha(potencia:Double=50.00,afilada:Boolean=true,reduccionSinAfilar:Double=potencia/2,var filos:Int=2,):ArmaBlanca(potencia,afilada,reduccionSinAfilar) {
    override fun atacar():String {
        potencia=potenciaFija*filos
        return super.atacar()
    }
}
