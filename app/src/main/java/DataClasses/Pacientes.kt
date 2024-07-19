package DataClasses

data class Pacientes(
    val id_paciente : Int,
    val id_nombre_paciente : Int,
    val id_apellido_paciente : Int,
    val edad : Int,
    val id_enfermedad : Int,
    val num_habitacion : Int,
    val num_cama : Int,
    val id_medicamento_asignado : Int,
    val id_fecha_nacimiento : Int,
    val id_hora_aplicacion_mediacamento : Int
)
