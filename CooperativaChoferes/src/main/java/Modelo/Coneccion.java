
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
            String crearTablaChoferes = "CREATE TABLE IF NOT EXISTS socios ("
                    + "idSocio INT AUTO_INCREMENT PRIMARY KEY, "
                    + "idColectivoMasFrecuente INT, "
                    + "nombre VARCHAR(250) NOT NULL, "
                    + "dni INT NOT NULL, "
                    + "legajo int NOT NULL"
                    + ")";
            statement.executeUpdate(crearTablaChoferes);

            // Crear la tabla micros
            String crearTablaMicros = "CREATE TABLE IF NOT EXISTS colectivos ("
                    + "idColectivo INT AUTO_INCREMENT PRIMARY KEY, "
                    + "idSocioMasFrecuente INT, "
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
                    + "idColectivo INT, "
                    + "kmRealizados DECIMAL(12, 1) NOT NULL, "
                    + "pasajeros INT NOT NULL"
                    + ")";
            statement.executeUpdate(crearTablaViajes);

            // Insertar datos en choferes
            String insertarChoferes = "INSERT INTO socios (idColectivoMasFrecuente, nombre, dni, legajo) VALUES "
                    + "(NULL, 'Juan Pérez', 35345678, '13579'), "
                    + "(NULL, 'María López', 37654321, '24680')";
            statement.executeUpdate(insertarChoferes);

            // Insertar datos en micros
            String insertarMicros = "INSERT INTO colectivos (idSocioMasFrecuente, capacidad, patente, modelo, kilometraje) VALUES "
                    + "((SELECT idSocio FROM socios WHERE nombre = 'Juan Pérez'), 50, 'ABC123', 'Mercedes-Benz Sprinter', 0), "
                    + "((SELECT idSocio FROM socios WHERE nombre = 'María López'), 45, 'DEF456', 'Iveco Daily', 0)";
            statement.executeUpdate(insertarMicros);

            // Asigna los micros a sus choferes
            String actualizarChoferes = "UPDATE socios SET idColectivoMasFrecuente = (SELECT idColectivo FROM colectivos WHERE patente = 'ABC123') WHERE nombre = 'Juan Pérez'; "
                    + "UPDATE socios SET idColectivoMasFrecuente = (SELECT idColectivo FROM colectivos WHERE patente = 'DEF456') WHERE nombre = 'María López'";
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

        
        
        
        


    

