class Submarino(coordenadas: List<Pair<Int, Int>>) : Barco() {
    var localizacion: MutableList<Pair<Int, Int>> = mutableListOf()

    init {
        if (coordenadas.size == 3) {
            localizacion.addAll(coordenadas)
        } else {
            throw IllegalArgumentException("El Submarino debe tener 3 coordenadas.")
        }
    }
}