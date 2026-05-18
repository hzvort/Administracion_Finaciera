
package Gestion;

import App.Main;
import Utils.ValidacionesUtils;
import FuncionesGestion.EmpresaObject;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddEmpresa extends javax.swing.JPanel {

    private Main ventanaPrincipal;
    private Catalogo cat;
    
    
    public AddEmpresa(Main ventanaPrincipal, Catalogo cat) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.cat = cat;
        initComponents();
        
        nombreInput.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de la empresa");
        rfcInput.putClientProperty("JTextField.placeholderText", "Ingrese el RFC de la empresa");
        giroInput.putClientProperty("JTextField.placeholderText", "Ingrese el giro de la empresa (Comercial)");
        correoInput.putClientProperty("JTextField.placeholderText", "Ingrese el correo de la empresa (example@gmail.com)");
        periodoInput.putClientProperty("JTextField.placeholderText", "Ingrese el periodo (2024)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        rfc = new javax.swing.JLabel();
        rfcInput = new javax.swing.JTextField();
        giro = new javax.swing.JLabel();
        giroInput = new javax.swing.JTextField();
        periodo = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        correoInput = new javax.swing.JTextField();
        periodoInput = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(83, 100, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(222, 213, 200));
        nombre.setText("Nombre de la empresa");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nombreInput.setBackground(new java.awt.Color(141, 148, 132));
        nombreInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombreInput.setForeground(new java.awt.Color(83, 100, 82));
        nombreInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreInput.setText("Gamesa");
        nombreInput.setBorder(null);
        jPanel1.add(nombreInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 510, 46));

        rfc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rfc.setForeground(new java.awt.Color(222, 213, 200));
        rfc.setText("RFC");
        jPanel1.add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        rfcInput.setBackground(new java.awt.Color(141, 148, 132));
        rfcInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rfcInput.setForeground(new java.awt.Color(83, 100, 82));
        rfcInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rfcInput.setText("numerosRandoms12312");
        rfcInput.setBorder(null);
        jPanel1.add(rfcInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 510, 46));

        giro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        giro.setForeground(new java.awt.Color(222, 213, 200));
        giro.setText("Giro de la empresa");
        jPanel1.add(giro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        giroInput.setBackground(new java.awt.Color(141, 148, 132));
        giroInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        giroInput.setForeground(new java.awt.Color(83, 100, 82));
        giroInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        giroInput.setText("Comercial");
        giroInput.setBorder(null);
        jPanel1.add(giroInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 510, 46));

        periodo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        periodo.setForeground(new java.awt.Color(222, 213, 200));
        periodo.setText("Periodo");
        jPanel1.add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        correo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(222, 213, 200));
        correo.setText("Correo");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        correoInput.setBackground(new java.awt.Color(141, 148, 132));
        correoInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        correoInput.setForeground(new java.awt.Color(83, 100, 82));
        correoInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        correoInput.setText("correo@gamesa.com");
        correoInput.setBorder(null);
        correoInput.addActionListener(this::correoInputActionPerformed);
        jPanel1.add(correoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 510, 46));

        periodoInput.setBackground(new java.awt.Color(141, 148, 132));
        periodoInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        periodoInput.setForeground(new java.awt.Color(83, 100, 82));
        periodoInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        periodoInput.setText("correo@gamesa.com");
        periodoInput.setBorder(null);
        jPanel1.add(periodoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 510, 46));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 370));

        cancelBtn.setBackground(new java.awt.Color(83, 100, 82));
        cancelBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(222, 213, 200));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("Listo");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.setOpaque(true);
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 50));

        acceptBtn.setBackground(new java.awt.Color(83, 100, 82));
        acceptBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(222, 213, 200));
        acceptBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceptBtn.setText("Aceptar");
        acceptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptBtn.setOpaque(true);
        acceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acceptBtnMousePressed(evt);
            }
        });
        add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        ventanaPrincipal.mostrarEmpresa();
        limpiarCampos();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void acceptBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBtnMousePressed
        if (!ValidacionesUtils.emptyCheck(nombreInput, nombre)) {return;}
        if (!sameName(nombreInput, nombre)) {return;}
        if (!ValidacionesUtils.emptyCheck(rfcInput, rfc)) {return;}
        if (!ValidacionesUtils.emptyCheck(giroInput, giro)) {return;}
        if (!ValidacionesUtils.emptyCheck(correoInput, correo)) {return;}
        
        EmpresaObject nueva = new EmpresaObject(
            nombreInput.getText(),
            rfcInput.getText(),
            giroInput.getText(),
            correoInput.getText(),
            periodoInput.getText()
        );
        
        ventanaPrincipal.funcionesEmpresa.agregarEmpresa(nueva);
        JOptionPane.showMessageDialog(this, "Empresa guardada con éxito");
        cat.llenarCombo();
        ventanaPrincipal.mostrarEmpresa();
        
        limpiarCampos();
    }//GEN-LAST:event_acceptBtnMousePressed

    private void correoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoInputActionPerformed
    
    private void limpiarCampos() {
        nombreInput.setText("");
        rfcInput.setText("");
        giroInput.setText("");
        correoInput.setText("");
        
    }
    
    private boolean sameName(JTextField input, JLabel nombre) {
        String campo = input.getText();
        boolean encontrado = false;
        
        for (EmpresaObject e : ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            if (e.getNombre().equals(campo)) {
                encontrado = true;
            }
         }
        
        if (encontrado) {
            nombre.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "El nombre "+ campo + " ya esta en uso, porfavor renombre");
            input.requestFocus();
            return false;
        }else {
            nombre.setForeground(new Color (222,213,200));
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptBtn;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoInput;
    private javax.swing.JLabel giro;
    private javax.swing.JTextField giroInput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JLabel periodo;
    private javax.swing.JTextField periodoInput;
    private javax.swing.JLabel rfc;
    private javax.swing.JTextField rfcInput;
    // End of variables declaration//GEN-END:variables
}
