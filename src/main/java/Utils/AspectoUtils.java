package Utils;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AspectoUtils {

    public static void tableAspect(JTable tabla) {
        tabla.getTableHeader().setBackground(new java.awt.Color(83,100,82));
        tabla.getTableHeader().setForeground(new java.awt.Color(221,213,201));
    }

    public static void flatStile() {
     try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        UIManager.put( "ComboBox.background", new java.awt.Color(141,148,132) );
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(141,148,132) );
        UIManager.put( "ComboBox.selectionBackground", new java.awt.Color(209,213,194) );
        UIManager.put( "ComboBox.foreground", new java.awt.Color(83,100,82) );
        UIManager.put( "ComboBox.buttonArrowColor", new java.awt.Color(222,213,200) );
    }
    
}
