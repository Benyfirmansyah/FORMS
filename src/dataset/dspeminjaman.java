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
public class dspeminjaman {
    
    public ArrayList<Integer> id;
    public ArrayList<String> siswa;
    public ArrayList<String> buku;
    
    public dspeminjaman (){
        id = new ArrayList<Integer>();
        siswa = new ArrayList<String> ();
        buku = new ArrayList<String>();
        
    }
    
    public void insertid(int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
    
    public void insertsiswa (String isi){
        this.siswa.add(isi);
    }
    public ArrayList<String> getRecordsiswa(){
        return this.siswa;
    }
    
    
    public void insertbuuku (String isi) {
        this.buku.add(isi);
    }
    public ArrayList<String> getRecordbuku(){
        return this.buku;
    }
    
}
