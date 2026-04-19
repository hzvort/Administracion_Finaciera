package Jpanel;

import App.MainForm;
import Utils.ValidacionesUtils;
import function.CatalogoObject;
import function.EmpresaObject;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddCatalogo extends javax.swing.JPanel {
    
        private MainForm ventanaPrincipal;
        private EmpresaObject empresaSeleccionada;
    
    public AddCatalogo(MainForm ventanaPrincipal, EmpresaObject empresaSeleccionada) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.empresaSeleccionada = empresaSeleccionada;
        ventanaPrincipal.flatStile();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        codigoInput = new javax.swing.JTextField();
        cuenta = new javax.swing.JLabel();
        cuentaInput = new javax.swing.JTextField();
        tipo = new javax.swing.JLabel();
        tipoCombo = new javax.swing.JComboBox<>();
        naturaleza = new javax.swing.JLabel();
        naturalezaInput = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JLabel();
        cantidadInput = new javax.swing.JTextField();
        cancelarBtn = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(83, 100, 82));

        codigo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(222, 213, 200));
        codigo.setText("Codigo");

        codigoInput.setBackground(new java.awt.Color(141, 148, 132));
        codigoInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        codigoInput.setForeground(new java.awt.Color(83, 100, 82));
        codigoInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoInput.setBorder(null);

        cuenta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cuenta.setForeground(new java.awt.Color(222, 213, 200));
        cuenta.setText("Nombre de la cuenta");

        cuentaInput.setBackground(new java.awt.Color(141, 148, 132));
        cuentaInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cuentaInput.setForeground(new java.awt.Color(83, 100, 82));
        cuentaInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cuentaInput.setBorder(null);

        tipo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(222, 213, 200));
        tipo.setText("Tipo de cuenta");

        tipoCombo.setBackground(new java.awt.Color(141, 148, 132));
        tipoCombo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tipoCombo.setForeground(new java.awt.Color(83, 100, 82));
        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actico circulante", "Activo no cirulante", "Pasivo a corto plazo", "Pasivo a largo plazo", "Capital" }));
        tipoCombo.setBorder(null);

        naturaleza.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        naturaleza.setForeground(new java.awt.Color(222, 213, 200));
        naturaleza.setText("Naturaleza");

        naturalezaInput.setBackground(new java.awt.Color(141, 148, 132));
        naturalezaInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        naturalezaInput.setForeground(new java.awt.Color(83, 100, 82));
        naturalezaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acredora", "Deudora" }));
        naturalezaInput.setBorder(null);

        cantidad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cantidad.setForeground(new java.awt.Color(222, 213, 200));
        cantidad.setText("Cantidad en pesos");

        cantidadInput.setBackground(new java.awt.Color(141, 148, 132));
        cantidadInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cantidadInput.setForeground(new java.awt.Color(83, 100, 82));
        cantidadInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cantidadInput.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cantidadInput)
                    .addComponent(tipoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naturaleza)
                    .addComponent(tipo)
                    .addComponent(cuenta)
                    .addComponent(cuentaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(codigo)
                    .addComponent(codigoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(naturalezaInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidad))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuentaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naturaleza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naturalezaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 360));

        cancelarBtn.setBackground(new java.awt.Color(83, 100, 82));
        cancelarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cancelarBtn.setForeground(new java.awt.Color(222, 213, 200));
        cancelarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBtn.setOpaque(true);
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBtnMousePressed(evt);
            }
        });
        add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 50));

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

    private void cancelarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMousePressed
        ventanaPrincipal.MostrarCatalogoForm();
    }//GEN-LAST:event_cancelarBtnMousePressed

    private void acceptBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBtnMousePressed
        if (!ValidacionesUtils.emptyCheck(codigoInput, codigo)) { return;}
        if (!ValidacionesUtils.emptyCheck(cuentaInput, cuenta)) { return;}
        if (!doubleCheck(cantidadInput, cantidad)) { return;}
        
        CatalogoObject nuevaCuenta = new CatalogoObject(
                codigoInput.getText(),
                cuentaInput.getText(),
                tipoCombo.getSelectedItem().toString(),
                naturalezaInput.getSelectedItem().toString(),
                Double.parseDouble(cantidadInput.getText())
        );
        
        empresaSeleccionada.getMiCatalogo().agregarCatalogo(nuevaCuenta);
        JOptionPane.showMessageDialog(null, "Cuenta registrada exitosamente");
        ventanaPrincipal.MostrarCatalogoForm();
        
    }//GEN-LAST:event_acceptBtnMousePressed

    private boolean doubleCheck(JTextField input, JLabel nombre) {
        String texto = input.getText().trim();
        if (texto.isEmpty()) {
            nombre.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Porfavor rellene el "+ nombre.getText());
            input.requestFocus();
            return false;
        }
        try {
            double campo = Double.parseDouble(texto);
                if (campo < 0) {
                    nombre.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "El campo no puede ser negativo: " + nombre.getText());
                    input.requestFocus();
                    return false; 
                } else {
                    nombre.setForeground(new Color(222, 213, 200));
                    return true;
                }
        } catch (NumberFormatException e) {
                nombre.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad numérica válida en: " + nombre.getText());
                input.requestFocus();
                return false;
            }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptBtn;
    private javax.swing.JLabel cancelarBtn;
    private javax.swing.JLabel cantidad;
    private javax.swing.JTextField cantidadInput;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoInput;
    private javax.swing.JLabel cuenta;
    private javax.swing.JTextField cuentaInput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel naturaleza;
    private javax.swing.JComboBox<String> naturalezaInput;
    private javax.swing.JLabel tipo;
    private javax.swing.JComboBox<String> tipoCombo;
    // End of variables declaration//GEN-END:variables
}
