package Reportes;

import App.Main;
import FuncionesGestion.EmpresaObject;

public class PartidaDoble extends javax.swing.JPanel {

    private final Main ventanaPrincipal;
    
    public PartidaDoble(Main ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    public void llenarCombo() {
            comboPartida.removeAllItems();
             if (ventanaPrincipal.funcionesEmpresa.empty()) {comboPartida.addItem("Sin Empresas"); return;}
        for (EmpresaObject e: ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            comboPartida.addItem(e.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboPartida = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboPartida.setBackground(new java.awt.Color(83, 100, 82));
        comboPartida.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboPartida.setForeground(new java.awt.Color(222, 213, 200));
        comboPartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Empresas" }));
        comboPartida.setBorder(null);
        comboPartida.setOpaque(true);
        add(comboPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> comboPartida;
    // End of variables declaration//GEN-END:variables
}
