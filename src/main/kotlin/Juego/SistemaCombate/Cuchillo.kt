package Juego.SistemaCombate

class Cuchillo(potencia:Double=50.00,afilada:Boolean=true,reduccionSinAfilar:Double=40.00):ArmaBlanca(potencia,afilada,reduccionSinAfilar) {
    override fun toString():String{
        return "DATOS CUCHILLO \n"+super.toString()
    }
}