package FuncionesReportes;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;

public class BalanceGeneralFunctions {
    
    Main ventanaPrincipal;
    
    public BalanceGeneralFunctions(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
     public double sumaTotal(int index, String tipo, String tipo2) {
         double sumaTotal = 0;
         
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
            if (!cuenta.getTipo().equals(tipo) && !cuenta.getTipo().equals(tipo2)) {continue;}
            sumaTotal = sumaTotal + cuenta.getCantidad();
        }
        
       return sumaTotal;
    }
     
    public String checkBalanceGeneral(double activo, double pasivo, double capital) {
        double suma, resta;
        suma = pasivo + capital;
        resta = activo - suma;
        if (activo == suma) {return "Los datos estan bien ";} else {return "Balance general no concuerda. DIferencia = " + resta;}
    }
    
    
}
