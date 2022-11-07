/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parjita
 */
public class Doctor {
    private int DoctorID;
    private String DoctorName;
    private int HospitalID; 
    private String DoctorEmailAddress;
    private Double DoctorContactNumber; 

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }

    public String getDoctorEmailAddress() {
        return DoctorEmailAddress;
    }

    public void setDoctorEmailAddress(String DoctorEmailAddress) {
        this.DoctorEmailAddress = DoctorEmailAddress;
    }

    public Double getDoctorContactNumber() {
        return DoctorContactNumber;
    }

    public void setDoctorContactNumber(Double DoctorContactNumber) {
        this.DoctorContactNumber = DoctorContactNumber;
    }
    
}
