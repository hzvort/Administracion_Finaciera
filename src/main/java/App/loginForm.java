package App;

import java.awt.Dialog;
import java.util.Locale;
import javax.swing.JOptionPane;

public class loginForm extends javax.swing.JFrame {
    
    int xmouse, ymouse;
    MainForm ventanaMain = new MainForm();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(loginForm.class.getName());

    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        Drag = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        pasword = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        pasInput = new javax.swing.JPasswordField();
        userInput = new javax.swing.JTextField();
        loginBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        bgPanel.setBackground(new java.awt.Color(221, 213, 201));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Drag.setOpaque(false);
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

        bgPanel.add(Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        headerPanel.setBackground(new java.awt.Color(83, 100, 82));

        titulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(221, 213, 201));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ADMINISTRACION FINANCIERA");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        bgPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 180));

        subtitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(83, 100, 82));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("INICIAR SESIÓN");
        bgPanel.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 800, -1));

        pasword.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        pasword.setForeground(new java.awt.Color(83, 100, 82));
        pasword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pasword.setText("Contraseña");
        bgPanel.add(pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 280, -1));

        usuario.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(83, 100, 82));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuario");
        bgPanel.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, -1));

        pasInput.setBackground(new java.awt.Color(83, 100, 82));
        pasInput.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        pasInput.setForeground(new java.awt.Color(221, 213, 201));
        pasInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pasInput.setText("admin");
        pasInput.setToolTipText("");
        pasInput.setBorder(null);
        pasInput.setOpaque(true);
        bgPanel.add(pasInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 280, 50));

        userInput.setBackground(new java.awt.Color(83, 100, 82));
        userInput.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        userInput.setForeground(new java.awt.Color(221, 213, 201));
        userInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userInput.setText("admin");
        userInput.setToolTipText("");
        userInput.setBorder(null);
        userInput.setOpaque(true);
        userInput.addActionListener(this::userInputActionPerformed);
        bgPanel.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 290, 50));

        loginBtn.setBackground(new java.awt.Color(83, 100, 82));
        loginBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(221, 213, 201));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("Ingresar");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setOpaque(true);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        bgPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void DragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMousePressed
       xmouse = evt.getX();
       ymouse = evt.getY();
    }//GEN-LAST:event_DragMousePressed

    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
       int x,y;
       x = evt.getXOnScreen();
       y = evt.getYOnScreen();
       this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_DragMouseDragged

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
       
        String user = userInput.getText();
        String pass = String.valueOf(pasInput.getPassword());
        
        if (!user.equals("admin")) {JOptionPane.showMessageDialog(null, "Error: Porfavor revise su usuario y contraseña"); return;}
        if (!pass.equals("admin")) {JOptionPane.showMessageDialog(null, "Error: Porfavor revise su usuario y contraseña"); return;}
        
        ventanaMain.setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Bienvenido :P");
        
    }//GEN-LAST:event_loginBtnMouseClicked


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
        java.awt.EventQueue.invokeLater(() -> new loginForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Drag;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel close;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPasswordField pasInput;
    private javax.swing.JLabel pasword;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
