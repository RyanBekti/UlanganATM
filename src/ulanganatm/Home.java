package ulanganatm;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class Home extends javax.swing.JFrame {
     String tarik, str1, pass, trans, no;
        int choice, z ,x ,f ,n ,  pin, counter=0,a=3;
        int t,s,tab=50000,norek=31425364;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        afmk = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ISaldo = new javax.swing.JButton();
        Penyetoran = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        Penarikan = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAKUKAN TRANSAKSI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 40, 130, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Penyetoran");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 90, 100, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bantuan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 140, 90, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Exit");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 80, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Info Saldo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 90, 70, 14);

        afmk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        afmk.setForeground(new java.awt.Color(255, 255, 255));
        afmk.setText("Transfer");
        jPanel1.add(afmk);
        afmk.setBounds(190, 140, 80, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Penarikan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 190, 80, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 30, 250, 230);

        ISaldo.setText(">");
        ISaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISaldoActionPerformed(evt);
            }
        });
        getContentPane().add(ISaldo);
        ISaldo.setBounds(320, 110, 60, 40);

        Penyetoran.setText("<");
        Penyetoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenyetoranActionPerformed(evt);
            }
        });
        getContentPane().add(Penyetoran);
        Penyetoran.setBounds(10, 110, 60, 40);

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 160, 60, 40);

        bExit.setText("<");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        getContentPane().add(bExit);
        bExit.setBounds(10, 210, 60, 40);

        Penarikan.setText(">");
        Penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenarikanActionPerformed(evt);
            }
        });
        getContentPane().add(Penarikan);
        Penarikan.setBounds(320, 210, 60, 40);

        Transfer.setText(">");
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });
        getContentPane().add(Transfer);
        Transfer.setBounds(320, 160, 60, 40);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
    no = JOptionPane.showInputDialog(null,"Masukkan Nomor Tujuan Transfer : " );
    n = Integer.parseInt(no);
    trans = JOptionPane.showInputDialog(null,"Masukkan Jumlah Yang Ditransfer : " );
    f = Integer.parseInt(trans);
        if(f<=tab && f>0){
            if (f>0){
              JOptionPane.showMessageDialog(null," Anda Transfer Sebesar : " + f + "\n Dari No.Rek : " + norek +"\n Kepada No.Rek:"+n);
                tab = tab-f;
                z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO"
                                ,JOptionPane.YES_NO_OPTION, 3);
                if (z==0){
                    pass = JOptionPane.showInputDialog(null,"Masukkan Password : " );
                    x = Integer.parseInt(pass);
                    if(x==1234){
                        JOptionPane.showMessageDialog(null,"Password Benar, \nSilahkan Click OK");
                    }else{
                        JOptionPane.showMessageDialog(null,"Password Salah","ERROR",0);
                        dispose();
                    }
                }else{
                    this.dispose();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"MOHON MAAF :\n1. Jumlah Saldo Anda Kurang \n2. Atau Jumlah Masukkan Tidak Valid \n3. Mohon Cek Saldo","ERROR",0);
        }
    }//GEN-LAST:event_TransferActionPerformed

    private void PenyetoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenyetoranActionPerformed
    str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran: " ); //menabung
    s = Integer.parseInt(str1);
    if (s%100!=0){
        JOptionPane.showMessageDialog(null,"Mesin ATM  BRI tidak mengeluarkan uang koin "
        + "\nSilahkan ulangi kembali","Transaksi GAGAL", 0);
        }else if (s<50000) {
            JOptionPane.showMessageDialog(null,"Jumlah Menyetor Minimal Rp,50000","ERROR",0);
        }else if (s>=50000){
            JOptionPane.showMessageDialog(null,"Anda Menyetor Uang Sebesar : " + s);
            tab = tab+s;
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO"
                                ,JOptionPane.YES_NO_OPTION, 3);
                if (z==0){
                    pass = JOptionPane.showInputDialog(null,"Masukkan Password : " );
                    x = Integer.parseInt(pass);
                    if(x==1234){
                        JOptionPane.showMessageDialog(null,"Password Benar, \nSilahkan Click OK");
                    }else{
                        JOptionPane.showMessageDialog(null,"Password Salah");
                    }
                }else{
                    this.dispose();
                }
            }
    }//GEN-LAST:event_PenyetoranActionPerformed

    private void ISaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISaldoActionPerformed
    JOptionPane.showMessageDialog(null,"Saldo Anda Sebesar :" + tab);
    }//GEN-LAST:event_ISaldoActionPerformed

    private void PenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenarikanActionPerformed
    tarik = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan: " ); //menabung
    t = Integer.parseInt(tarik);
    if (t%100!=0){
        JOptionPane.showMessageDialog(null,"Mesin ATM  BRI tidak menerima uang koin "
        + "\nSilahkan ulangi kembali","Transaksi GAGAL", 0);
        }else if (t>tab) {
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Saldo Anda Kurang\nSilahkan Lakukan Penyetoran!!!","ERROR",0);
        }else if (t<50000) {
            JOptionPane.showMessageDialog(null,"Jumlah Penarikan Minimal Rp,50000","ERROR",0);
        }else if (t>=50000){
            JOptionPane.showMessageDialog(null,"Anda menarik sebesar : " + t);
            tab = tab-t;
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO"
                                ,JOptionPane.YES_NO_OPTION, 3);
                if (z==0){
                    pass = JOptionPane.showInputDialog(null,"Masukkan Password : " );
                    x = Integer.parseInt(pass);
                    if(x==1234){
                        JOptionPane.showMessageDialog(null,"Password Benar, \nSilahkan Click OK");
                    }else{
                        JOptionPane.showMessageDialog(null,"Password Salah","ERROR",0);
                        dispose();
                    }
                }else{
                    this.dispose();
                }
            }
    }//GEN-LAST:event_PenarikanActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bExitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new Bantuan().show();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ISaldo;
    private javax.swing.JButton Penarikan;
    private javax.swing.JButton Penyetoran;
    private javax.swing.JButton Transfer;
    private javax.swing.JLabel afmk;
    private javax.swing.JButton bExit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
    


