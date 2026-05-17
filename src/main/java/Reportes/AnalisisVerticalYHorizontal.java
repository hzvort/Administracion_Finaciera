package Reportes;

import App.Main;
import FuncionesGestion.EmpresaObject;

public class AnalisisVerticalYHorizontal extends javax.swing.JPanel {
    
    private final Main ventanaPrincipal;
    
    public AnalisisVerticalYHorizontal(Main ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public void llenarCombo() {
            comboAnalisis.removeAllItems();
             if (ventanaPrincipal.funcionesEmpresa.empty()) {comboAnalisis.addItem("Sin Empresas"); return;}
        for (EmpresaObject e: ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            comboAnalisis.addItem(e.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboAnalisis = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboAnalisis.setBackground(new java.awt.Color(83, 100, 82));
        comboAnalisis.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboAnalisis.setForeground(new java.awt.Color(222, 213, 200));
        comboAnalisis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Empresas" }));
        comboAnalisis.setBorder(null);
        comboAnalisis.setOpaque(true);
        add(comboAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> comboAnalisis;
    // End of variables declaration//GEN-END:variables
}
