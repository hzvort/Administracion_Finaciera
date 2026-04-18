package function;

import java.util.ArrayList;

public class CatalogoFunctions {
     private ArrayList<CatalogoObject> miCatalogo;
     
     public CatalogoFunctions() {
        miCatalogo = new ArrayList<>(); 
     }
    
    public void agregarCatalogo(CatalogoObject nuevaCuenta) {
        miCatalogo.add(nuevaCuenta);
    }
    
    public void eliminarCatalogo(int valor) {
        if (valor >= 0 && valor < miCatalogo.size()) {
            miCatalogo.remove(valor);
        }
    }
    
     public ArrayList<CatalogoObject> getMiCatalogo() {
        return miCatalogo;
    }
     
     public boolean empty() {
        if (miCatalogo.isEmpty()) {return true;} else {return false;}
    }
     
}
