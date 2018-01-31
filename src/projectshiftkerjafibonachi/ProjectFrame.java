/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sigit Yudhianto
 */
public class ProjectFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProjectFrame
     */
    public ProjectFrame() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Otext = new javax.swing.JTextArea();
        Bschdule = new javax.swing.JButton();
        Ipekerja = new javax.swing.JTextField();
        Ihari = new javax.swing.JTextField();
        Breset = new javax.swing.JButton();
        Bclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENJADWALAN SHIFT FIBONACCI");

        jLabel2.setText("Jumlah Pekerja");

        jLabel3.setText("Jumlah Hari Kerja");

        jLabel4.setText("Orang");

        jLabel5.setText("Hari");

        Otext.setColumns(20);
        Otext.setRows(5);
        jScrollPane1.setViewportView(Otext);

        Bschdule.setText("SCHEDULE!!");
        Bschdule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BschduleActionPerformed(evt);
            }
        });

        Ipekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpekerjaActionPerformed(evt);
            }
        });
        Ipekerja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IpekerjaKeyReleased(evt);
            }
        });

        Ihari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IhariActionPerformed(evt);
            }
        });

        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        Bclose.setText("Close");
        Bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ihari, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ipekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(45, 45, 45)
                        .addComponent(Bschdule)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Breset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bclose)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(Ipekerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(Ihari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Bschdule, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Breset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bclose)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BschduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BschduleActionPerformed
        if (Ipekerja.getText().equals("")||(Ihari.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Jumlah Pekerja dan Jumlah hari TIDAK BOLEH Kosong!!");
            Ipekerja.requestFocus();
        }else{
        Integer vpekerja = Integer.valueOf(Ipekerja.getText());
        Integer vhari = Integer.valueOf(Ihari.getText());
        
        Pekerja p1=new Pekerja();
        Hari h2=new Pekerja();
        List hp = null;
        List hr = null;
        try {
            hp = p1.HitungPekerja(vpekerja);
            hr = h2.HitungHari(vhari);
        }catch(NullPointerException ne){
            System.exit(0);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }    
        Otext.setText(p1.print(hp, hr, vpekerja));
    }//GEN-LAST:event_BschduleActionPerformed
    }
    
    private void IpekerjaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IpekerjaKeyReleased
        
    }//GEN-LAST:event_IpekerjaKeyReleased

    private void IpekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpekerjaActionPerformed
        if (Ipekerja.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Jumlah Pekerja TIDAK BOLEH Kosong!!");
            Ipekerja.requestFocus();
        }else{
        Integer vpekerja = Integer.valueOf(Ipekerja.getText());
        try {
            if (Validasi.validasiPekerja(vpekerja)) {
                Ihari.requestFocus();
            }
        }catch(NumberFormatException nfe){
            System.out.println("input harus int");
        } catch (CustomException ex) {
            Ipekerja.setText("");
            Ipekerja.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_IpekerjaActionPerformed
    }
    
    private void IhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IhariActionPerformed
        if (Ihari.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Jumlah hari TIDAK BOLEH Kosong!!");
            Ihari.requestFocus();
        }else{
        Integer vhari = Integer.valueOf(Ihari.getText());
        try {
            if (Validasi.validasiHari(vhari)) {
                BschduleActionPerformed(evt);
            }
        }catch(NumberFormatException nfe){
            System.out.println("input harus int");
        } catch (CustomException ex) {
            Ihari.setText("");
            Ihari.requestFocus();
        }// TOD// TODO add your handling code here:
    }//GEN-LAST:event_IhariActionPerformed
    }
    
    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        Ipekerja.setText("");
        Ihari.setText("");
        Otext.setText("");
        Ipekerja.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_BresetActionPerformed

    private void BcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcloseActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BcloseActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclose;
    private javax.swing.JButton Breset;
    private javax.swing.JButton Bschdule;
    private javax.swing.JTextField Ihari;
    private javax.swing.JTextField Ipekerja;
    private javax.swing.JTextArea Otext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
