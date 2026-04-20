package FuncionesGestion;

import java.util.ArrayList;

public class EmpresaFunctions {
    private ArrayList<EmpresaObject> empresa;
    
    public EmpresaFunctions() {
        empresa = new ArrayList<>(); 
    }
    
    public void agregarEmpresa(EmpresaObject numevaEmpresa) {
        empresa.add(numevaEmpresa); //nuevo estuante
    } 
    
    public void eliminarEmpresa(int valor) {
        if (valor >= 0 && valor < empresa.size()) {
            empresa.remove(valor);
        }
    }
    
    public ArrayList<EmpresaObject> getEmpresas() {
        return empresa;
    }
    
     //YA TE DICE SI ES TRUE O FALSE NO HAY QUE PONER EL IF TAL RETURN FALSE O TRUE
    public boolean empty() { return empresa.isEmpty();}
    
}
