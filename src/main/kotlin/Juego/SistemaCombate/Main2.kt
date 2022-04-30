package Juego.SistemaCombate

import java.awt.event.KeyEvent
import java.awt.event.KeyListener

fun Menu():Boolean{
    var mensajeInicio:String="BIENVENIDO AL JUEGO DE COMBATE DE FARRA, ES UN SIMULADOR DE COMBATE BASICO EN LA QUE PODRAS ATACAR,DEFENDER Y PERSONALIZAR TU INVENTARIO \nINTRODUCE SI PARA COMENZAR LA PARTIDA O NO PARA TERMINAR EL PROGRAMA"
    println(mensajeInicio)
    var miBoolean:Boolean=false
    while (true){
        val opcion= readLine()!!.toString()
        when (opcion.uppercase()) {
            "SI" -> {
                miBoolean=true
                break
            }
            "NO" -> {
                miBoolean=false
                println("TERMINANDO PROGRAMA.... HASTA LUEGO!!!")
                break}
            else -> println("ESCRIBE SI PARA INICIAR PARTIDA O NO PARA TERMINAR EL PROGRAMA POR FAVOR!!!")
    }
    }
    return miBoolean
}
fun accionesJugador(accion:String,Jugador:Humano,Enemigo:Enemigo){
    when (accion){
        "A"-> println(Jugador.atacar(Enemigo))
        "B"-> println(Jugador.defender())
        "C"-> println(Jugador.inventario)
        "D"-> {println(Jugador.toString())
        "E"->{if (Jugador.armaEquipada is Cuchillo) {
            (Jugador.armaEquipada as Cuchillo).afilar())
        }}
        println(Enemigo.toString())}
    }
}
fun mensajeArma(arma:Armas?):String{
    var msj=""
    if (arma is ArmaBlanca) msj="AFILAR"
    if (arma is ArmaFuego) msj="CARGAR"
    return msj
}
fun Juego(){
    val listaArmas= arrayListOf<Armas>(Rifle(),Escopeta(),Cuchillo(),Hacha(),Pistola())
    val EnemigoInicial=Enemigo(vida = 50.00, armaEquipada = Cuchillo(potencia = 20.00))
    val armaInicial:ArmaBlanca=Cuchillo(potencia = 30.00,afilada = true)
    val player=Humano(armaEquipada = armaInicial, inventario = arrayListOf(armaInicial))
    if (Menu())
        while (player.vida>0 && EnemigoInicial.vida>0) {

            println(""" VIDA ENEMIGO:${EnemigoInicial.vida}
********************************************************************************************************************
                            |                                                                                                                                                       |
                            |   VIDA:${player.vida}                                      A)ATACAR                  B)DEFENDER           E)${mensajeArma(player.armaEquipada)}       |                                                                       
                            |                                                                                                                                                       |      
                            |   Arma Actual:${player.armaEquipada?.nombreArma()}                      C)INVENTARIO              D)INFO              F)                                                           |                                                                      
                            |                                                                                                                                                       |
*******************************************************************************************************************+
            """.trimMargin())
            println("JUGADOR QUE DESEAS HACER:")
            val accion= readLine()!!.toString()
            accionesJugador(accion,player,EnemigoInicial)
            if (player.estado) println("TE HAS DEFENDIDO DEL ATAQUE!!")
            else println("EL ENEMIGO TE HA ATACADO :${player.vida-EnemigoInicial.atacar(player)} PUNTOS DE DAÑO")


}
    if (player.vida<=0){
        println("HAS PERDIDO EL COMBATE")
    }
    else println("HAS GANADO!!!!!!!")
}

fun main(){
    println(Juego())
}