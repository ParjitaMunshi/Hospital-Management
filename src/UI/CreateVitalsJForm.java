/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Vitals;
import model.VitalsHistory;

/**
 *
 * @author parjita
 */
public class CreateVitalsJForm extends javax.swing.JPanel {

    VitalsHistory history;
    /**
     * Creates new form CreateVitalsJForm
     * @param history
     */
    public CreateVitalsJForm(VitalsHistory history) {
        initComponents();
          this.history = history;
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
        BloodPressureText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HeartRateText = new javax.swing.JTextField();
        VitalsSaveBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BodyTempText = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vitals Detail");

        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Blood Pressure");

        BloodPressureText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BloodPressureTextKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Heart Rate");

        HeartRateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeartRateTextActionPerformed(evt);
            }
        });
        HeartRateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HeartRateTextKeyReleased(evt);
            }
        });

        VitalsSaveBtn.setBackground(new java.awt.Color(255, 0, 255));
        VitalsSaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        VitalsSaveBtn.setText("Save");
        VitalsSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VitalsSaveBtnActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Body Temperature");

        BodyTempText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BodyTempTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodPressureText, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(HeartRateText)
                            .addComponent(BodyTempText)
                            .addComponent(VitalsSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodPressureText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeartRateText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BodyTempText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(VitalsSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HeartRateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeartRateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeartRateTextActionPerformed

    private void VitalsSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitalsSaveBtnActionPerformed
        // TODO add your handling code here:
        int BloodPressure  =  Integer.parseInt(BloodPressureText.getText());
        int HeartRate  =  Integer.parseInt(HeartRateText.getText());
        int BodyTemperature  =  Integer.parseInt(BodyTempText.getText());

        Vitals V = history.addNewVitals();
        V.setBloodPressure(BloodPressure);
        V.setHeartRate(HeartRate);
        V.setBodyTemperature(BodyTemperature);

        JOptionPane.showMessageDialog(this,"New Community Detail Added.");

        BloodPressureText.setText("");
        HeartRateText.setText("");
        BodyTempText.setText("");

    }//GEN-LAST:event_VitalsSaveBtnActionPerformed

    private void BloodPressureTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BloodPressureTextKeyReleased
        // TODO add your handling code here:
       String PATTERN = "^[0-9]{0,2}$";
       Pattern patt = Pattern.compile(PATTERN);
       Matcher match = patt.matcher(BloodPressureText.getText());

       if(!match.matches()){            
           JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid Value ");
       }
    }//GEN-LAST:event_BloodPressureTextKeyReleased

    private void HeartRateTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HeartRateTextKeyReleased
        // TODO add your handling code here:
       String PATTERN = "^[0-9]{0,2}$";
       Pattern patt = Pattern.compile(PATTERN);
       Matcher match = patt.matcher(HeartRateText.getText());

       if(!match.matches()){            
           JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid Value ");
       }
    }//GEN-LAST:event_HeartRateTextKeyReleased

    private void BodyTempTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BodyTempTextKeyReleased
        // TODO add your handling code here:
       String PATTERN = "^[0-9]{0,2}$";
       Pattern patt = Pattern.compile(PATTERN);
       Matcher match = patt.matcher(BodyTempText.getText());

       if(!match.matches()){            
           JOptionPane.showMessageDialog(this,"Invalid ! Please Enter Valid Value ");
       }
    }//GEN-LAST:event_BodyTempTextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodPressureText;
    private javax.swing.JTextField BodyTempText;
    private javax.swing.JTextField HeartRateText;
    private javax.swing.JButton VitalsSaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
