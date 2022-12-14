/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityHistory;

/**
 *
 * @author parjita
 */
public class CommunityAdminMainFrame extends javax.swing.JFrame {

    CommunityHistory communityHistory;
    /**
     * Creates new form CommunityAdminMainFrame
     * @param communityHistory
     */
    public CommunityAdminMainFrame(CommunityHistory communityHistory) {
        initComponents();
         this.communityHistory = communityHistory;
    }

    public CommunityAdminMainFrame() {
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
        CommunityIDText = new javax.swing.JTextField();
        CommunitySearchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CommunityNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CommunityCityText = new javax.swing.JTextField();
        CommunityUpdateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommunityTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Modify");

        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Community ID");

        CommunityIDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CommunityIDTextKeyReleased(evt);
            }
        });

        CommunitySearchBtn.setBackground(new java.awt.Color(255, 0, 255));
        CommunitySearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommunitySearchBtn.setText("Search");
        CommunitySearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunitySearchBtnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Community Name");

        CommunityNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CommunityNameTextKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("City");

        CommunityCityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CommunityCityTextKeyReleased(evt);
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

        CommunityTable.setBackground(new java.awt.Color(255, 51, 255));
        CommunityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CommunityID", "CommunityName", "City"
            }
        ));
        jScrollPane1.setViewportView(CommunityTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CommunityCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CommunityNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CommunityIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addComponent(CommunitySearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommunityUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunitySearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(CommunityUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommunityUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityUpdateBtnActionPerformed
        // TODO add your handling code here:
        for (Community C : communityHistory.getHistory()){

            if(CommunityIDText.getText().equals(String.valueOf(C.getCommunityID()))) {

                C.setCommunityName(CommunityNameText.getText());
                C.setCommunityCity(CommunityCityText.getText());
            }
            JOptionPane.showMessageDialog(this, "Community Details Updated");

        }
        populateTable();
    }//GEN-LAST:event_CommunityUpdateBtnActionPerformed

    private void CommunitySearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunitySearchBtnActionPerformed
        // TODO add your handling code here:
        int communityID = Integer.parseInt(CommunityIDText.getText());
       
       for (Community C : communityHistory.getHistory()) {
        if (communityID == C.getCommunityID()) {
                CommunityNameText.setText(C.getCommunityName());
                CommunityCityText.setText(C.getCommunityCity());
            }
       }
        
    }//GEN-LAST:event_CommunitySearchBtnActionPerformed

    private void CommunityIDTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CommunityIDTextKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CommunityIDText.getText());
        
        if(!match.matches()){            
            JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid ID ");
        }
    }//GEN-LAST:event_CommunityIDTextKeyReleased

    private void CommunityNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CommunityNameTextKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,40}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CommunityNameText.getText());
        
        if(!match.matches()){            
            JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid Name ");
        }
    }//GEN-LAST:event_CommunityNameTextKeyReleased

    private void CommunityCityTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CommunityCityTextKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,40}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CommunityCityText.getText());
        
        if(!match.matches()){            
            JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid Value ");
        }
    }//GEN-LAST:event_CommunityCityTextKeyReleased

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
            java.util.logging.Logger.getLogger(CommunityAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CommunityCityText;
    private javax.swing.JTextField CommunityIDText;
    private javax.swing.JTextField CommunityNameText;
    private javax.swing.JButton CommunitySearchBtn;
    private javax.swing.JTable CommunityTable;
    private javax.swing.JButton CommunityUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
           DefaultTableModel model = (DefaultTableModel) CommunityTable.getModel();
            model.setRowCount(0);

            for (Community C : communityHistory.getHistory()){

                   Object[] row = new Object[3];
                   row[0] = C.getCommunityID();
                   row[1] = C.getCommunityName();
                   row[2] = C.getCommunityCity();  
                   
                   model.addRow(row);
                 
            } 
    }
}
