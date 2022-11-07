/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityHistory;

/**
 *
 * @author parjita
 */
public class ViewCommunityJList extends javax.swing.JPanel {

    CommunityHistory history;
    /**
     * Creates new form ViewCommunityJList
     * @param history
     */
    public ViewCommunityJList(CommunityHistory history) {
        initComponents();
        this.history = history;
        populateTable();
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
        CommunityTable = new javax.swing.JTable();
        CommunityDeleteBtn = new javax.swing.JButton();

        CommunityTable.setBackground(new java.awt.Color(255, 0, 255));
        CommunityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "CommunityID", "CommunityName", "City"
            }
        ));
        jScrollPane1.setViewportView(CommunityTable);

        CommunityDeleteBtn.setBackground(new java.awt.Color(255, 0, 255));
        CommunityDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        CommunityDeleteBtn.setText("Delete");
        CommunityDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CommunityDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CommunityDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CommunityDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityDeleteBtnActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = CommunityTable.getSelectedRow();
       
       if (selectedRowIndex<0){           
           JOptionPane.showMessageDialog(this, "Please select a row to delete.");
           return;
       }
       
       DefaultTableModel model = (DefaultTableModel) CommunityTable.getModel();
       Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex,0);
       history.deleteCommunity(selectedCommunity);
       JOptionPane.showMessageDialog(this, "Community signs delete.");
       
       populateTable();
    }//GEN-LAST:event_CommunityDeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommunityDeleteBtn;
    private javax.swing.JTable CommunityTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) CommunityTable.getModel();
         
            model.setRowCount(0);

            for (Community C : history.getHistory()){

                   Object[] row = new Object[4];
                   row[0] = C;
                   row[1] = C.getCommunityID();
                   row[2] = C.getCommunityName();
                   row[3] = C.getCommunityCity();  
                   
                   model.addRow(row);
                 
            }  
    }
}
