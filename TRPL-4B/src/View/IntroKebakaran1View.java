/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author rkhis
 */
public class IntroKebakaran1View extends javax.swing.JFrame {

    /**
     * Creates new form IntroBanjir1View
     */
    public IntroKebakaran1View() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void okMouseListener(MouseListener l) {
        this.Button_ok.addMouseListener(l);
    }

    public JButton getButton_ok() {
        return Button_ok;
    }

    public void setButton_ok(JButton Button_ok) {
        this.Button_ok = Button_ok;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Button_ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Intro/kebakaran-2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Intro/kebakaran-3.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Intro/kebakaran-1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        Button_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/PopUp/Ok.png"))); // NOI18N
        Button_ok.setBorderPainted(false);
        Button_ok.setContentAreaFilled(false);
        Button_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_ok.setFocusable(false);
        Button_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_okActionPerformed(evt);
            }
        });
        getContentPane().add(Button_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Level/api.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Level/1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_okActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntroKebakaran1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroKebakaran1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroKebakaran1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroKebakaran1View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroKebakaran1View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_ok;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
