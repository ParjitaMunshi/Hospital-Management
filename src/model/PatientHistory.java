/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Patient;
import java.util.ArrayList;

/**
 *
 * @author parjita
 */
public class PatientHistory {
    private ArrayList<Patient> history;
    
    public PatientHistory(){
        
        this.history = new ArrayList();        
    }

    public ArrayList<Patient> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<Patient> history) {
        
        this.history = history;
    }  
    
    public Patient addNewPatient(){
        
        Patient newPatient= new Patient(); 
        history.add(newPatient); 
        return newPatient;
    }
    
    public void deletePatient(Patient C){
         history.remove(C);
    }
    
}
