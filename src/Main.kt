//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val ventas = Departamento()

    val trabajador1 = EmpleadoPorHora("Lucía", 231243245, 45, 12.0)
    ventas.agregarEmpleado(trabajador1)

    val trabajador2 = EmpleadoFijo("María", 2123456755, 2010.0, 12)
    ventas.agregarEmpleado(trabajador2)

    val trabajador3 = EmpleadoFijo("Pepe", 122232345, 3500.0, 14 )
    ventas.agregarEmpleado(trabajador3)

    val trabajador4 = EmpleadoPorHora("Lucas", 12432345, 100, 18.0)
    ventas.agregarEmpleado(trabajador4)


    for (empleado in ventas.listaTrabajadores){
        println(empleado)
    }

}