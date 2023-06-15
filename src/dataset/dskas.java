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
public class dskas {
    
    private ArrayList<Integer> id;
    private ArrayList<String> masuk;
    private ArrayList<String> keluar;
    private ArrayList<Integer> saldo;
    
    public dskas(){
        id = new ArrayList<Integer>();
        masuk = new ArrayList<String> ();
        keluar = new ArrayList<String> ();
        saldo = new ArrayList<Integer>();
    }
    
    public void insertid (int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
    
    public void insertmasuk (String isi){
        this.masuk.add(isi);
    }
    public ArrayList<String> getRecordmasuk(){
        return this.masuk;
    }
    
    
    public void insertkeluar (String isi){
        this.keluar.add(isi);
    }
    public ArrayList<String> getRecordkeluar(){
        return this.keluar;
    }
    
    
    public void insertsaldo (int isi){
        this.saldo.add(isi);
    }
    public ArrayList<Integer> getRecordsaldo(){
        return this.saldo;
    }
    
    
}
