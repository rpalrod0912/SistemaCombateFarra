package Juego.SistemaCombate

class Pistola(potencia:Double=40.00,cargada:Boolean=true,var calibre:Int=9):ArmaFuego(potencia,cargada) {
    var calibres:ArrayList<Int> = arrayListOf(9,22,10,40)
    init {
        require(this.calibre in calibres)
    }

    override fun atacar(): String {
        if (calibre==9) potencia=40.00
        else if (calibre==22) potencia=20.00
        else if (calibre==10) potencia=50.00
        else if (calibre==40) potencia+=60.00
        return super.atacar()
    }

    override fun toString(): String {
        return "DATOS PISTOLA \n" + super.toString() + "\n CALIBRE:${calibre}"
    }
}