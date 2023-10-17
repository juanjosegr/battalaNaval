open class Barco(var hundido: Boolean = false) {
    var coordenadas: List<Pair<Int, Int>> = listOf()

    fun hundir() {
        hundido = true
    }
    fun guardarBarcos() {
        println("Guardar Barcos")
    }
    fun recuperarBarcos() {
        println("Recuperar Barcos")
    }
}
