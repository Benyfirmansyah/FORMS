/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dsconfig {
    
    private ArrayList<Integer> id;
    
    
    public dsconfig(){
        id = new ArrayList<Integer>();
    }
    
    public void insertid (int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
}
