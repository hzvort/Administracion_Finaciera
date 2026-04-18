package Jpanel;


import App.MainForm;
import function.EmpresaObject;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Catalogo extends javax.swing.JPanel {
            
        private MainForm ventanaPrincipal;
        DefaultTableModel modelo;
        EmpresaObject empresaObject;
    
    public Catalogo(MainForm ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        ventanaPrincipal.flatStile();
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(83,100,82) );
        initComponents();
        jTable1.getTableHeader().setBackground(new java.awt.Color(83,100,82));
        jTable1.getTableHeader().setForeground(new java.awt.Color(221,213,201));
        configurarTabla();
    }
    
    private void configurarTabla() {
        String[] columnas = {"Codigo", "Nombre de la cuenta", "Tipo de cuenta", "Naturaleza", "cantidad"};
        modelo = new DefaultTableModel(columnas, 0);
        jTable1.setModel(modelo);
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
        add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 110, 50));

        BuscarBtn.setBackground(new java.awt.Color(83, 100, 82));
        BuscarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BuscarBtn.setForeground(new java.awt.Color(222, 213, 200));
        BuscarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarBtn.setText("Buscar");
        BuscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarBtn.setOpaque(true);
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
        add(comboEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMousePressed
        String TextoComboBox = comboEmpresa.getSelectedItem().toString();
        if (TextoComboBox.equals("Sin Empresas")) {JOptionPane.showMessageDialog(null, "Porfavor cree una empresa antes"); return;}
        AddCatalogo ac = new AddCatalogo(ventanaPrincipal);
        ventanaPrincipal.showPanel(ac);
    }//GEN-LAST:event_crearBtnMousePressed


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
