package Reportes;

import App.Main;
import Utils.AspectoUtils;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import FuncionesReportes.BalanceGeneralFunctions;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class BalanceGeneral extends javax.swing.JPanel {

    Main ventanaPrincipal;
    BalanceGeneralFunctions funcionesBg;
    
    public BalanceGeneral(Main ventanaPrincipal) {
        initComponents();
        this.funcionesBg = new BalanceGeneralFunctions(ventanaPrincipal);
        this.ventanaPrincipal = ventanaPrincipal;
        
        ventanaPrincipal.flatStile();
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(83,100,82) );
        
        AspectoUtils.tableAspect(activoTable); AspectoUtils.tableAspect(pasivoTable); AspectoUtils.tableAspect(capitalTable);
        configurarTabla(activoTable, "Activo"); configurarTabla(pasivoTable, "Pasivo"); configurarTabla(capitalTable, "Capital");
    }
    
    private void configurarTabla(JTable tabla, String tipo) {
        String[] columnas = {tipo, "Importe"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tabla.setModel(modelo);
    }
    
    private void llenarTabla(JTable tabla, String tipo, String tipo2) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        if (comboBalance.getItemCount() == 0 || comboBalance.getSelectedItem().toString().equals("Sin Empresas")) { return; }
        int index = comboBalance.getSelectedIndex();
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        
        for (CatalogoObject cuenta : empresaActual.getMiCatalogo().getMiCatalogo()) {
            if (!cuenta.getTipo().equals(tipo) && !cuenta.getTipo().equals(tipo2)) {continue;}
            
        Object[] fila = {
            cuenta.getNombre(),
            cuenta.getCantidad()
        };
        modelo.addRow(fila);
        }
    }
    
    public void llenarCombo() {
            comboBalance.removeAllItems();
             if (ventanaPrincipal.funcionesEmpresa.empty()) {comboBalance.addItem("Sin Empresas"); return;}
        for (EmpresaObject e: ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            comboBalance.addItem(e.getNombre());
        }
    }
    
    private void generarReporteBalance() {
            llenarTabla(activoTable, "Actico circulante", "Activo no cirulante");
            llenarTabla(pasivoTable, "Pasivo a corto plazo", "Pasivo a largo plazo");
            llenarTabla(capitalTable, "Capital", "YAZMIN");
            
            double activoR, pasivoR, capitalR;
            int index = comboBalance.getSelectedIndex();
            activoR = llenarGenerarReporteBalance(index, "Actico circulante", "Activo no cirulante", "Activo", activoResult);
            pasivoR = llenarGenerarReporteBalance(index, "Pasivo a corto plazo", "Pasivo a largo plazo", "Pasivo", pasivoResult);
            capitalR = llenarGenerarReporteBalance(index, "Capital", "YAZMIN TE AMO", "Capital", capitalResult);
            Result.setText(funcionesBg.checkBalanceGeneral(activoR, pasivoR, capitalR));
        }
    
    private double llenarGenerarReporteBalance(int index,String tipo1, String tipo2, String titulo, JLabel label ) {
        double numero = funcionesBg.sumaTotal(index, tipo1, tipo2);
        label.setText(titulo + " = " + numero); return numero;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBalance = new javax.swing.JComboBox<>();
        Fecha = new javax.swing.JPanel();
        cambioInput = new javax.swing.JTextField();
        generarBtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pasivoTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        capitalTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        activoTable = new javax.swing.JTable();
        Result = new javax.swing.JLabel();
        activoLabel = new javax.swing.JLabel();
        pasivoLabel = new javax.swing.JLabel();
        capitalLabel = new javax.swing.JLabel();
        cambioBtn = new javax.swing.JLabel();
        pasivoResult = new javax.swing.JLabel();
        capitalResult = new javax.swing.JLabel();
        activoResult = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBalance.setBackground(new java.awt.Color(83, 100, 82));
        comboBalance.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboBalance.setForeground(new java.awt.Color(222, 213, 200));
        comboBalance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Empresas" }));
        comboBalance.setBorder(null);
        comboBalance.setOpaque(true);
        add(comboBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 40));

        Fecha.setBackground(new java.awt.Color(83, 100, 82));

        javax.swing.GroupLayout FechaLayout = new javax.swing.GroupLayout(Fecha);
        Fecha.setLayout(FechaLayout);
        FechaLayout.setHorizontalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 40));

        cambioInput.setBackground(new java.awt.Color(209, 213, 194));
        cambioInput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cambioInput.setForeground(new java.awt.Color(83, 100, 82));
        cambioInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cambioInput.setText("...");
        add(cambioInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 120, 40));

        generarBtn.setBackground(new java.awt.Color(83, 100, 82));
        generarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        generarBtn.setForeground(new java.awt.Color(222, 213, 200));
        generarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generarBtn.setText("Generar");
        generarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarBtn.setOpaque(true);
        generarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generarBtnMousePressed(evt);
            }
        });
        add(generarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 120, 50));

        pasivoTable.setBackground(new java.awt.Color(221, 213, 201));
        pasivoTable.setForeground(new java.awt.Color(83, 100, 82));
        pasivoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        pasivoTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        pasivoTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane1.setViewportView(pasivoTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 270, 100));

        capitalTable.setBackground(new java.awt.Color(221, 213, 201));
        capitalTable.setForeground(new java.awt.Color(83, 100, 82));
        capitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        capitalTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        capitalTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane2.setViewportView(capitalTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 570, 110));

        activoTable.setBackground(new java.awt.Color(221, 213, 201));
        activoTable.setForeground(new java.awt.Color(83, 100, 82));
        activoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        activoTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        activoTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane3.setViewportView(activoTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 100));

        Result.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Result.setForeground(new java.awt.Color(83, 100, 82));
        Result.setText("Resultado");
        add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        activoLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        activoLabel.setForeground(new java.awt.Color(83, 100, 82));
        activoLabel.setText("Activo");
        add(activoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        pasivoLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pasivoLabel.setForeground(new java.awt.Color(83, 100, 82));
        pasivoLabel.setText("Pasivo");
        add(pasivoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        capitalLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        capitalLabel.setForeground(new java.awt.Color(83, 100, 82));
        capitalLabel.setText("Capital");
        add(capitalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        cambioBtn.setBackground(new java.awt.Color(83, 100, 82));
        cambioBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cambioBtn.setForeground(new java.awt.Color(222, 213, 200));
        cambioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambioBtn.setText("Aceptar tipo de cambio");
        cambioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambioBtn.setOpaque(true);
        cambioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cambioBtnMousePressed(evt);
            }
        });
        add(cambioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 240, 40));

        pasivoResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pasivoResult.setForeground(new java.awt.Color(83, 100, 82));
        pasivoResult.setText("Sin Pasivo");
        add(pasivoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        capitalResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        capitalResult.setForeground(new java.awt.Color(83, 100, 82));
        capitalResult.setText("Sin Capital");
        add(capitalResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        activoResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        activoResult.setForeground(new java.awt.Color(83, 100, 82));
        activoResult.setText("Sin Activo");
        add(activoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void generarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarBtnMousePressed
        String TextoComboBox = comboBalance.getSelectedItem().toString();
        if (TextoComboBox.equals("Sin Empresas")) {JOptionPane.showMessageDialog(null, "Porfavor cree una empresa antes y sus cuentas"); return;}
        generarReporteBalance();
    }//GEN-LAST:event_generarBtnMousePressed

    private void cambioBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambioBtnMousePressed
        if (!doubleCheck(cambioInput)) { return;}
    }//GEN-LAST:event_cambioBtnMousePressed

    private boolean doubleCheck(JTextField input) {
        String texto = input.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor rellene el tipo de cambio");
            input.requestFocus();
            return false;
        }
        try {
            double campo = Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad numérica válida en el tipo de cambio" );
                input.requestFocus();
                return false;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fecha;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel activoLabel;
    private javax.swing.JLabel activoResult;
    private javax.swing.JTable activoTable;
    private javax.swing.JLabel cambioBtn;
    private javax.swing.JTextField cambioInput;
    private javax.swing.JLabel capitalLabel;
    private javax.swing.JLabel capitalResult;
    private javax.swing.JTable capitalTable;
    public javax.swing.JComboBox<String> comboBalance;
    private javax.swing.JLabel generarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel pasivoLabel;
    private javax.swing.JLabel pasivoResult;
    private javax.swing.JTable pasivoTable;
    // End of variables declaration//GEN-END:variables
}
