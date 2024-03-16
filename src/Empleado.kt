class Empleado(
    val nombreEmpleado: String,
    val primerApellido: String,
    val segundoApellido: String,
    val rcf: String,
    val vehiculo:String,
    val tipodecamion: Int,
    var velocidad: Double,
    val disponibilidad: Boolean = true
) {
    fun getEmpleadoData():String{
        return "nombre: $nombreEmpleado $primerApellido $segundoApellido RCF: $rcf"
        "tipo de vehiculo: $vehiculo  velocidad estandar a que va $velocidad"
        "Disponible: ${if (disponibilidad)"Si" else "No"}"
    }
}