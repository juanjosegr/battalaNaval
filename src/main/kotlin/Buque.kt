class Buque(coordenadas: List<Pair<Int, Int>>) : Barco() {
    var localizacion: MutableList<Pair<Int, Int>> = mutableListOf()

    init {
        if (coordenadas.size == 4) {
            localizacion.addAll(coordenadas)
        } else {
            throw IllegalArgumentException("El Buque debe tener 4 coordenadas.")
        }
    }
}