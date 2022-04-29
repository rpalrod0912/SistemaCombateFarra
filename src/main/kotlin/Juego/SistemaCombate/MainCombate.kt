package Juego.SistemaCombate
// fun main() {
// println("PRIMERO ELIGE UN ARMA CON LA QUE LUCHAR:")
// var miArma = EligeArma()
// println("BIENVENIDO AL SISTEMA DE COMBATE")
// while (true) {
// var eleccion: String
// println("ESCIRBE INFO PARA CONOCER TUS MOVIMIENTOS")
// try {
// when (miArma) {
// is ArmaFuego -> {
// println("VIDA DEL ENEMIGO:${miArma.vidaInicial}")
// var movimientos = readLine()!!.toString()
// if (movimientos.uppercase() == "ATACAR") {
// println("HAS CAUSADO ${miArma.atacar()}  PUNTOS DE DAÑO")
// }
// if (movimientos.uppercase() == "CARGAR") {
// println(miArma.cargar())
// }
// if (movimientos.uppercase() == "DATOS") {
// println(miArma)
// }
// if (movimientos.uppercase() == "INFO") {
// println(
// """
// atacar-> Ataca al enemigo causandole puntos de daño
// cargar-> Por cada vez que ataques debes cargar el arma
// datos-> Datos del arma
// terminar->Finaliza el combate y sale del programa
// """.trimIndent()
// )
// }
// if (movimientos.uppercase() == "TERMINAR"){
// println("TERMINANDO COMBATE...")
// break}
// }
// is ArmaBlanca -> {
// println("VIDA DEL ENEMIGO:${miArma.vidaInicial}")
// var movimientos = readLine()!!.toString()
// if (movimientos.uppercase() == "ATACAR") {
// println("HAS CAUSADO ${miArma.atacar()} PUNTOS DE DAÑO")
// }
// if (movimientos.uppercase() == "AFILAR") {
// println(miArma.afilar())
// }
// if (movimientos.uppercase() == "DATOS") {
// println(miArma)
// }
// if (movimientos.uppercase() == "INFO") {
// println(
// """
// atacar-> Ataca al enemigo causandole puntos de daño
// afilar-> Afilar el arma si su estado es desafilado de lo contrario pierdes puntos de daño
// datos-> Datos del arma
// terminar->Finaliza el combate y sale del programa
// """.trimIndent()
// )
// }
// if (movimientos.uppercase() == "TERMINAR") {
// println("TERMINANDO COMBATE...")
// break
// }
// }
// else -> println("ELIGE ALGO VALIDO PORFAVOR")
// }
// }
// catch (e: Exception) {
// println("Elige una opcion!!!")
// }
// }
// }
// fun EligeArma():Armas{
// var opt:Int
// var ArmaElegida:Armas
// while (true){
// try{
// println("ELIGE UN ARMA:")
// var opt= readLine()!!.toInt()
// when (opt){
// 1->{ArmaElegida=Rifle()
// break}
// 2->{ArmaElegida=Pistola()
// break}
// 3->{ArmaElegida=Escopeta()
// break}
// 4->{ArmaElegida=Cuchillo()
// break}
// 5->{ArmaElegida=Hacha()
// break}
// }
// }catch (e:NumberFormatException){
// println("LA OPCION DEBE SER UN NUMERO")
// }
// }
// return  ArmaElegida
// }