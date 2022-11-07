/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Vitals;
import java.util.ArrayList;
/**
 *
 * @author parjita
 */
public class VitalsHistory {
    private ArrayList<Vitals> history;
    
    public VitalsHistory(){
        
        this.history = new ArrayList();        
    }

    public ArrayList<Vitals> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<Vitals> history) {
        
        this.history = history;
    }  
    
    public Vitals addNewVitals(){
        
        Vitals newVitals= new Vitals(); 
        history.add(newVitals); 
        return newVitals;
    }
    
    public void deleteVitals(Vitals V){
         history.remove(V);
    }
    
}
