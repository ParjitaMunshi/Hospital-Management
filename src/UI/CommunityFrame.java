/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

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
public class CommunityFrame extends javax.swing.JFrame {

    CommunityHistory communityHistory;
    PatientHistory patientHistory;
    DoctorHistory doctorHistory;
    HospitalHistory hospitalHistory;
    
    /**
     * Creates new form CommunityFrame
     * @param communityHistory
     * @param hospitalHistory
     * @param doctorHistory
     * @param patientHistory
     */
    public CommunityFrame(CommunityHistory communityHistory,HospitalHistory hospitalHistory,DoctorHistory doctorHistory,PatientHistory patientHistory) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         this.hospitalHistory = hospitalHistory;
        this.doctorHistory = doctorHistory;
        this.patientHistory = patientHistory;
        this.communityHistory = communityHistory;
    }

    public CommunityFrame() {
         }

    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        CommunityLeftPanel = new javax.swing.JPanel();
        CreateCommunityList = new javax.swing.JButton();
        ViewCommunityList = new javax.swing.JButton();
        CommunityUpdateBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        CommunityRightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CommunityLeftPanel.setPreferredSize(new java.awt.Dimension(32767, 32767));

        CreateCommunityList.setBackground(new java.awt.Color(255, 51, 255));
        CreateCommunityList.setForeground(new java.awt.Color(255, 255, 255));
        CreateCommunityList.setText("Create");
        CreateCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCommunityListActionPerformed(evt);
            }
        });

        ViewCommunityList.setBackground(new java.awt.Color(255, 0, 255));
        ViewCommunityList.setForeground(new java.awt.Color(255, 255, 255));
        ViewCommunityList.setText("View");
        ViewCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCommunityListActionPerformed(evt);
            }
        });

        CommunityUpdateBtn.setBackground(new java.awt.Color(255, 0, 255));
        CommunityUpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommunityUpdateBtn.setText("Update");
        CommunityUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityUpdateBtnActionPerformed(evt);
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

        javax.swing.GroupLayout CommunityLeftPanelLayout = new javax.swing.GroupLayout(CommunityLeftPanel);
        CommunityLeftPanel.setLayout(CommunityLeftPanelLayout);
        CommunityLeftPanelLayout.setHorizontalGroup(
            CommunityLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommunityLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CommunityLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CommunityLeftPanelLayout.createSequentialGroup()
                        .addGroup(CommunityLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CommunityUpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreateCommunityList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewCommunityList, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BackBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CommunityLeftPanelLayout.setVerticalGroup(
            CommunityLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommunityLeftPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(CreateCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ViewCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CommunityUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jSplitPane1.setLeftComponent(CommunityLeftPanel);

        CommunityRightPanel.setPreferredSize(new java.awt.Dimension(32767, 32767));

        javax.swing.GroupLayout CommunityRightPanelLayout = new javax.swing.GroupLayout(CommunityRightPanel);
        CommunityRightPanel.setLayout(CommunityRightPanelLayout);
        CommunityRightPanelLayout.setHorizontalGroup(
            CommunityRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        CommunityRightPanelLayout.setVerticalGroup(
            CommunityRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(CommunityRightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCommunityListActionPerformed

        // TODO add your handling code here:
        CreateCommunityJForm CreatePanel = new CreateCommunityJForm(communityHistory);
        jSplitPane1.setRightComponent(CreatePanel);
    }//GEN-LAST:event_CreateCommunityListActionPerformed

    private void ViewCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCommunityListActionPerformed
        // TODO add your handling code here:
        ViewCommunityJList ViewPanel = new ViewCommunityJList(communityHistory);
        jSplitPane1.setRightComponent(ViewPanel);
    }//GEN-LAST:event_ViewCommunityListActionPerformed

    private void CommunityUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityUpdateBtnActionPerformed
        // TODO add your handling code here:
        UpdateCommunityJList CreatePanel = new UpdateCommunityJList(communityHistory);
        jSplitPane1.setRightComponent(CreatePanel);
    }//GEN-LAST:event_CommunityUpdateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel CommunityLeftPanel;
    private javax.swing.JPanel CommunityRightPanel;
    private javax.swing.JButton CommunityUpdateBtn;
    private javax.swing.JButton CreateCommunityList;
    private javax.swing.JButton ViewCommunityList;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
