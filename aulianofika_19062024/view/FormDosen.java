/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aulianofika_19062024.view;

import aulianofika_19062024.controller.DosenControler;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author Lab-J2-01
 */
public class FormDosen extends javax.swing.JFrame {

    private final DosenControler controler;
    
    public FormDosen() {
         
        initComponents();
        controler = new DosenControler(this);
        controler.cancel();
        controler.viewData();
    
    }
    
  
    public JTextField getTxtNm() {
        return txtNm;
    }
       public JTextField getTxtNip() {
        return txtNip;
    }
    public JTextField getTxtAlmt() {
        return txtAlmt;
    }
    public JTextField getTxtNohp() {
        return txtNohp;
    }
    public JTextField getTxtEmail() {
        return txtEmail;
    }
    public JTextField getTxtTgllhr() {
        return txtTgllhr;
    }
        public JComboBox<String> getCboJk() {
        return cboJk;
    }
    public JTable getTabelDosen() {
        return TabelDosen;
    }


   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lnama = new javax.swing.JLabel();
        lnip = new javax.swing.JLabel();
        lalamat = new javax.swing.JLabel();
        lnohp = new javax.swing.JLabel();
        lemail = new javax.swing.JLabel();
        ltgllahir = new javax.swing.JLabel();
        ljk = new javax.swing.JLabel();
        cboJk = new javax.swing.JComboBox<>();
        txtNm = new javax.swing.JTextField();
        txtNip = new javax.swing.JTextField();
        txtAlmt = new javax.swing.JTextField();
        txtNohp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTgllhr = new javax.swing.JTextField();
        btnInsrt = new javax.swing.JButton();
        btnUpdt = new javax.swing.JButton();
        btnDlte = new javax.swing.JButton();
        btnCncl = new javax.swing.JButton();
        btnExt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDosen = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM DOSEN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        lnama.setText("Nama");
        getContentPane().add(lnama);
        lnama.setBounds(20, 20, 100, 16);

        lnip.setText("NIP");
        getContentPane().add(lnip);
        lnip.setBounds(20, 60, 90, 16);

        lalamat.setText("Alamat");
        getContentPane().add(lalamat);
        lalamat.setBounds(20, 100, 100, 16);

        lnohp.setText("No.HP");
        getContentPane().add(lnohp);
        lnohp.setBounds(20, 140, 90, 16);

        lemail.setText("Email");
        getContentPane().add(lemail);
        lemail.setBounds(20, 180, 90, 16);

        ltgllahir.setText("Tanggal Lahir");
        getContentPane().add(ltgllahir);
        ltgllahir.setBounds(20, 220, 100, 16);

        ljk.setText("Jenis Kelamin");
        getContentPane().add(ljk);
        ljk.setBounds(20, 260, 110, 20);

        cboJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Kelamin", "L", "P" }));
        cboJk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJkActionPerformed(evt);
            }
        });
        getContentPane().add(cboJk);
        cboJk.setBounds(190, 260, 300, 22);
        getContentPane().add(txtNm);
        txtNm.setBounds(190, 20, 300, 22);
        getContentPane().add(txtNip);
        txtNip.setBounds(190, 60, 300, 22);
        getContentPane().add(txtAlmt);
        txtAlmt.setBounds(190, 100, 300, 22);
        getContentPane().add(txtNohp);
        txtNohp.setBounds(190, 140, 300, 22);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(190, 180, 300, 22);
        getContentPane().add(txtTgllhr);
        txtTgllhr.setBounds(190, 220, 300, 22);

        btnInsrt.setText("Insert");
        btnInsrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsrtActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsrt);
        btnInsrt.setBounds(20, 300, 72, 23);

        btnUpdt.setText("Update");
        btnUpdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdtActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdt);
        btnUpdt.setBounds(120, 300, 72, 23);

        btnDlte.setText("Delete");
        btnDlte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDlte);
        btnDlte.setBounds(220, 300, 72, 23);

        btnCncl.setText("Cancel");
        btnCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCnclActionPerformed(evt);
            }
        });
        getContentPane().add(btnCncl);
        btnCncl.setBounds(340, 300, 72, 23);

        btnExt.setText("Exit");
        btnExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtActionPerformed(evt);
            }
        });
        getContentPane().add(btnExt);
        btnExt.setBounds(450, 300, 72, 23);

        TabelDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "NIP", "Alamat", "No.HP", "Email", "Tanggal Lahir", "Jenis Kelamin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDosenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelDosen);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 350, 660, 150);

        setBounds(0, 0, 695, 552);
    }// </editor-fold>//GEN-END:initComponents

    private void cboJkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJkActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCnclActionPerformed
        // TODO add your handling code here:
        controler.cancel();
    }//GEN-LAST:event_btnCnclActionPerformed

    private void btnExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExtActionPerformed

    private void btnDlteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlteActionPerformed
        // TODO add your handling code here:
        controler.delete();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnDlteActionPerformed

    private void btnUpdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdtActionPerformed
        // TODO add your handling code here:
        controler.update();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnUpdtActionPerformed

    private void btnInsrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsrtActionPerformed
        // TODO add your handling code here:
        controler.insert();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnInsrtActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void TabelDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDosenMouseClicked
        // TODO add your handling code here:
       controler.getDosen();
    }//GEN-LAST:event_TabelDosenMouseClicked

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
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelDosen;
    private javax.swing.JButton btnCncl;
    private javax.swing.JButton btnDlte;
    private javax.swing.JButton btnExt;
    private javax.swing.JButton btnInsrt;
    private javax.swing.JButton btnUpdt;
    private javax.swing.JComboBox<String> cboJk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lalamat;
    private javax.swing.JLabel lemail;
    private javax.swing.JLabel ljk;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lnip;
    private javax.swing.JLabel lnohp;
    private javax.swing.JLabel ltgllahir;
    private javax.swing.JTextField txtAlmt;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNm;
    private javax.swing.JTextField txtNohp;
    private javax.swing.JTextField txtTgllhr;
    // End of variables declaration//GEN-END:variables
}
