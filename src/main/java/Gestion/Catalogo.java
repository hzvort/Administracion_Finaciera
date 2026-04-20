package Gestion;


import App.Main;
import Utils.AspectoUtils;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Catalogo extends javax.swing.JPanel {
            
        Main ventanaPrincipal;
        DefaultTableModel modelo;
        EmpresaObject miEmpresa;
    
    public Catalogo(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        ventanaPrincipal.flatStile();
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(83,100,82) );
        initComponents();
        AspectoUtils.tableAspect(jTable1);
        configurarTabla();
        llenarTabla();
    }
    
    private void configurarTabla() {
        String[] columnas = {"Codigo", "Nombre de la cuenta", "Tipo de cuenta", "Naturaleza", "Importe"};
        modelo = new DefaultTableModel(columnas, 0);
        jTable1.setModel(modelo);
    }
    
    public void llenarTabla() {
        modelo.setRowCount(0);
        if (comboEmpresa.getItemCount() == 0 || comboEmpresa.getSelectedItem().toString().equals("Sin Empresas")) { return; }
        int index = comboEmpresa.getSelectedIndex();
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
        Object[] fila = {
            cuenta.getCodigo(),
            cuenta.getNombre(),
            cuenta.getTipo(),
            cuenta.getNaturaleza(),
            cuenta.getCantidad()
        };
        modelo.addRow(fila);
        }
    }
    
    public void llenarCombo() {
            comboEmpresa.removeAllItems();
             if (ventanaPrincipal.funcionesEmpresa.empty()) {comboEmpresa.addItem("Sin Empresas"); return;}
        for (EmpresaObject e: ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            comboEmpresa.addItem(e.getNombre());
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buscarText = new javax.swing.JTextField();
        eliminarBtn = new javax.swing.JLabel();
        BuscarBtn = new javax.swing.JLabel();
        crearBtn = new javax.swing.JLabel();
        comboEmpresa = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(221, 213, 201));
        jTable1.setForeground(new java.awt.Color(83, 100, 82));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(209, 213, 194));
        jTable1.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 570, 190));

        buscarText.setBackground(new java.awt.Color(209, 213, 194));
        buscarText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscarText.setForeground(new java.awt.Color(83, 100, 82));
        buscarText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscarText.setText("...");
        add(buscarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, 50));

        eliminarBtn.setBackground(new java.awt.Color(83, 100, 82));
        eliminarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(222, 213, 200));
        eliminarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarBtn.setText("Eliminar");
        eliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBtn.setOpaque(true);
        eliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarBtnMousePressed(evt);
            }
        });
        add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 50));

        BuscarBtn.setBackground(new java.awt.Color(83, 100, 82));
        BuscarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BuscarBtn.setForeground(new java.awt.Color(222, 213, 200));
        BuscarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarBtn.setText("Buscar");
        BuscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarBtn.setOpaque(true);
        BuscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarBtnMousePressed(evt);
            }
        });
        add(BuscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 110, 50));

        crearBtn.setBackground(new java.awt.Color(83, 100, 82));
        crearBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        crearBtn.setForeground(new java.awt.Color(222, 213, 200));
        crearBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearBtn.setText("Crear");
        crearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearBtn.setOpaque(true);
        crearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crearBtnMousePressed(evt);
            }
        });
        add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 110, 50));

        comboEmpresa.setBackground(new java.awt.Color(83, 100, 82));
        comboEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboEmpresa.setForeground(new java.awt.Color(222, 213, 200));
        comboEmpresa.setBorder(null);
        comboEmpresa.setOpaque(true);
        comboEmpresa.addActionListener(this::comboEmpresaActionPerformed);
        add(comboEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMousePressed
        String TextoComboBox = comboEmpresa.getSelectedItem().toString();
        if (TextoComboBox.equals("Sin Empresas")) {JOptionPane.showMessageDialog(null, "Porfavor cree una empresa antes"); return;}
        int indexSeleccionado = comboEmpresa.getSelectedIndex();
        miEmpresa = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(indexSeleccionado);
        ventanaPrincipal.addCat.setEmpresa(miEmpresa);
        ventanaPrincipal.MostrarAddCatalogo();
    }//GEN-LAST:event_crearBtnMousePressed

    private void eliminarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMousePressed
         int fila = jTable1.getSelectedRow();
         int indexEmpresa = comboEmpresa.getSelectedIndex();
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(indexEmpresa);
            if (fila != -1) {
            empresaActual.getMiCatalogo().eliminarCatalogo(fila);
            llenarTabla();
            JOptionPane.showMessageDialog(this, "Cuenta Eliminada");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila primero");
        }
    }//GEN-LAST:event_eliminarBtnMousePressed

    private void BuscarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarBtnMousePressed
       String codigoBuscado = buscarText.getText().trim();
       boolean encontrado = false;
       
       if (codigoBuscado.isEmpty() || codigoBuscado.equals("...")) { JOptionPane.showMessageDialog(this, "Por favor, ingresa un codigo válido para buscar."); return; }
       
       for (int i = 0; i < jTable1.getRowCount(); i++) {
            String codigoTabla = jTable1.getValueAt(i, 0).toString();

            if (codigoTabla.equalsIgnoreCase(codigoBuscado)) {
                jTable1.setRowSelectionInterval(i, i);
                jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true));
                encontrado = true;
                break;
            }
        }
       
       if (!encontrado) {JOptionPane.showMessageDialog(this, "No se encontró ninguna cuenta con el codigo: " + codigoBuscado);}
    }//GEN-LAST:event_BuscarBtnMousePressed

    private void comboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpresaActionPerformed
        llenarTabla();
    }//GEN-LAST:event_comboEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarBtn;
    private javax.swing.JTextField buscarText;
    public javax.swing.JComboBox<String> comboEmpresa;
    private javax.swing.JLabel crearBtn;
    private javax.swing.JLabel eliminarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
