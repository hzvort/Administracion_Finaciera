package function;

import java.util.ArrayList;

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
    
    public CatalogoFunctions getMiCatalogo() {
        return miCatalogo;
    }
    
}
