package Reportes;

import App.Main;
import FuncionesGestion.CatalogoObject;
import FuncionesGestion.EmpresaObject;
import FuncionesReportes.EstadoDeResultadoFunctions;
import Exportar.ExportadorEstadoCSV;
import Utils.AspectoUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstadoDeResultado extends javax.swing.JPanel {
    
    private final Main ventanaPrincipal;
    private final EstadoDeResultadoFunctions funcionesER;
    private final ExportadorEstadoCSV exportarEstadoCSV;
    private boolean isGenerated = false;
    
    public EstadoDeResultado(Main ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.funcionesER = new EstadoDeResultadoFunctions(ventanaPrincipal);
        this.exportarEstadoCSV = new ExportadorEstadoCSV(ventanaPrincipal);
        
        AspectoUtils.tableAspect(utilidadBrutaTable); AspectoUtils.tableAspect(UtilidadAntesImpuestoTable);
        AspectoUtils.tableAspect(UtilidadNetaTable); AspectoUtils.tableAspect(UtilidadOperacionesTable);
        AspectoUtils.flatStile();
        
        configurarTabla(utilidadBrutaTable);  configurarTabla(UtilidadAntesImpuestoTable);
        configurarTabla(UtilidadNetaTable);  configurarTabla(UtilidadOperacionesTable);
    }
    
    private void configurarTabla(JTable tabla) {
        String[] columnas = {"Tipo", "Importe"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tabla.setModel(modelo);
    }
    
    private void llenarTabla(JTable tabla, String tipo, String tipo2) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        if (comboEstado.getItemCount() == 0 || comboEstado.getSelectedItem().toString().equals("Sin Empresas")) { return; }
        int index = comboEstado.getSelectedIndex();
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
            comboEstado.removeAllItems();
             if (ventanaPrincipal.funcionesEmpresa.empty()) {comboEstado.addItem("Sin Empresas"); return;}
        for (EmpresaObject e: ventanaPrincipal.funcionesEmpresa.getEmpresas()) {
            comboEstado.addItem(e.getNombre());
        }
    }
    
    private void generarEstadoDeResultado() {
        
       llenarTabla(utilidadBrutaTable, "Ventas", "Costo de venta");
       llenarTabla(UtilidadOperacionesTable, "Gastos de operación", "Me gustan los pandas :P");
       llenarTabla(UtilidadAntesImpuestoTable, "Productos financieros", "Gastos financieros");
       llenarTabla(UtilidadNetaTable, "Impuestos", "La que tiene lentes y empieza con Y PLZ EMBARAZAME Y ABANDONAME");
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generarBtn = new javax.swing.JLabel();
        ExportarBtn = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        utilidadBrutaTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        UtilidadOperacionesTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        UtilidadNetaTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        UtilidadAntesImpuestoTable = new javax.swing.JTable();
        utilidadBruta = new javax.swing.JLabel();
        utilidadOperaciones = new javax.swing.JLabel();
        UtilidadAntesImpuesto = new javax.swing.JLabel();
        UtilidadNeta = new javax.swing.JLabel();
        UtilidadBrutaResult = new javax.swing.JLabel();
        UtilidadOperacionesResult = new javax.swing.JLabel();
        UtilidadAntesImpuestoResult = new javax.swing.JLabel();
        UtilidadNetaResult = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 213, 201));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ExportarBtn.setBackground(new java.awt.Color(83, 100, 82));
        ExportarBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ExportarBtn.setForeground(new java.awt.Color(222, 213, 200));
        ExportarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExportarBtn.setText("Exportar");
        ExportarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportarBtn.setOpaque(true);
        ExportarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportarBtnMouseClicked(evt);
            }
        });
        add(ExportarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 120, 50));

        comboEstado.setBackground(new java.awt.Color(83, 100, 82));
        comboEstado.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        comboEstado.setForeground(new java.awt.Color(222, 213, 200));
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Empresas" }));
        comboEstado.setBorder(null);
        comboEstado.setOpaque(true);
        add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 40));

        jScrollPane3.setBorder(null);
        jScrollPane3.setToolTipText("");

        utilidadBrutaTable.setBackground(new java.awt.Color(221, 213, 201));
        utilidadBrutaTable.setForeground(new java.awt.Color(83, 100, 82));
        utilidadBrutaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        utilidadBrutaTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        utilidadBrutaTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane3.setViewportView(utilidadBrutaTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 120));

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");

        UtilidadOperacionesTable.setBackground(new java.awt.Color(221, 213, 201));
        UtilidadOperacionesTable.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadOperacionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        UtilidadOperacionesTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        UtilidadOperacionesTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane1.setViewportView(UtilidadOperacionesTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 120));

        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");

        UtilidadNetaTable.setBackground(new java.awt.Color(221, 213, 201));
        UtilidadNetaTable.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadNetaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        UtilidadNetaTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        UtilidadNetaTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane2.setViewportView(UtilidadNetaTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 240, 120));

        jScrollPane4.setBorder(null);
        jScrollPane4.setToolTipText("");

        UtilidadAntesImpuestoTable.setBackground(new java.awt.Color(221, 213, 201));
        UtilidadAntesImpuestoTable.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadAntesImpuestoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        UtilidadAntesImpuestoTable.setSelectionBackground(new java.awt.Color(209, 213, 194));
        UtilidadAntesImpuestoTable.setSelectionForeground(new java.awt.Color(83, 100, 82));
        jScrollPane4.setViewportView(UtilidadAntesImpuestoTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 240, 120));

        utilidadBruta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        utilidadBruta.setForeground(new java.awt.Color(83, 100, 82));
        utilidadBruta.setText("Utilidad Bruta");
        add(utilidadBruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        utilidadOperaciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        utilidadOperaciones.setForeground(new java.awt.Color(83, 100, 82));
        utilidadOperaciones.setText("Utilidad de operaciones");
        add(utilidadOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        UtilidadAntesImpuesto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadAntesImpuesto.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadAntesImpuesto.setText("Utilidad antes del impuesto");
        add(UtilidadAntesImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        UtilidadNeta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadNeta.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadNeta.setText("Utilidad neta / perdidad");
        add(UtilidadNeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        UtilidadBrutaResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadBrutaResult.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadBrutaResult.setText("Sin utilidad bruta");
        add(UtilidadBrutaResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        UtilidadOperacionesResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadOperacionesResult.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadOperacionesResult.setText("Sin utilidad de operaciones");
        add(UtilidadOperacionesResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        UtilidadAntesImpuestoResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadAntesImpuestoResult.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadAntesImpuestoResult.setText("Sin utilidad antes de impuesto");
        add(UtilidadAntesImpuestoResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        UtilidadNetaResult.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        UtilidadNetaResult.setForeground(new java.awt.Color(83, 100, 82));
        UtilidadNetaResult.setText("Sin utilidad neta");
        add(UtilidadNetaResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void generarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarBtnMousePressed
        String TextoComboBox = comboEstado.getSelectedItem().toString();
        if (TextoComboBox.equals("Sin Empresas")) {
        JOptionPane.showMessageDialog(null, "Porfavor cree una empresa antes y sus cuentas"); 
        ventanaPrincipal.mostrarEmpresa(); 
        return;
    }
        
        int index = comboEstado.getSelectedIndex();
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        
        if (empresaActual.getMiCatalogo().getMiCatalogo().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor cree las cuentas primero"); 
            ventanaPrincipal.MostrarCatalogo(); 
            return;
        }
        
        generarEstadoDeResultado();
        double utilidadBruta = funcionesER.calcularUtilidadBruta(index);
        double utilidadOperacion = funcionesER.calcularUtilidadDeOperaciones(index, utilidadBruta);
        double antesImpuesto = funcionesER.calcularUtilidadAntesDeImpuesto(index, utilidadOperacion);
        double neto = funcionesER.calcularUtilidadNeta(index, antesImpuesto);
        

        UtilidadBrutaResult.setText("Utilidad Bruta = " + utilidadBruta);
        UtilidadOperacionesResult.setText("Utilidad de operaciones = " + utilidadOperacion);
        UtilidadAntesImpuestoResult.setText("Utilidad antes de impuesto = " + antesImpuesto);
        UtilidadNetaResult.setText("Utilidad Neta = " + neto);
        isGenerated = true;
    }//GEN-LAST:event_generarBtnMousePressed

    private void ExportarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarBtnMouseClicked
        if (!isGenerated) {
            JOptionPane.showMessageDialog(null,"Porfavor genere el estado de resultados primero");
            return;
        }
        int index = comboEstado.getSelectedIndex();
        EmpresaObject empresaActual = ventanaPrincipal.funcionesEmpresa.getEmpresas().get(index);
        
        String contenido = """
                         Estado de resultado""" + "\n";
        contenido += empresaActual.getNombre() + "\n";
        contenido +=  LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        contenido += "MX NN PESOS" + "\n \n";
        
        double utilidadBruta = funcionesER.calcularUtilidadBruta(index);
        double utilidadOperacion = funcionesER.calcularUtilidadDeOperaciones(index, utilidadBruta);
        double antesImpuesto = funcionesER.calcularUtilidadAntesDeImpuesto(index, utilidadOperacion);
        double neto = funcionesER.calcularUtilidadNeta(index, antesImpuesto);

        contenido = exportarEstadoCSV.filtro(index, "Ventas", contenido);
        contenido = exportarEstadoCSV.filtro(index, "Costo de venta", contenido);
        contenido += "Utilidad bruta,," + "$" + utilidadBruta + "\n \n";
        contenido = exportarEstadoCSV.filtro(index, "Gastos de operación", contenido);
        contenido += "Utilidad de operaciones,," + "$" + utilidadOperacion + "\n \n";
        contenido = exportarEstadoCSV.filtro(index, "Productos financieros", contenido);
        contenido = exportarEstadoCSV.filtro(index, "Gastos financieros", contenido);
        contenido += "Utilidad antes de impuesto,," + "$" + antesImpuesto + "\n \n";
        contenido = exportarEstadoCSV.filtro(index, "Impuestos", contenido);
        contenido += "Utilidad neta,," + "$" + neto + "\n";

        ExportadorEstadoCSV.crearArchivo(contenido, comboEstado.getSelectedItem().toString());
    }//GEN-LAST:event_ExportarBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExportarBtn;
    private javax.swing.JLabel UtilidadAntesImpuesto;
    private javax.swing.JLabel UtilidadAntesImpuestoResult;
    private javax.swing.JTable UtilidadAntesImpuestoTable;
    private javax.swing.JLabel UtilidadBrutaResult;
    private javax.swing.JLabel UtilidadNeta;
    private javax.swing.JLabel UtilidadNetaResult;
    private javax.swing.JTable UtilidadNetaTable;
    private javax.swing.JLabel UtilidadOperacionesResult;
    private javax.swing.JTable UtilidadOperacionesTable;
    public javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel generarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel utilidadBruta;
    private javax.swing.JTable utilidadBrutaTable;
    private javax.swing.JLabel utilidadOperaciones;
    // End of variables declaration//GEN-END:variables
}
