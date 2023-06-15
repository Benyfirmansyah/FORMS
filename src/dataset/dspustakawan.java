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
public class dspustakawan {
    
    private ArrayList<Integer> id;
    private ArrayList<String> user;
    private ArrayList<String> nama;
    
    public dspustakawan() {
        id = new ArrayList<Integer>();
        user =  new ArrayList<String>();
        nama = new ArrayList<String>();
        
    }
    
    public void insertid (int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
    
    public void insertuser (String isi){
        this.user.add(isi);
    }
    public ArrayList<String> getRecorduser(){
        return this.user;
    }
    
    
    public void insertnama (String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
}
