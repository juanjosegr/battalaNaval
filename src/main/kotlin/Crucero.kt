class Crucero (coordenadas: List<Pair<Int, Int>>) : Barco() {
    var localizacion: MutableList<Pair<Int, Int>> = mutableListOf()

    init {
        if (coordenadas.size == 2) {
            localizacion.addAll(coordenadas)
        } else {
            throw IllegalArgumentException("El Crucero debe tener 2 coordenadas.")
        }
    }
}