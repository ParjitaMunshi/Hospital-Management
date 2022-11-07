/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JFrame;
import model.CommunityHistory;
import model.DoctorHistory;
import model.HospitalHistory;
import model.PatientHistory;

/**
 *
 * @author parjita
 */
public class HospitalAdminMainFrame extends javax.swing.JFrame {

    CommunityHistory communityHistory;
    PatientHistory patientHistory;
    HospitalHistory hospitalHistory;
    DoctorHistory doctorHistory;
    /**
     * Creates new form HospitalAdminMainFrame
     * @param communityHistory
     * @param patientHistory
     * @param doctorHistory
     * @param hospitalHistory
     */
    public HospitalAdminMainFrame(CommunityHistory communityHistory,PatientHistory patientHistory,DoctorHistory doctorHistory,HospitalHistory hospitalHistory) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.doctorHistory = doctorHistory;
        this.patientHistory = patientHistory;
        this.communityHistory = communityHistory;
        this.hospitalHistory = hospitalHistory;
    }

    public HospitalAdminMainFrame() {
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
        CommunityBtn = new javax.swing.JButton();
        HospitalBtn = new javax.swing.JButton();
        DoctorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Admin");

        CommunityBtn.setBackground(new java.awt.Color(255, 0, 255));
        CommunityBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommunityBtn.setText("Community");
        CommunityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityBtnActionPerformed(evt);
            }
        });

        HospitalBtn.setBackground(new java.awt.Color(255, 0, 255));
        HospitalBtn.setForeground(new java.awt.Color(255, 255, 255));
        HospitalBtn.setText("Hospitals");
        HospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalBtnActionPerformed(evt);
            }
        });

        DoctorBtn.setBackground(new java.awt.Color(255, 0, 255));
        DoctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        DoctorBtn.setText("Doctor");
        DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommunityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(CommunityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(HospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommunityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityBtnActionPerformed
        // TODO add your handling code here:
        CommunityFrame frame = new CommunityFrame(communityHistory,hospitalHistory,doctorHistory,patientHistory);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_CommunityBtnActionPerformed

    private void HospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalBtnActionPerformed
        // TODO add your handling code here:
        HospitalFrame frame = new HospitalFrame(hospitalHistory,doctorHistory,patientHistory,communityHistory);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_HospitalBtnActionPerformed

    private void DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBtnActionPerformed
        // TODO add your handling code here:
        DoctorFrame frame = new DoctorFrame(doctorHistory,hospitalHistory,patientHistory,communityHistory);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_DoctorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalAdminMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommunityBtn;
    private javax.swing.JButton DoctorBtn;
    private javax.swing.JButton HospitalBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
