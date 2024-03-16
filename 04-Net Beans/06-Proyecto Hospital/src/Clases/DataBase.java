package Clases;

import java.sql.*;

public class DataBase {
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "hospital";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try {
           Connection conexion = DriverManager.getConnection(url, database_user, database_password);
           this.manipularDB = conexion.createStatement();
           System.out.println("Conexion Exitosa a: "+database_name);
        } catch (SQLException e) {
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    // Registrar
    public boolean registrarCitas(String numero_documento,String estado, String fecha_cita, String nombre_medico){
        String registrar = "INSERT INTO citas (numero_documento,estado,nombre_medico,fecha_cita) VALUES ('"+numero_documento+"','PENDIENTE','"+nombre_medico+"','"+fecha_cita+"' )";
        try{
            int respuesta = manipularDB.executeUpdate(registrar);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean registrarPaciente(String nombre_paciente, String apellido_paciente, String tipo_documento, String numero_documento, String tipo_sangre, String edad_paciente, String numero_contacto){
        String registrar = "INSERT INTO paciente (nombre_paciente, apellido_paciente, tipo_documento, numero_documento, tipo_sangre, edad_paciente, numero_contacto) VALUES ('"+nombre_paciente+"', '"+apellido_paciente+"', '"+tipo_documento+"', '"+numero_documento+"', '"+tipo_sangre+"', '"+edad_paciente+"', '"+numero_contacto+"')";
        try{
            int respuesta = manipularDB.executeUpdate(registrar);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean registrarInternos(String fecha, String numero_camilla, String documento, String estado){
        String registrar = "INSERT INTO internar (fecha, numero_camilla, documento, estado) VALUES ('"+fecha+"', '"+numero_camilla+"', '"+documento+"', 'INTERNO')";
        try{
            int respuesta = manipularDB.executeUpdate(registrar);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    // Buscar 
    public Citas buscarCitas(String numeroDocumneto){
        Citas temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM citas WHERE numero_documento='"+numeroDocumneto+"' ");
            registros.next();
            if (registros.getRow()==1){
                temp = new Citas (registros.getString("numero_documento"), registros.getString("estado"), registros.getString("fecha_cita"), registros.getString("nombre_medico"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Citas buscarCitasEstado(String numeroDocumneto){
        Citas temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM citas WHERE numero_documento='"+numeroDocumneto+"' AND estado='PENDIENTE'");
            registros.next();
            if (registros.getRow()==1){
                temp = new Citas (registros.getString("numero_documento"), registros.getString("estado"), registros.getString("fecha_cita"), registros.getString("nombre_medico"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Paciente buscarPaciente(String numeroDocumento){
        Paciente temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM paciente WHERE numero_documento='"+numeroDocumento+"' ");
            registros.next();
            if (registros.getRow()==1){
                temp = new Paciente(registros.getString("nombre_paciente"), registros.getString("apellido_paciente"), registros.getString("tipo_documento"), registros.getString("numero_documento"), registros.getString("tipo_sangre"), registros.getString("edad_paciente"),registros.getString("numero_contacto"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Internos buscarInternos(String numeroDocumento){
        Internos temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM internar WHERE documento='"+numeroDocumento+"' ");
            registros.next();
            if (registros.getRow()==1){
                temp = new Internos(registros.getString("fecha"), registros.getString("numero_camilla"), registros.getString("documento"), registros.getString("estado"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Internos buscarInternosEstado(String numeroDocumento){
        Internos temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM internar WHERE documento='"+numeroDocumento+"' AND estado='INTERNO' ");
            registros.next();
            if (registros.getRow()==1){
                temp = new Internos(registros.getString("fecha"), registros.getString("numero_camilla"), registros.getString("documento"), registros.getString("estado"));
            }
            return temp;
        }catch (SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    // Listar 
    public Paciente [] listaPacientes(){
        Paciente [] listaPacientes = new Paciente[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM paciente");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Paciente temp = new Paciente(registros.getString("nombre_paciente"), registros.getString("apellido_paciente"), registros.getString("tipo_documento"), registros.getString("numero_documento"), registros.getString("tipo_sangre"), registros.getString("edad_paciente"),registros.getString("numero_contacto"));
                    listaPacientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaPacientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaPacientes;
        }
    }
    
    public Citas [] listaCitas(){
        Citas [] listaCitas = new Citas[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM citas");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Citas temp = new Citas(registros.getString("numero_documento"), registros.getString("estado"), registros.getString("fecha_cita"), registros.getString("nombre_medico"));
                    listaCitas[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaCitas;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaCitas;
        }
    }
    
    public Internos [] listaInternos(){
        Internos [] listaInternos = new Internos[100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM internar");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Internos temp = new Internos(registros.getString("fecha"), registros.getString("numero_camilla"), registros.getString("documento"), registros.getString("estado"));
                    listaInternos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaInternos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaInternos;
        }
    }
    
    // Modificar
    
    public boolean modificarCitas(Citas citas){
        boolean respuesta = false;
        String fecha = citas.getFecha_cita();
        String numeroDocumento = citas.getNumero_documento();
        String nombreMedico = citas.getNombre_medico();
        String cambiarEstado = citas.getEstado();
        System.out.println("Fallo "+citas.getEstado());
        
        try {
            String modificar = "UPDATE citas SET estado='"+cambiarEstado+"', nombre_medico='"+nombreMedico+"', fecha_cita='"+fecha+"' WHERE numero_documento='"+numeroDocumento+"' AND estado='PENDIENTE' ";
            int resp = manipularDB.executeUpdate(modificar);
            if (resp>0) {
                System.out.println("valido "+cambiarEstado);
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    public boolean modificarInterno(Internos interno){
        boolean respuesta = false;
        String numeroCamilla = interno.getNumero_camilla();
        String numeroDocumento = interno.getDocumento();
        String cambiarEstado = interno.getEstado();
        System.out.println("02 "+cambiarEstado+" -- "+numeroCamilla+" -- "+numeroDocumento);
        try {
            String modificar = "UPDATE internar SET  numero_camilla='"+numeroCamilla+"', estado='"+cambiarEstado+"' WHERE documento='"+numeroDocumento+"' AND estado='INTERNO' ";
            int resp = manipularDB.executeUpdate(modificar);
            if (resp>0) {
                System.out.println("valido "+cambiarEstado);
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
    
    public boolean modificarPaciente(Paciente paciente){
        boolean respuesta = false;
        String nombre = paciente.getNombre_paciente();
        String apellido = paciente.getApellido_paciente();
        String tipoDocumento = paciente.getTipo_documento();
        String numeroDocumento = paciente.getNumero_documento();
        String tipoSangre = paciente.getTipo_sangre();
        String edad = paciente.getEdad_paciente();
        String numeroContacto = paciente.getNumeroContacto();
        try {
            String modificar = "UPDATE paciente SET  nombre_paciente='"+nombre+"', apellido_paciente='"+apellido+"', tipo_documento='"+tipoDocumento+"', tipo_sangre='"+tipoSangre+"', edad_paciente='"+edad+"', numero_contacto='"+numeroContacto+"' WHERE numero_documento='"+numeroDocumento+"' ";
            int resp = manipularDB.executeUpdate(modificar);
            if (resp>0) {
                respuesta = true;
            }
        }catch (SQLException e){
            System.out.println("Error en UPDATE: "+e.getMessage());
        }
        return respuesta;
    }
}
