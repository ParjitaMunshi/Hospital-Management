/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorHistory;
import model.Hospital;
import model.HospitalHistory;

/**
 *
 * @author parjita
 */
public class ViewHospitalJList extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalJList
     */
    HospitalHistory history;
    
    public ViewHospitalJList(HospitalHistory history) {
        initComponents();
        this.history = history;
        populateTable();
    }

    ViewHospitalJList(HospitalHistory hospitalHistory, DoctorHistory doctorHistory) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        HospitalTable = new javax.swing.JTable();
        HospitalDeleteBtn = new javax.swing.JButton();

        HospitalTable.setBackground(new java.awt.Color(255, 0, 255));
        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Hospital ID", "Hospital Name", "City"
            }
        ));
        jScrollPane1.setViewportView(HospitalTable);

        HospitalDeleteBtn.setBackground(new java.awt.Color(255, 0, 255));
        HospitalDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        HospitalDeleteBtn.setText("Delete");
        HospitalDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HospitalDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HospitalDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalDeleteBtnActionPerformed
        // TODO add your handling code here:
             int selectedRowIndex = HospitalTable.getSelectedRow();
       
       if (selectedRowIndex<0){           
           JOptionPane.showMessageDialog(this, "Please select a row to delete.");
           return;
       }
       
       DefaultTableModel model = (DefaultTableModel) HospitalTable.getModel();
       Hospital selectedCommunity = (Hospital) model.getValueAt(selectedRowIndex,0);
       history.deleteHospital(selectedCommunity);
       JOptionPane.showMessageDialog(this, "Hospital signs delete.");
       
       populateTable();
    }//GEN-LAST:event_HospitalDeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HospitalDeleteBtn;
    private javax.swing.JTable HospitalTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) HospitalTable.getModel();
            model.setRowCount(0);

            for (model.Hospital h : history.getHistory()){

                   Object[] row = new Object[4];
                   row[0] = h;
                   row[1] = h.getHospitalID();
                   row[2] = h.getHospitalName();
                   row[3] = h.getHospitalCity();  
                   
                   model.addRow(row);
                 
            }    
            }
}
