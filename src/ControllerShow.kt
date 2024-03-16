class ControllerShow {
    val ControllerClientes = ControllerClientes()
    val ContollerEmpleados = ControllerEmpleados()
    val ControllerMudanzas = ControllerMudanzas()


    fun showMenu() {
        println("INSERTE UNA OPCION")
        println("(1)-REGRISTAR CLIENTE")
        println("(2)-REGRISTAR EMPLEADO")
        println("(3)-CREAR SOLICITUD DE MUDANZA")
        println("(4)-MOSTRAR CLIENTES")
        println("(5)-MOSTRAR EMPLEADOS")
        println("(6)-MOSTRAR SOLICITUDES DE MUDANZAS")
        val opcion = readln().toInt()
        opcionselecionada(opcion)
    }

    fun opcionselecionada(opcion: Int) {
        when (opcion) {
            1 -> {
                ControllerClientes.regristrodeCliente()
                showMenu()
            }

            2 -> {
                ContollerEmpleados.regristodeEmpleado()
                showMenu()
            }

            3 -> {
                repartidor()
                showMenu()
            }

            4 -> {
                ControllerClientes.showclients()
                showMenu()
            }

            5 -> {
                ContollerEmpleados.showEmpleados()
                showMenu()
            }

            6 -> {
                ControllerMudanzas.showmudanzas()
                showMenu()
            }
        }

    }


    fun repartidor() {
        if (ControllerClientes.areNotRegristrodeClientes()) {
            println("NO SE TIENE EMPLEADOS REGRISTADOS")
        }
        if (ContollerEmpleados.areNotEmpleadosRegristrored()) {
            println("NO SE TIENE EMPLEADOS REGRISTADOS")
            showMenu()
            return
        }

        println("SELECIONE UN CLIENTE")
        ControllerClientes.showclients()

        val clienteSelecionado = readln().toInt()
        val cliente = ControllerClientes.getclientByIndex(clienteSelecionado - 1)

        println("SELECIONE UN EMPLEADO")
        ContollerEmpleados.showEmpleados()

        val empleadoSelecionado = readln().toInt()
        val empleado = ContollerEmpleados.getEmpleadoByIndex(empleadoSelecionado - 1)

        ControllerMudanzas.regritrodemudanza(cliente, empleado)

    }

}