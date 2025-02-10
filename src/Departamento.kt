open class Departamento {

    var listaTrabajadores = mutableListOf<Empleado>()


    fun agregarEmpleado(empleado: Empleado){
        listaTrabajadores.add(empleado)
    }

    fun calculaSalarioTotal(): Double{
        var salarioTotal = 0.0
        for (empleado in listaTrabajadores){
            var salarioTemporal = empleado.calculaSalario()
            salarioTotal += salarioTemporal
        }
        return salarioTotal
    }
}