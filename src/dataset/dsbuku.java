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
public class dsbuku {
    
    private ArrayList<Integer> no;
    private ArrayList<String> kode_buku;
    private ArrayList<String> judul;
    
    public dsbuku (){
        no = new ArrayList<Integer>();
        kode_buku = new ArrayList<String>();
        judul = new ArrayList<String>();
    }
    
    public void insertno (int isi){
        this.no.add(isi);
    }
    public ArrayList<Integer> getRecordno(){
        return this.no;
    }
    
    
    public void insertkode_buku (String isi){
        this.kode_buku.add(isi);
    }
    public ArrayList<String> getRecordkode_buku(){
        return this.kode_buku;
    }
    
    public void insertjudul (String isi) {
        this.judul.add(isi);
    }
    public ArrayList<String> getRecordjudul(){
        return this.judul;
    }
    
}
