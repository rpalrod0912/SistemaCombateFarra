package Juego.SistemaCombate

class Rifle(potencia:Double=100.00,cargada:Boolean=true,var alcance:Double=200.00):ArmaFuego(potencia,cargada) {
    override fun toString(): String {
        return "DATOS RIFLE \n"+super.toString()+"\n ALCANCE:${alcance}"
    }
}