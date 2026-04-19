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
     
     //YA TE DICE SI ES TRUE O FALSE NO HAY QUE PONER EL IF TAL RETURN FALSE O TRUE
     public boolean empty() { return miCatalogo.isEmpty();}
     
}
