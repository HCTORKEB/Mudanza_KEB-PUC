class ControllerMudanzas {
    val listaMudanzas = mutableListOf<Mudanza>()

    fun regritrodemudanza(cliente: Cliente, empleado: Empleado){
        println("CLIENTE $cliente, EMPLEADO ENCRAGADO $empleado")
        println("INGRESE LA UBICACION DE DONDE SE RECOGERA LAS PERTENENCIAS")
        val ubicacionInicio = readln().toString()
        println("INGRESE LA UBICACION FINAL (DONDE LLEGARAN LAS PERTENENCIAS)")
        val ubicacionFinal= readln().toString()
        println("INSERTE LA DISTANCIA ")
        val distancia = readln().toDouble()
        println("INSERTE LA FECHA Y HORA PARA LA MUDANZA")
        val fecha_hora = readln().toString()

        val addedMudanza=Mudanza(
            cliente,empleado,ubicacionInicio,ubicacionFinal,distancia,fecha_hora,false
        )

        addedMudanza.calculartiempo()
        addedMudanza.precioportiempo()
        cliente.addmudanza(addedMudanza)
        listaMudanzas.add(addedMudanza)
    }

    fun showmudanzas(){
        if (listaMudanzas.isEmpty()){
            println("NO SE TIENE MUDANZAS REGRISTRADAS")
        }else{
            var counter=1
            for (mudanza in listaMudanzas){
                println("$counter"+ mudanza.getMudanzaData())
                counter++
            }
        }
    }

}