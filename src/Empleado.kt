abstract class Empleado (val nombre: String, val id: Int) {

    abstract fun calculaSalario(): Double

    override fun toString(): String {
        return "Empleado $nombre con ID-${"%04d".format(id)} tiene un salario de ${"%.2f".format(calculaSalario())} euros"
    }
}

class EmpleadoPorHora(nombre: String, id: Int, val horasTrabajadas: Int, val tarifaPorHora: Double): Empleado(nombre, id){
    override fun calculaSalario(): Double = horasTrabajadas * tarifaPorHora

}

class EmpleadoFijo(nombre: String, id: Int, val salarioFijo: Double, val numPagas: Int): Empleado(nombre, id){
    override fun calculaSalario(): Double = salarioFijo * numPagas
}