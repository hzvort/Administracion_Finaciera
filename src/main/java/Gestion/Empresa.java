
package Gestion;

import App.Main;
import Utils.AspectoUtils;
import function.EmpresaObject;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Empresa extends javax.swing.JPanel {
    private Main ventanaPrincipal;
    DefaultTableModel modelo;        
    
    public Empresa(Main ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        ventanaPrincipal.flatStile();
        initComponents();
        AspectoUtils.tableAspect(jTable1);
        configurarTabla();
        llenarTabla();
    }
    
    private void configurarTabla() {
        String[] columnas = {"Nombre", "RFC", "Giro", "Correo"};
        modelo = new DefaultTableModel(columnas, 0);
        jTable1.setModel(modelo);
    }

    public void llenarTabla() {
        modelo.setRowCount(0);
        for (EmpresaObject e : ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            Object[] fila = {e.getNombre(), e.getRfc(), e.getGiro(), e.getCorreo()};
            modelo.addRow(fila);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BuscarBtn = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JLabel();
        crearBtn = new javax.swing.JLabel();
        buscarText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(221, 213, 201));
        setPreferredSize(new java.awt.Dimension(590, 460));
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
        jTable1.setGridColor(new java.awt.Color(83, 100, 82));
        jTable1.setSelectionBackground(new java.awt.Color(209, 213, 194));
        jTable1.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 250));

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
        add(BuscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 110, 50));

        eliminarBtn.setBackground(new java.awt.Color(83, 100, 82));
        eliminarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(222, 213, 200));
        eliminarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarBtn.setText("Eliminar");
        eliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBtn.setOpaque(true);
        eliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseClicked(evt);
            }
        });
        add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 50));

        crearBtn.setBackground(new java.awt.Color(83, 100, 82));
        crearBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        crearBtn.setForeground(new java.awt.Color(222, 213, 200));
        crearBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearBtn.setText("Crear");
        crearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearBtn.setOpaque(true);
        crearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearBtnMouseClicked(evt);
            }
        });
        add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 110, 50));

        buscarText.setBackground(new java.awt.Color(209, 213, 194));
        buscarText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buscarText.setForeground(new java.awt.Color(83, 100, 82));
        buscarText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscarText.setText("...");
        add(buscarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 350, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseClicked
        ventanaPrincipal.MostrarAddEmpresa();
    }//GEN-LAST:event_crearBtnMouseClicked

    private void eliminarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseClicked
         int fila = jTable1.getSelectedRow();
            if (fila != -1) {
            // 1. Lo borramos de la lista lógica
            ventanaPrincipal.funcionesEmpresa.eliminarEmpresa(fila);
            llenarTabla();
            JOptionPane.showMessageDialog(this, "Empresa eliminada");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila primero");
        }
    }//GEN-LAST:event_eliminarBtnMouseClicked

    private void BuscarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarBtnMousePressed
        String rfcBuscado = buscarText.getText().trim();
        boolean encontrado = false;

        if (rfcBuscado.isEmpty() || rfcBuscado.equals("...")) { JOptionPane.showMessageDialog(this, "Por favor, ingresa un RFC válido para buscar."); return; }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String rfcTabla = jTable1.getValueAt(i, 1).toString();

            if (rfcTabla.equalsIgnoreCase(rfcBuscado)) {
                jTable1.setRowSelectionInterval(i, i);

                jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true));

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró ninguna empresa con el RFC: " + rfcBuscado);
        }
    }//GEN-LAST:event_BuscarBtnMousePressed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarBtn;
    private javax.swing.JTextField buscarText;
    private javax.swing.JLabel crearBtn;
    private javax.swing.JLabel eliminarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
