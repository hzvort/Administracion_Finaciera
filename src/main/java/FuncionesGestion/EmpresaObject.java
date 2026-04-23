package FuncionesGestion;


public class EmpresaObject {
    
    private String nombre, rfc, giro, correo;
    private CatalogoFunctions miCatalogo;
    
    public EmpresaObject(String nombre, String rfc, String giro, String correo) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.giro = giro;
        this.correo = correo;
        this.miCatalogo = new CatalogoFunctions();
}
    
    
    public String getNombre() {return nombre;}
    public String getRfc() {return rfc;}
    public String getGiro() {return giro;}
    public String getCorreo() {return correo;}
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRfc(String rfc) { this.rfc = rfc; }
    public void setGiro(String giro) { this.giro = giro; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    public CatalogoFunctions getMiCatalogo() {
        return miCatalogo;
    }
    
}
