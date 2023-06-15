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
public class dstelat {
    
    public ArrayList<Integer> id;
    public ArrayList<String> buku;
    public ArrayList<String> siswa;
    public ArrayList<String> tanggal;
    
    public dstelat (){
        id = new ArrayList<Integer>();
        buku = new ArrayList<String>();
        siswa = new ArrayList<String>();
        tanggal = new ArrayList<String>();
        
    }
    
    
    public void insertid (int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
    
    public void insertbuku (String isi){
        this.buku.add(isi);
    }
    public ArrayList<String> getRecordbuku(){
        return this.buku;
    }
    
    
    public void insertsiswa (String isi){
        this.siswa.add(isi);
    }
    public ArrayList<String> getRecordsiswa(){
        return this.siswa;
    }
    
    
    public void inserttangal (String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordtanggal(){
        return this.tanggal;
    }
    
}
