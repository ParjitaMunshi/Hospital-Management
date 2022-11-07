/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author parjita
 */
public class DoctorHistory {
    private ArrayList<Doctor> history;
    
    public DoctorHistory(){
        
        this.history = new ArrayList();        
    }

    public ArrayList<Doctor> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<Doctor> history) {
        
        this.history = history;
    }  
    
    public Doctor addNewDoctor(){
        
        Doctor newDoctor= new Doctor(); 
        history.add(newDoctor); 
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor D){
         history.remove(D);
    }
}
