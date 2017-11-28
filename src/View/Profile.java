/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.event.DocumentListener;

/**
 *
 * @author banyu
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnUbah = new javax.swing.JButton();
        FPL = new javax.swing.JPasswordField();
        LbStatus = new javax.swing.JLabel();
        FPB1 = new javax.swing.JPasswordField();
        FPB2 = new javax.swing.JPasswordField();
        BtnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Ubah Password");

        jLabel2.setText("Password Lama");

        jLabel3.setText("Password Baru");

        jLabel4.setText("Masukan Password Baru");

        BtnUbah.setText("Ubah");

        LbStatus.setText("Status");

        FPB1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FPB1KeyReleased(evt);
            }
        });

        FPB2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FPB2KeyReleased(evt);
            }
        });

        BtnBatal.setText("Batal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FPL, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(FPB1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FPB2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnUbah))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LbStatus)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FPB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FPB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUbah)
                    .addComponent(BtnBatal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FPB2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FPB2KeyReleased
        if(getFPB1().equals(getFPB2())){
            LbStatus.setText("Password Sama");
            LbStatus.setForeground(Color.green);
        }
        else{
            LbStatus.setText("Password Berbeda");
            LbStatus.setForeground(Color.red);
        }
    }//GEN-LAST:event_FPB2KeyReleased

    private void FPB1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FPB1KeyReleased
        if(getFPB1().equals(getFPB2())){
            LbStatus.setText("Password Sama");
            LbStatus.setForeground(Color.green);
        }
        else{
            LbStatus.setText("Password Berbeda");
            LbStatus.setForeground(Color.red);
        }
    }//GEN-LAST:event_FPB1KeyReleased

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnUbah;
    private javax.swing.JPasswordField FPB1;
    private javax.swing.JPasswordField FPB2;
    private javax.swing.JPasswordField FPL;
    private javax.swing.JLabel LbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    public void refresh(){
        FPL.setText("");
        FPB1.setText("");
        FPB2.setText("");
    }
    
    public JButton getBtnUbah() {
        return BtnUbah;
    }

    public String getFPB1() {
        return String.valueOf(FPB1.getPassword());
    }

    public String getFPB2() {
        return String.valueOf(FPB2.getPassword());
    }

    public String getFPL() {
        return String.valueOf(FPL.getPassword());
    }
    public void setActionListenr(ActionListener a){
        BtnUbah.addActionListener(a);
        BtnBatal.addActionListener(a);
    }
    public void showMessage(String m) {
        JOptionPane.showMessageDialog(this, m);
    }

    public JButton getBtnBatal() {
        return BtnBatal;
    }
    
    public void LbStatus(){
        LbStatus.setText("");
    }
 }
