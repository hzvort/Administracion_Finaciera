package Utils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidacionesUtils {
    
    public static boolean emptyCheck(JTextField input, JLabel nombre) {
        String campo = input.getText();
        if (campo.isEmpty()) {
            nombre.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Porfavor rellene el "+ nombre.getText());
            input.requestFocus();
            return false;
        } else {
            nombre.setForeground(new Color (222,213,200));
            return true;
        }
    }
    
    public static boolean confirmacion(String mensaje){
        int respuesta = JOptionPane.showConfirmDialog(
            null, 
            mensaje, 
            "Confirmación", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (respuesta == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
 
    public static boolean doubleCheck(JTextField input) {
        String texto = input.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor rellene el tipo de cambio");
            input.requestFocus();
            return false;
        }
        try {
            double campo = Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad numérica válida en el tipo de cambio" );
                input.requestFocus();
                return false;
            }
    }
    
}
