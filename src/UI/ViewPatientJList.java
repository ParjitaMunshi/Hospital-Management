/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientHistory;

/**
 *
 * @author parjita
 */
public class ViewPatientJList extends javax.swing.JPanel {

    PatientHistory history;
    /**
     * Creates new form ViewPatientJList
     * @param history
     */
    public ViewPatientJList(PatientHistory history) {
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
        PatientTable = new javax.swing.JTable();
        PatientDeleteBtn = new javax.swing.JButton();

        PatientTable.setBackground(new java.awt.Color(255, 0, 255));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Patient ID", "Name", "Gender", "Age", "Height", "Weight", "Address", "Email Id", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(PatientTable);

        PatientDeleteBtn.setBackground(new java.awt.Color(255, 0, 255));
        PatientDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientDeleteBtn.setText("Delete");
        PatientDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatientDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PatientDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientDeleteBtnActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = PatientTable.getSelectedRow();
       
       if (selectedRowIndex<0){           
           JOptionPane.showMessageDialog(this, "Please select a row to delete.");
           return;
       }
       
       DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();
       Patient selectedCommunity = (Patient) model.getValueAt(selectedRowIndex,0);
       history.deletePatient(selectedCommunity);
       JOptionPane.showMessageDialog(this, "Community signs delete.");
       
       populateTable();
    }//GEN-LAST:event_PatientDeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PatientDeleteBtn;
    private javax.swing.JTable PatientTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();
            model.setRowCount(0);

            for (Patient h : history.getHistory()){

                   Object[] row = new Object[10];
                   row[0] = h;
                   row[1] = h.getPatientID();
                   row[2] = h.getPatientName();                   
                   row[3] = h.getPatientGender();
                   row[4] = h.getPatientAge();
                   row[5] = h.getPatientHeight();
                   row[6] = h.getPatientWeight();
                   row[7] = h.getPatientAddress();
                   row[8] = h.getPatientEmail();
                   row[9] = h.getPatientPhoneNumber();                  
                  
                   
                   model.addRow(row);
                 
            }  

    }
}
