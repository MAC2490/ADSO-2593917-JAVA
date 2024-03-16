package conexionbasedatos;

import java.sql.*;


public class Principal {

    public static void main(String[] args) {
        
        Connection conexion;
        Statement manipularDB;
        
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "java";
        String database_user = "root";
        String database_password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try {
            conexion = DriverManager.getConnection(url, database_user, database_password);
            manipularDB = conexion.createStatement();
            System.out.println("conexion exitosa a la base de datos: "+database_name);
        } catch (SQLException e) {
            System.out.println("Error en: "+e.getMessage());
            conexion = null;
            manipularDB = null;
        }
        
        if (conexion != null ) {
            // Extrayendo datos de la base de datos
            try {
                String consulta = "SELECT * FROM personas";
                ResultSet registros = manipularDB.executeQuery(consulta);
                registros.next();
                if (registros.getRow() == 1) {
                    do {
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Cedula: "+registros.getString("cedula"));
                        System.out.println("Nombre: "+registros.getString("nombres"));
                        System.out.println("Telefono: "+registros.getString("telefono"));
                        System.out.println("Direccion: "+registros.getString("direccion"));
                        System.out.println("Email: "+registros.getString("email"));
                        System.out.println("------------------------------------------------------------------");
                    } while (registros.next());
                }else{
                    System.out.println("No hay personas registradas.");
                }
            } catch (SQLException e) {
                System.out.println("Error en SELECT: "+e.getMessage());
            }
            
            // Insertar una persona
            String documento = "108806";
            String nombres = "Francisco";
            String apellido = "Ochoa";
            String telefono = "300006" ;
            String direccion = "calle 20";
            String email = "Francisco@gemail.com";
            String consulta = "INSERT INTO personas (cedula,nombres,apellidos,telefono,direccion,email) VALUES ('"+documento+"','"+nombres+"','"+apellido+"','"+telefono+"','"+direccion+"','"+email+"')";
        
            try {
                int respuesta = manipularDB.executeUpdate(consulta);
                if (respuesta>0) {
                    System.out.println("REGISTRO INSERTADO CON EXITO");
                }
            } catch (SQLException e) {
                System.out.println("Error al insertar: "+e.getMessage());
            }
        } 
    }
}