/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parjita
 */
public class Patient {
    private int PatientID;
    private String PatientName;
    private String PatientDateOfBirth; 
    private String PatientGender; 
    private int PatientAge;
    private int PatientWeight;
    private int PatientHeight;
    private String PatientBloodGroup; 
    private String PatientAddress; 
    private String PatientCity;   
    private String PatientOccupation;
    private String PatientEmail;
    private Double PatientPhoneNumber; 

    public int getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(int PatientAge) {
        this.PatientAge = PatientAge;
    }

    public int getPatientWeight() {
        return PatientWeight;
    }

    public void setPatientWeight(int PatientWeight) {
        this.PatientWeight = PatientWeight;
    }

    public int getPatientHeight() {
        return PatientHeight;
    }

    public void setPatientHeight(int PatientHeight) {
        this.PatientHeight = PatientHeight;
    }

    public int getPatientID() {
        return PatientID;
    }


    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientDateOfBirth() {
        return PatientDateOfBirth;
    }

    public void setPatientDateOfBirth(String PatientDateOfBirth) {
        this.PatientDateOfBirth = PatientDateOfBirth;
    }

    public String getPatientGender() {
        return PatientGender;
    }

    public void setPatientGender(String PatientGender) {
        this.PatientGender = PatientGender;
    }

    public String getPatientBloodGroup() {
        return PatientBloodGroup;
    }

    public void setPatientBloodGroup(String PatientBloodGroup) {
        this.PatientBloodGroup = PatientBloodGroup;
    }

    public String getPatientAddress() {
        return PatientAddress;
    }

    public void setPatientAddress(String PatientAddress) {
        this.PatientAddress = PatientAddress;
    }

    public String getPatientCity() {
        return PatientCity;
    }

    public void setPatientCity(String PatientCity) {
        this.PatientCity = PatientCity;
    }

    public String getPatientOccupation() {
        return PatientOccupation;
    }

    public void setPatientOccupation(String PatientOccupation) {
        this.PatientOccupation = PatientOccupation;
    }

    public String getPatientEmail() {
        return PatientEmail;
    }

    public void setPatientEmail(String PatientEmail) {
        this.PatientEmail = PatientEmail;
    }

    public Double getPatientPhoneNumber() {
        return PatientPhoneNumber;
    }

    public void setPatientPhoneNumber(Double PatientPhoneNumber) {
        this.PatientPhoneNumber = PatientPhoneNumber;
    }
    
}
