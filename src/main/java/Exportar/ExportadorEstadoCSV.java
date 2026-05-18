package Exportar;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ExportadorEstadoCSV {
    
    private Main ventanaPrincipal;
    
    public ExportadorEstadoCSV(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public String filtro(int index, String tipo, String contenido) {
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
            if (cuenta.getTipo().equals(tipo)) {
            contenido += cuenta.getNombre() + "," + "$" + cuenta.getCantidad() + "\n";
            }
        }
        return contenido;
    }
    
    public static void crearArchivo(String contenido, String nombre) {
        String  usuario = System.getProperty("user.home");
        String rutaEscritorio = usuario + File.separator + "Desktop" + File.separator + nombre + "-" + "Estado_resultados.csv";
        try {
            FileWriter file = new FileWriter(rutaEscritorio);
            file.write(contenido);
            file.close();
            JOptionPane.showMessageDialog(null, "Archivo Guardado en: "+rutaEscritorio);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}