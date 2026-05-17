package Exportar;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ExportadorBalanceCSV {
    
    Main ventanaPrincipal;
    
    public ExportadorBalanceCSV(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public String filtro (int index, String tipo, String tipo2, String contenido, double cantidad) {
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        contenido += tipo2 + "\n";
        contenido += tipo + "\n";
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
            if (cuenta.getTipo().equals(tipo)) {
            contenido += "," + cuenta.getNombre() + "," + "$" +cuenta.getCantidad()+"" + "\n";
            }
        }
        return contenido += "," + "total " + tipo + "," + "," + "$" + cantidad + "" + "\n";
    }
    
    public static void crearArchivo(String contenido, String nombre) {
        String  usuario = System.getProperty("user.home");
        String rutaEscritorio = usuario + File.separator + "Desktop" + File.separator + nombre + "-" + "resultados.csv";
        
        try {
            FileWriter file = new FileWriter(rutaEscritorio);
            file.write(contenido);
            file.close();
            JOptionPane.showMessageDialog(null, "Archivo Guardado en: "+rutaEscritorio);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}//
