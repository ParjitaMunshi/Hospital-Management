/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author parjita
 */
public class CommunityHistory {
     private ArrayList<Community> history;
    
    public CommunityHistory(){
        
        this.history = new ArrayList();        
    }

    public ArrayList<Community> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<Community> history) {
        
        this.history = history;
    }  
    
    public Community addNewCommunity(){
        
        Community newCommunity= new Community(); 
        history.add(newCommunity); 
        return newCommunity;
    }
    
    public void deleteCommunity(Community C){
         history.remove(C);
    }
    
}
