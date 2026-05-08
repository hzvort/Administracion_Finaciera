package ReportesExportacion;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportadorBalanceCSV {

    private Main ventanaPrincipal = new Main();
    
    public String filtro(int index, String tipo, String content){
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
            if (cuenta.getTipo().equals(tipo)) {
                content = content + "," + cuenta.getNombre() + "," + cuenta.getCantidad();
            }
        }
        return content;
    }
    
    public void exportarBalanceCSV(String contenido) {
        String  usuario = System.getProperty("user.home");
        String rutaEscritorio = usuario + File.separator + "Desktop" + File.separator + "resultados.csv";
        try {
            FileWriter file = new FileWriter(rutaEscritorio, true);
            file.write(contenido);
            file.close();
            System.out.println("El Archivo se guardo en la ruta: " + rutaEscritorio);
        } catch (IOException e) {
        }
    }
    
}//
