package FuncionesReportes;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;

public class EstadoDeResultadoFunctions {
    
    Main ventanaPrincipal;

    public EstadoDeResultadoFunctions(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public double sumarPorTipo(int indexEmpresa, String tipoBuscado) {
        double total = 0;
        
        EmpresaObject empresa = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(indexEmpresa);
        
        for (CatalogoObject cuenta : empresa.getMiCatalogo().getMiCatalogo()) {
            if (cuenta.getTipo().equals(tipoBuscado)) {
                total = total + cuenta.getCantidad();
            }
        }
        return total;
    }
    
    public double calcularUtilidadBruta(int indexEmpresa) {
        double ventas = sumarPorTipo(indexEmpresa, "Ventas");
        double costo = sumarPorTipo(indexEmpresa, "Costo de venta");
        return ventas - costo;
    }
    
    public double calcularUtilidadDeOperaciones(int indexEmpresa, double utilidadBruta) {
        double gastosOperacion = sumarPorTipo(indexEmpresa, "Gastos de operación");
        return utilidadBruta - gastosOperacion;
    }
    
     public double calcularUtilidadAntesDeImpuesto(int indexEmpresa, double utilidadDeOperaciones) {
         double productoFinaciero = sumarPorTipo(indexEmpresa, "Productos financieros");
         double gastoFinaciero = sumarPorTipo(indexEmpresa, "Gastos financieros");
        return utilidadDeOperaciones + productoFinaciero - gastoFinaciero;
    }
     
     public double calcularUtilidadNeta(int indexEmpresa, double utilidadAntesDeImpuesto) {
         double impuesto = sumarPorTipo(indexEmpresa, "Impuestos");
        return utilidadAntesDeImpuesto  - impuesto;
    }
}
