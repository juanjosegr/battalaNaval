class BatallaNaval {

    var tableroObj = Tablero()
    val barcosObj = Barco()

    val coordenadasPortaviones = listOf(
        Pair(1, 2),
        Pair(1, 3),
        Pair(1, 4),
        Pair(1, 5),
        Pair(1, 6)
    )
    var portaAviones = Portaviones(coordenadasPortaviones)


    fun guardarBatallaNaval() {
        println("Guardar batalla Naval")
        barcosObj.guardarBarcos()
        tableroObj.guardarTablero()
    }


    fun recuperarBatallaNaval() {
        println("Recuperar batalla Naval")
        barcosObj.recuperarBarcos()
        tableroObj.recuperarTablero()
    }

    fun pintarTablero(){
        tableroObj.colocarBarco(portaAviones)
        tableroObj.dibujarTablero()
    }

}