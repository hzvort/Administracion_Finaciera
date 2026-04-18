package function;

import java.util.ArrayList;

public class CatalogoFunctions {
     private ArrayList<CuentaObject> miCatalogo;
     
     public CatalogoFunctions() {
        miCatalogo = new ArrayList<>(); 
     }
     
     public ArrayList<CuentaObject> getMiCatalogo() {
        return miCatalogo;
    }
    
    public void agregarCatalogo(CuentaObject nuevaCuenta) {
        this.miCatalogo.add(nuevaCuenta);
    }
    
    public void eliminarCatalogo(int valor) {
        if (valor >= 0 && valor < miCatalogo.size()) {
            miCatalogo.remove(valor);
        }
    }
    
    public boolean empty() {
        if (miCatalogo.isEmpty()) {return true;} else {return false;}
    }
}
