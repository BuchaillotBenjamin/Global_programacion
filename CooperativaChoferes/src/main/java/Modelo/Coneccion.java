
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Coneccion {
    
    private static final String URL = "jdbc:h2:C:\\Users\\Usuario\\Desktop\\h2/test1.mv.db";
    private static final String USUARIO = "salas";
    private static final String CONTRASEÑA = "123456789";
    private static final String jdbc = "org.h2.Driver";
     
    public void crearBaseDatos(Connection conexion){
         try {
            Statement statement = conexion.createStatement();

            // Crear la tabla choferes
            String crearTablaChoferes = "CREATE TABLE IF NOT EXISTS choferes ("
                    + "idChofer INT AUTO_INCREMENT PRIMARY KEY, "
                    + "idMicroMasFrecuente INT, "
                    + "nombre VARCHAR(250) NOT NULL, "
                    + "dni INT NOT NULL, "
                    + "licencia VARCHAR(60) NOT NULL"
                    + ")";
            statement.executeUpdate(crearTablaChoferes);

            // Crear la tabla micros
            String crearTablaMicros = "CREATE TABLE IF NOT EXISTS micros ("
                    + "idMicro INT AUTO_INCREMENT PRIMARY KEY, "
                    + "idChoferMasFrecuente INT, "
                    + "capacidad INT NOT NULL, "
                    + "patente VARCHAR(7) NOT NULL, "
                    + "modelo VARCHAR(250) NOT NULL, "
                    + "kilometraje DECIMAL(12, 1) NOT NULL"
                    + ")";
            statement.executeUpdate(crearTablaMicros);

            // Crear la tabla viajes
            String crearTablaViajes = "CREATE TABLE IF NOT EXISTS viajes ("
                    + "idViaje INT AUTO_INCREMENT PRIMARY KEY, "
                    + "idChofer INT, "
                    + "idMicro INT, "
                    + "kmRealizados DECIMAL(12, 1) NOT NULL, "
                    + "pasajeros INT NOT NULL"
                    + ")";
            statement.executeUpdate(crearTablaViajes);

            // Insertar datos en choferes
            String insertarChoferes = "INSERT INTO choferes (idMicroMasFrecuente, nombre, dni, licencia) VALUES "
                    + "(NULL, 'Juan Pérez', 35345678, 'INTERNACIONAL'), "
                    + "(NULL, 'María López', 37654321, 'INTERNACIONAL')";
            statement.executeUpdate(insertarChoferes);

            // Insertar datos en micros
            String insertarMicros = "INSERT INTO micros (idChoferMasFrecuente, capacidad, patente, modelo, kilometraje) VALUES "
                    + "((SELECT idChofer FROM choferes WHERE nombre = 'Juan Pérez'), 50, 'ABC123', 'Mercedes-Benz Sprinter', 0), "
                    + "((SELECT idChofer FROM choferes WHERE nombre = 'María López'), 45, 'DEF456', 'Iveco Daily', 0)";
            statement.executeUpdate(insertarMicros);

            // Asigna los micros a sus choferes
            String actualizarChoferes = "UPDATE choferes SET idMicroMasFrecuente = (SELECT idMicro FROM micros WHERE patente = 'ABC123') WHERE nombre = 'Juan Pérez'; "
                    + "UPDATE choferes SET idMicroMasFrecuente = (SELECT idMicro FROM micros WHERE patente = 'DEF456') WHERE nombre = 'María López'";
            statement.executeUpdate(actualizarChoferes);

            
            statement.close();

            System.out.println("Base de datos creada y datos insertados exitosamente.");

        } catch (SQLException e) {
            System.err.println("Error al crear la base de datos: " + e.getMessage());
        }
    }
    
    //PRUEBA DE CONEXION
    /*
    public static void main(String[] args) {
        Connection conexion = null;
        try {            
            Class.forName(jdbc);
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("¡Conexión establecida con éxito!");

            crearBaseDatos(conexion);
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
        }
       
    }*/
    
}

        
        
        
        


    

