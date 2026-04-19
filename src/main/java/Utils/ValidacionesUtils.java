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
 
    
}
