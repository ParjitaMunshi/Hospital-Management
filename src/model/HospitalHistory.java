/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Hospital;
import java.util.ArrayList;

/**
 *
 * @author parjita
 */
public class HospitalHistory {

    private ArrayList<Hospital> history;
    
    public HospitalHistory(){
        
        this.history = new ArrayList();        
    }

    public ArrayList<Hospital> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<Hospital> history) {
        
        this.history = history;
    }  
    
    public Hospital addNewHospital(){
        
        Hospital newHospital= new Hospital(); 
        history.add(newHospital); 
        return newHospital;
    }
    
    public void deleteHospital(Hospital h){
         history.remove(h);
    }
}

