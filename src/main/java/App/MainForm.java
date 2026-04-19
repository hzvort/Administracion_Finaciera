
package App;

import Jpanel.AddCatalogo;
import Jpanel.AddEmpresaForm;
import Jpanel.CatalogoForm;
import Jpanel.EmpresaForm;
import com.formdev.flatlaf.FlatLightLaf;
import function.EmpresaFunctions;
import java.awt.CardLayout;
import javax.swing.UIManager;


public class MainForm extends javax.swing.JFrame {
    
    int xmouse, ymouse;
    EmpresaForm ef;
    public AddEmpresaForm addEf;
    public AddCatalogo addCat;
    CatalogoForm cat;
    public CardLayout cardLayout;
    
    public EmpresaFunctions funcionesEmpresa = new EmpresaFunctions();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainForm.class.getName());

    public MainForm() {
        initComponents();
        cardLayout = new CardLayout();
        content.setLayout(cardLayout);
        
        ef = new EmpresaForm(this);
        cat = new CatalogoForm(this);
        
        addEf = new AddEmpresaForm(this, cat);
        addCat = new AddCatalogo(this);
        
        content.add(ef, "PanelEmpresa"); 
        content.add(cat, "PanelCatalogo");
        content.add(addEf, "PanelAddEmpresa");
        content.add(addCat, "PanelAddCatalogo");
        
        cat.llenarCombo();
        ef.llenarTabla();
        this.setLocationRelativeTo(null);
        cardLayout.show(content, "PanelEmpresa");
    }
    
    public void flatStile() {
     try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        UIManager.put( "ComboBox.background", new java.awt.Color(141,148,132) );
        UIManager.put( "ComboBox.buttonBackground", new java.awt.Color(141,148,132) );
        UIManager.put( "ComboBox.selectionBackground", new java.awt.Color(209,213,194) );
        UIManager.put( "ComboBox.foreground", new java.awt.Color(83,100,82) );
        UIManager.put( "ComboBox.buttonArrowColor", new java.awt.Color(222,213,200) );
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
        catalogoBtn = new javax.swing.JLabel();
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

        empresaBtn.setBackground(new java.awt.Color(192, 213, 184));
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

        catalogoBtn.setBackground(new java.awt.Color(221, 213, 201));
        catalogoBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        catalogoBtn.setForeground(new java.awt.Color(83, 100, 82));
        catalogoBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        catalogoBtn.setText("Catalogo de cuentas");
        catalogoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catalogoBtn.setOpaque(true);
        catalogoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                catalogoBtnMousePressed(evt);
            }
        });
        leftPanel.add(catalogoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 40));

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

    
    public void mostrarEmpresaForm() {
        empresaBtn.setBackground(new java.awt.Color(192,213,184));
        catalogoBtn.setBackground(new java.awt.Color(221, 213, 201));
        ef.llenarTabla();
        cardLayout.show(content, "PanelEmpresa");
    }
    
    public void MostrarCatalogoForm() {
        catalogoBtn.setBackground(new java.awt.Color(192,213,184));
        empresaBtn.setBackground(new java.awt.Color(221, 213, 201));
        cat.llenarTabla();
        cardLayout.show(content, "PanelCatalogo");
    }
    
    public void MostrarAddEmpresa() {cardLayout.show(content, "PanelAddEmpresa");}
    public void MostrarAddCatalogo() {cardLayout.show(content, "PanelAddCatalogo");}
    
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
        MostrarCatalogoForm();
    }//GEN-LAST:event_catalogoBtnMousePressed

    private void empresaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaBtnMousePressed
        mostrarEmpresaForm();
    }//GEN-LAST:event_empresaBtnMousePressed

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
        java.awt.EventQueue.invokeLater(() -> new MainForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Drag;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel catalogoBtn;
    private javax.swing.JLabel close;
    public javax.swing.JPanel content;
    private javax.swing.JLabel empresaBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    // End of variables declaration//GEN-END:variables
}
