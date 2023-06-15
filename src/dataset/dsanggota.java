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
public class dsanggota {
    
    private ArrayList<Integer> no_induk;
    private ArrayList<String> nama;
    private ArrayList<String> kelas;
    
    public dsanggota(){
        no_induk = new ArrayList<Integer>();
        nama = new ArrayList<String>();
        kelas = new ArrayList<String>();
        
    }
    
    public void insertno_induk (int isi){
        this.no_induk.add(isi);
    }    
    public ArrayList<Integer> getRecordno_induk(){
        return this.no_induk;
    }
    
    
    public void insertnama (String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    
    public void insertkelas (String isi){
        this.kelas.add(isi);
    }
    public ArrayList<String> getRecordkelas(){
        return this.kelas;
    }
}
