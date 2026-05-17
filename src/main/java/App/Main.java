
package App;

import Gestion.*;
import Reportes.*;
import FuncionesGestion.EmpresaFunctions;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JLabel;


public class Main extends javax.swing.JFrame {
    
    private int xmouse, ymouse;
    private final CardLayout cardLayout;
    
    //variables Gestion
    private final Empresa panelEmpresa;
    private final Catalogo panelCatalogo;
    private final AddEmpresa panelAddEmpresa;
    public AddCatalogo panelAddCatalogo;
    
    //variables Reportes
    private final BalanceGeneral panelBalanceGeneral;
    private final EstadoDeResultado panelEstadoResultado;
    private final PartidaDoble panelPartidaDoble;
    private final AnalisisVerticalYHorizontal PanelAnalisisVyH;
    
    
    public EmpresaFunctions funcionesEmpresa = new EmpresaFunctions();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName()); //IGNORAR

    public Main() {
        initComponents();
        cardLayout = new CardLayout();
        content.setLayout(cardLayout);
        
        //variables Gestion
        panelEmpresa = new Empresa(this);
        panelCatalogo = new Catalogo(this);
        panelAddEmpresa = new AddEmpresa(this, panelCatalogo);
        panelAddCatalogo = new AddCatalogo(this);
        
        //variables Reportes
        panelBalanceGeneral = new BalanceGeneral(this);
        panelEstadoResultado = new EstadoDeResultado(this);
        PanelAnalisisVyH = new AnalisisVerticalYHorizontal(this);
        panelPartidaDoble = new PartidaDoble(this);
        
        content.add(panelEmpresa, "PanelEmpresa"); 
        content.add(panelCatalogo, "PanelCatalogo");
        content.add(panelAddEmpresa, "PanelAddEmpresa");
        content.add(panelAddCatalogo, "PanelAddCatalogo");
        
        content.add(panelBalanceGeneral, "PanelBalanceGeneral");
        content.add(panelEstadoResultado, "PanelEstadoDeResultado");
        content.add(PanelAnalisisVyH, "PanelAnalisisVyH");
        content.add(panelPartidaDoble, "PanelPartidaDoble");
        
        panelCatalogo.llenarCombo();
        panelEmpresa.llenarTabla();
        
        cardLayout.show(content, "PanelEmpresa");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        Drag = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        empresaBtn = new javax.swing.JLabel();
        balanceBtn = new javax.swing.JLabel();
        catalogoBtn = new javax.swing.JLabel();
        partidaDobleBtn = new javax.swing.JLabel();
        estadoBtn = new javax.swing.JLabel();
        analisisVHBtn = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(221, 213, 201));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Drag.setBackground(new java.awt.Color(83, 100, 82));
        Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragMouseDragged(evt);
            }
        });
        Drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragMousePressed(evt);
            }
        });

        close.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(221, 213, 201));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DragLayout = new javax.swing.GroupLayout(Drag);
        Drag.setLayout(DragLayout);
        DragLayout.setHorizontalGroup(
            DragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DragLayout.createSequentialGroup()
                .addGap(0, 733, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DragLayout.setVerticalGroup(
            DragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DragLayout.createSequentialGroup()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        bgPanel.add(Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        leftPanel.setBackground(new java.awt.Color(83, 100, 82));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(221, 213, 201));
        leftPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 10));

        empresaBtn.setBackground(new java.awt.Color(221, 213, 201));
        empresaBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        empresaBtn.setForeground(new java.awt.Color(83, 100, 82));
        empresaBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        empresaBtn.setText("Empresa");
        empresaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empresaBtn.setOpaque(true);
        empresaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empresaBtnMousePressed(evt);
            }
        });
        leftPanel.add(empresaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 40));

        balanceBtn.setBackground(new java.awt.Color(192, 213, 184));
        balanceBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        balanceBtn.setForeground(new java.awt.Color(83, 100, 82));
        balanceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balanceBtn.setText("Balance General");
        balanceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balanceBtn.setOpaque(true);
        balanceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                balanceBtnMousePressed(evt);
            }
        });
        leftPanel.add(balanceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 40));

        catalogoBtn.setBackground(new java.awt.Color(192, 213, 184));
        catalogoBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        catalogoBtn.setForeground(new java.awt.Color(83, 100, 82));
        catalogoBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        catalogoBtn.setText("Catalogo De Cuentas");
        catalogoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catalogoBtn.setOpaque(true);
        catalogoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                catalogoBtnMousePressed(evt);
            }
        });
        leftPanel.add(catalogoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 40));

        partidaDobleBtn.setBackground(new java.awt.Color(192, 213, 184));
        partidaDobleBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        partidaDobleBtn.setForeground(new java.awt.Color(83, 100, 82));
        partidaDobleBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        partidaDobleBtn.setText("Partida Doble");
        partidaDobleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partidaDobleBtn.setOpaque(true);
        partidaDobleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                partidaDobleBtnMousePressed(evt);
            }
        });
        leftPanel.add(partidaDobleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 40));

        estadoBtn.setBackground(new java.awt.Color(192, 213, 184));
        estadoBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        estadoBtn.setForeground(new java.awt.Color(83, 100, 82));
        estadoBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoBtn.setText("Estado De Resultado");
        estadoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estadoBtn.setOpaque(true);
        estadoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estadoBtnMousePressed(evt);
            }
        });
        leftPanel.add(estadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 40));

        analisisVHBtn.setBackground(new java.awt.Color(192, 213, 184));
        analisisVHBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        analisisVHBtn.setForeground(new java.awt.Color(83, 100, 82));
        analisisVHBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        analisisVHBtn.setText("Análisis vertical-horizontal ");
        analisisVHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analisisVHBtn.setOpaque(true);
        analisisVHBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                analisisVHBtnMousePressed(evt);
            }
        });
        leftPanel.add(analisisVHBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 40));

        bgPanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        content.setLayout(new java.awt.CardLayout());
        bgPanel.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 590, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarEmpresa() {
        actualizarBotones(empresaBtn);
        panelEmpresa.llenarTabla();
        cardLayout.show(content, "PanelEmpresa");
    }
    
    public void MostrarCatalogo() {
        actualizarBotones(catalogoBtn);
        panelCatalogo.llenarCombo();
        panelCatalogo.llenarTabla();
        cardLayout.show(content, "PanelCatalogo");
    }
    
    public void MostrarAddEmpresa() {cardLayout.show(content, "PanelAddEmpresa");}
    public void MostrarAddCatalogo() {cardLayout.show(content, "PanelAddCatalogo");}
     
    public void MostrarBalanceGeneral() {
        actualizarBotones(balanceBtn);
        panelBalanceGeneral.llenarCombo();
        cardLayout.show(content, "PanelBalanceGeneral");
    }
    
    public void MostrarEstadoDeResultado() {
        actualizarBotones(estadoBtn);
        panelEstadoResultado.llenarCombo();
        cardLayout.show(content, "PanelEstadoDeResultado");
    }
    
    public void MostrarAnalisis() {
        actualizarBotones(analisisVHBtn);
        PanelAnalisisVyH.llenarCombo();
        cardLayout.show(content, "PanelAnalisisVyH");
    }
    
    public void MostrarPartidaDoble() {
        actualizarBotones(partidaDobleBtn);
        panelPartidaDoble.llenarCombo();
        cardLayout.show(content, "PanelPartidaDoble");
    }
    private void actualizarBotones(JLabel botonSeleccionado) {
        List<JLabel> botones = List.of(catalogoBtn, empresaBtn, balanceBtn, estadoBtn, analisisVHBtn,partidaDobleBtn); //importante esto
        for (JLabel btn : botones) {
            if (btn == botonSeleccionado) {
                btn.setBackground(new java.awt.Color(221, 213, 201));
            } else {
                btn.setBackground(new java.awt.Color(192,213,184));
            }
        }
    }
    
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked


    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
        int x,y;
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_DragMouseDragged

    private void DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_DragMousePressed

    private void catalogoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogoBtnMousePressed
        MostrarCatalogo();
    }//GEN-LAST:event_catalogoBtnMousePressed

    private void empresaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaBtnMousePressed
        mostrarEmpresa();
    }//GEN-LAST:event_empresaBtnMousePressed

    private void balanceBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceBtnMousePressed
        MostrarBalanceGeneral();
    }//GEN-LAST:event_balanceBtnMousePressed

    private void estadoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoBtnMousePressed
        MostrarEstadoDeResultado();
    }//GEN-LAST:event_estadoBtnMousePressed

    private void partidaDobleBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidaDobleBtnMousePressed
        MostrarPartidaDoble();
    }//GEN-LAST:event_partidaDobleBtnMousePressed

    private void analisisVHBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analisisVHBtnMousePressed
        MostrarAnalisis();
    }//GEN-LAST:event_analisisVHBtnMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Drag;
    private javax.swing.JLabel analisisVHBtn;
    private javax.swing.JLabel balanceBtn;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel catalogoBtn;
    private javax.swing.JLabel close;
    public javax.swing.JPanel content;
    private javax.swing.JLabel empresaBtn;
    private javax.swing.JLabel estadoBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel partidaDobleBtn;
    // End of variables declaration//GEN-END:variables
}
