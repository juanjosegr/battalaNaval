class Lancha (coordenadas: List<Pair<Int, Int>>) : Barco() {
    var localizacion: MutableList<Pair<Int, Int>> = mutableListOf()

    init {
        if (coordenadas.size == 1) {
            localizacion.addAll(coordenadas)
        } else {
            throw IllegalArgumentException("La Lancha debe tener 1 coordenadas.")
        }
    }
}