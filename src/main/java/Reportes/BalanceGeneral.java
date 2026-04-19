package Reportes;

import App.Main;
import javax.swing.JTable;
import javax.swing.UIManager;

public class BalanceGeneral extends javax.swing.JPanel {

    
    public BalanceGeneral(Main ventanaPrincipal) {
        initComponents();
        ventanaPrincipal.flatStile();
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(83,100,82) );
        tableAspect(activoTable); tableAspect(pasivoTable); tableAspect(capitalTable);
    }
    
    private void tableAspect(JTable tabla) {
        tabla.getTableHeader().setBackground(new java.awt.Color(83,100,82));
        tabla.getTableHeader().setForeground(new java.awt.Color(221,213,201));
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
        cambioBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBalance.setBackground(new java.awt.Color(83, 100, 82));
        comboBalance.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboBalance.setForeground(new java.awt.Color(222, 213, 200));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 280, 100));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 570, 130));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 100));

        cambioBtn.setBackground(new java.awt.Color(83, 100, 82));
        cambioBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cambioBtn.setForeground(new java.awt.Color(222, 213, 200));
        cambioBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambioBtn.setText("Aceptar tipo de cambio");
        cambioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambioBtn.setOpaque(true);
        add(cambioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 240, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fecha;
    private javax.swing.JTable activoTable;
    private javax.swing.JLabel cambioBtn;
    private javax.swing.JTextField cambioInput;
    private javax.swing.JTable capitalTable;
    public javax.swing.JComboBox<String> comboBalance;
    private javax.swing.JLabel generarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pasivoTable;
    // End of variables declaration//GEN-END:variables
}
