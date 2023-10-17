class Tablero() {
    val tamano: Int = 10
    private val tablero: Array<Array<String>> = Array(tamano) { Array(tamano) { "." } }

    fun guardarTablero() {
        println("Guardar Tablero")
    }
    fun recuperarTablero() {
        println("Recupearar Tablero")
    }

    fun dibujarTablero() {
        println("Tablero:")
        for (i in 0 until tamano) {
            for (j in 0 until tamano) {
                print(tablero[i][j] + " ")
            }
            println()
        }
    }

    fun colocarBarco(barco: Barco) {
        for ((fila, columna) in barco.coordenadas) {
            tablero[fila][columna] = "X"
        }
    }
}