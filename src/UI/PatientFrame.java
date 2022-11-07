/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.CreatePatientJForm;
import UI.SystemAdmin;
import javax.swing.JFrame;
import model.CommunityHistory;
import model.DoctorHistory;
import model.HospitalHistory;
import model.PatientHistory;

/**
 *
 * @author parjita
 */
public class PatientFrame extends javax.swing.JFrame {

    PatientHistory patientHistory;
    DoctorHistory doctorHistory;
    HospitalHistory hospitalHistory;
    CommunityHistory communityHistory;
    /**
     * Creates new form PatientFrame
     * @param patientHistory
     * @param doctorHistory
     * @param hospitalHistory
     * @param communityHistory
     */
    public PatientFrame(PatientHistory patientHistory,HospitalHistory hospitalHistory,DoctorHistory doctorHistory,CommunityHistory communityHistory) {
       
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.patientHistory = patientHistory;
        this.doctorHistory = doctorHistory;
        this.hospitalHistory = hospitalHistory;
        this.communityHistory = communityHistory;
    }

    public PatientFrame() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane3 = new javax.swing.JSplitPane();
        PatientLeftPanel = new javax.swing.JPanel();
        CreatePatientList = new javax.swing.JButton();
        ViewPatientList = new javax.swing.JButton();
        PatientUpdateBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        PatientRightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreatePatientList.setBackground(new java.awt.Color(255, 0, 255));
        CreatePatientList.setForeground(new java.awt.Color(255, 255, 255));
        CreatePatientList.setText("Create");
        CreatePatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePatientListActionPerformed(evt);
            }
        });

        ViewPatientList.setBackground(new java.awt.Color(255, 0, 255));
        ViewPatientList.setForeground(new java.awt.Color(255, 255, 255));
        ViewPatientList.setText("View");
        ViewPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPatientListActionPerformed(evt);
            }
        });

        PatientUpdateBtn.setBackground(new java.awt.Color(255, 0, 255));
        PatientUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientUpdateBtn.setText("Update");
        PatientUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientUpdateBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 0, 255));
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PatientLeftPanelLayout = new javax.swing.GroupLayout(PatientLeftPanel);
        PatientLeftPanel.setLayout(PatientLeftPanelLayout);
        PatientLeftPanelLayout.setHorizontalGroup(
            PatientLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CreatePatientList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewPatientList, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addComponent(PatientUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PatientLeftPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PatientLeftPanelLayout.setVerticalGroup(
            PatientLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientLeftPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(CreatePatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ViewPatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PatientUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(PatientLeftPanel);

        PatientRightPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout PatientRightPanelLayout = new javax.swing.GroupLayout(PatientRightPanel);
        PatientRightPanel.setLayout(PatientRightPanelLayout);
        PatientRightPanelLayout.setHorizontalGroup(
            PatientRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        PatientRightPanelLayout.setVerticalGroup(
            PatientRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(PatientRightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreatePatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePatientListActionPerformed

        // TODO add your handling code here:
        CreatePatientJForm CreatePanel = new CreatePatientJForm(patientHistory);
        jSplitPane3.setRightComponent(CreatePanel);
    }//GEN-LAST:event_CreatePatientListActionPerformed

    private void ViewPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPatientListActionPerformed
        // TODO add your handling code here:
        ViewPatientJList ViewPanel = new ViewPatientJList(patientHistory);
        jSplitPane3.setRightComponent(ViewPanel);
    }//GEN-LAST:event_ViewPatientListActionPerformed

    private void PatientUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientUpdateBtnActionPerformed
        // TODO add your handling code here:
        UpdatePatientJList UpdatePanel = new UpdatePatientJList(patientHistory);
        jSplitPane3.setRightComponent(UpdatePanel);
    }//GEN-LAST:event_PatientUpdateBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        SystemAdmin frame = new SystemAdmin(hospitalHistory,doctorHistory,patientHistory,communityHistory);
        frame.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreatePatientList;
    private javax.swing.JPanel PatientLeftPanel;
    private javax.swing.JPanel PatientRightPanel;
    private javax.swing.JButton PatientUpdateBtn;
    private javax.swing.JButton ViewPatientList;
    private javax.swing.JSplitPane jSplitPane3;
    // End of variables declaration//GEN-END:variables
}
