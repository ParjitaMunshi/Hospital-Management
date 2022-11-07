/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parjita
 */
public class Vitals {
    private int PatientID;   
    private int BloodPressure;
    private int HeartRate;
    private int BodyTemperature; 

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getBodyTemperature() {
        return BodyTemperature;
    }

    public void setBodyTemperature(int BodyTemerature) {
        this.BodyTemperature = BodyTemerature;
    }
    
    
}
