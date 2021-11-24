package model;
public class Persona {
    private int CodigoPersona;
    private String DPI;
    private String NombrePersona;
    
    public Persona(){}

    public Persona(int CodigoPersona, String DPI, String NombrePersona) {
        this.CodigoPersona = CodigoPersona;
        this.DPI = DPI;
        this.NombrePersona = NombrePersona;
    }

    public int getCodigoPersona() {
        return CodigoPersona;
    }

    public void setCodigoPersona(int CodigoPersona) {
        this.CodigoPersona = CodigoPersona;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }
    
    
}
