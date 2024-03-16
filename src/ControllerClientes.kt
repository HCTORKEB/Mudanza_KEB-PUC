class ControllerClientes {
    val listaClientes: MutableList<Cliente> = mutableListOf()

    fun regristrodeCliente(){
        println(" INGRESE PRIMER NOMBRE")
        val primernombre = readln().toString()
        println(" INGRESE SEGUNDO NOMBRE")
        val segundonombre = readln().toString()
        println(" INGRESE PRIMER APELLIDO")
        val apellido1 = readln().toString()
        println(" INGRESE SEGUNDO APELLIDO")
        val apellido2 = readln().toString()
        println(" INGRESE CORREO ELECTRONICO")
        val correo = readln().toString()
        println(" INGRESE TELEFONO")
        val telefono = readln().toString()
        println(" INGRESE RCF")
        val rcf = readln().toString()

        val addedclient = Cliente(
            primernombre,segundonombre,apellido1,apellido2,correo,telefono,rcf
        )
        listaClientes.add(addedclient)

    }
    fun showclients(){
        if (listaClientes.isEmpty()){
            println("NO SE TIENE CLIENTES REGRISTRADOS")
        }else {
            var courter = 1
            for ( client in listaClientes){
                println("$courter" + client.getClienteData())
                courter++
            }
        }
    }
    fun getclientByIndex(index:Int):Cliente=listaClientes[index]

    fun areNotRegristrodeClientes(): Boolean= listaClientes.isEmpty()

}