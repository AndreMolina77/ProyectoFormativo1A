package modeloProyectoFormativoAndre


import java.sql.Connection
import java.sql.DriverManager

class ClaseConexion {

    fun CadenaConexion(): Connection?{
        try {
            val url = "jdbc:oracle:thin@10.10.1.120:1521:xe"
            val usuario  = "ANDRE_DEVELOPER"
            val contrasena  = "Seraphine"

            val conexion = DriverManager.getConnection(url, usuario, contrasena)
            return conexion
        }catch (e:Exception){
            println("error: $e")
            return null
        }
    }
}