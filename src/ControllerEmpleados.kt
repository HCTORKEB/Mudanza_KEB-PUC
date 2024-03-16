class ControllerEmpleados {
    val listaEmpleados: MutableList<Empleado> = mutableListOf()

    fun regristodeEmpleado() {
        println("INGRESE NOMBRE (S)")
        val nombreEmpleado = readln().toString()
        println("INGRESE PRIMER APELLIDO ")
        val primerApellido = readln().toString()
        println("INGRESE SEGUNDO APELLIDO ")
        val segundoApellido = readln().toString()
        println("INGRESE RCF ")
        val rcf = readln().toString()
        println("TIPO DE VEHICULO QUE MANEJA ")
        println("(1).CAMION RIGIDO")
        println("(2).CAMION ARTICULADO")
        println("(3).CAMION CON LONA")
        println("(4). CAMION CERRADO")
        println("(5). CAMION JAULA")
        println("(6). CAMION CONTENEDOR")
        val tipodecamion = readln().toInt()
        when (tipodecamion) {
            1 -> {
                var vehiculo = "CAMION RIGIDO"
                val velocidad = 50
            }

            2 -> {
                val vehiculo = "CAMION ARTICULADO"
                val velocidad = 30
            }

            3 -> {
                val vehiculo = "CAMION CON LONA"
                val velocidad = 50
            }

            4 -> {
                val vehiculo = "CAMION CERRADO"
                val velocidad = 50
            }

            5 -> {
                val vehiculo = "CAMION JAULA"
                val velocidad = 50
            }

            6 -> {
                val vehiculo = "CAMION CONTENEDOR"
                val velocidad = 30
            }
            else-> println("solo selecione el tipos de vehiculo que maneje")
        }

    }

    fun showEmpleados(){
        if (listaEmpleados.isEmpty()){
            println("NO SE TIENE REGISTRADO A LOS EMPLEADOS")
        }else{
            var courter = 1
            for ( empleado in listaEmpleados){
                println("$courter" + empleado.getEmpleadoData())
                courter++
            }
        }
    }
    fun getEmpleadoByIndex(index:Int):Empleado=listaEmpleados[index]

    fun areNotEmpleadosRegristrored(): Boolean = listaEmpleados.isEmpty()

}