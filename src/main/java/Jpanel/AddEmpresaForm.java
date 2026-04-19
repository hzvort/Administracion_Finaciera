
package Jpanel;

import App.MainForm;
import Utils.ValidacionesUtils;
import function.EmpresaObject;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddEmpresaForm extends javax.swing.JPanel {

    private MainForm ventanaPrincipal;
    private Catalogo cat;
    
    
    public AddEmpresaForm(MainForm ventanaPrincipal, Catalogo cat) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.cat = cat;
        initComponents();
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
        correo = new javax.swing.JLabel();
        correoInput = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(83, 100, 82));

        nombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(222, 213, 200));
        nombre.setText("Nombre de la empresa");

        nombreInput.setBackground(new java.awt.Color(141, 148, 132));
        nombreInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nombreInput.setForeground(new java.awt.Color(83, 100, 82));
        nombreInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreInput.setText("Gamesa");
        nombreInput.setBorder(null);

        rfc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rfc.setForeground(new java.awt.Color(222, 213, 200));
        rfc.setText("RFC");

        rfcInput.setBackground(new java.awt.Color(141, 148, 132));
        rfcInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rfcInput.setForeground(new java.awt.Color(83, 100, 82));
        rfcInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rfcInput.setText("numerosRandoms12312");
        rfcInput.setBorder(null);

        giro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        giro.setForeground(new java.awt.Color(222, 213, 200));
        giro.setText("Giro de la empresa");

        giroInput.setBackground(new java.awt.Color(141, 148, 132));
        giroInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        giroInput.setForeground(new java.awt.Color(83, 100, 82));
        giroInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        giroInput.setText("Comercial");
        giroInput.setBorder(null);

        correo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(222, 213, 200));
        correo.setText("Correo");

        correoInput.setBackground(new java.awt.Color(141, 148, 132));
        correoInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        correoInput.setForeground(new java.awt.Color(83, 100, 82));
        correoInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        correoInput.setText("correo@gamesa.com");
        correoInput.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo)
                    .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giro)
                    .addComponent(giroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfc)
                    .addComponent(rfcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rfc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rfcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 340));

        cancelBtn.setBackground(new java.awt.Color(83, 100, 82));
        cancelBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(222, 213, 200));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("Cancelar");
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
        ventanaPrincipal.mostrarEmpresaForm();
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
            correoInput.getText()
        );
        
        ventanaPrincipal.funcionesEmpresa.agregarEmpresa(nueva);
        JOptionPane.showMessageDialog(this, "Empresa guardada con éxito");
        cat.llenarCombo();
        ventanaPrincipal.mostrarEmpresaForm();
        
        
        nombreInput.setText("");
        rfcInput.setText("");
        giroInput.setText("");
        correoInput.setText("");
        
    }//GEN-LAST:event_acceptBtnMousePressed
    
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
    private javax.swing.JLabel rfc;
    private javax.swing.JTextField rfcInput;
    // End of variables declaration//GEN-END:variables
}
