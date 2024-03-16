class Cliente(
    val primernombre: String,
    val segundonombre: String,
    val apellido1: String,
    val apellido2: String,
    val correo: String,
    val telefono: String,
    val rfc: String,

) {
    val listaMudanzas: MutableList <Mudanza> = mutableListOf()
    fun getClienteData ():String{
        return "nombre: $primernombre $segundonombre $apellido1 $apellido2 corre electronico: $correo, telefono $telefono  RFC: $rfc"
    }

    fun addmudanza(mudanza: Mudanza){
        listaMudanzas.add(mudanza)
    }


}