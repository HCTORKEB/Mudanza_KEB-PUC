class Mudanza (
    val cliente: Cliente,
    val empleado: Empleado,
    val ubicacicionInicio: String,
    val ubicacicionFinal: String,
    val distancia : Double,
    val fecha_hora: String,
    var cancelacion: Boolean = false,
    )
{
var tiempo = 00.00
val precioXminutos = 10
var pagoMudanza = 0.0

fun calculartiempo(){
    val tiempo = distancia / empleado.velocidad
}

fun precioportiempo(){
    pagoMudanza =tiempo * precioXminutos
}

fun cancelacionDEMudanza(){
    cancelacion = true
}

fun getMudanzaData(): String{
    return "Nombre cliente  ${cliente.getClienteData()} "
    "Fecha y Hora: $fecha_hora"
    "Datos de ubicacion: "
    "ubicacion de donde se recoge las pertenecias $ubicacicionInicio"
    "ubicacion de donde llegan las pertenecias $ubicacicionFinal"
    "Distancia total $distancia"
    "precio total por la mudanza $pagoMudanza"

}

}