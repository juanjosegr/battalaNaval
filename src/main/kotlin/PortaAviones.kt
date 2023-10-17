class Portaviones(coordenadas: List<Pair<Int, Int>>) : Barco() {
    init {
        if (coordenadas.size == 5) {
            this.coordenadas = coordenadas
        } else {
            throw IllegalArgumentException("El Portaviones debe tener 5 coordenadas.")
        }
    }
}