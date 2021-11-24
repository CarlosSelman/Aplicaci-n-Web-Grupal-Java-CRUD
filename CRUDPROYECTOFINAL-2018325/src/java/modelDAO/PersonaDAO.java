package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Persona;
public class PersonaDAO implements CRUD{
    Persona NuevaPersona = new Persona();
    //Conexion
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public List listar() {
        //Inicializamos una nueva lista;
        ArrayList<Persona> ListaPersona = new ArrayList<>();
        //Consula hacia la base de datos
        String sql = "select * from Persona";
        try{
            con = conect.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //Proceso de llenado en la lista
            while(rs.next()){
                Persona nuevaPersona = new Persona();
                nuevaPersona.setCodigoPersona(rs.getInt("codigoPersona"));
                nuevaPersona.setDPI(rs.getString("DPI"));
                nuevaPersona.setNombrePersona(rs.getString("nombrePersona"));
                ListaPersona.add(nuevaPersona);
            }
            // TerminaProceso de llenado en la lista
        }catch(Exception e){
          e.printStackTrace();
        }
        return ListaPersona;
    }

    @Override
    public Persona list(int id) {
        String sql = "SELECT * FROM PERSONA WHERE CODIGOPERSONA = "+id;
        try{
            con = conect.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                NuevaPersona.setCodigoPersona(rs.getInt("codigoPersona"));
                NuevaPersona.setDPI(rs.getString("DPI"));
                NuevaPersona.setNombrePersona(rs.getString("nombrePersona"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return NuevaPersona;
    }

    @Override
    public boolean add(Persona per) {
       String sql = "INSERT INTO PERSONA(DPI,NOMBREPERSONA)values('"+per.getDPI()+"','"+per.getNombrePersona()+"')";
       try{
            con = conect.getConection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
       String sql = "UPDATE PERSONA set DPI ='"+per.getDPI()+"',nombrePersona ='"+per.getNombrePersona()+"' WHERE codigoPersona = "+per.getCodigoPersona();
       try{
            con = conect.getConection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM PERSONA WHERE codigoPersona = "+ id;
        try{
            con = conect.getConection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
}