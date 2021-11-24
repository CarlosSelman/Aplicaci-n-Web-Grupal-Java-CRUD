package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoIN5BM?useSSL=false","root","root");
            System.out.println("Conexion Establecida ...");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("La conexion no se realizo correctamente");
        }
    }
    public Connection getConection(){
        return conexion;
    }
}
/* ------------------------------------------IMPORTANTE---------------------------------------
En caso de tener problema con la zona horario y sus credenciales son root y admin sustituir la linea de la url
por esta linea
jdbc:mysql://localhost:3306/ProyectoIN5BM?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false", "root","admin"
*/
