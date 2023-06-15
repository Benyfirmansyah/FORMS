/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public class telat {
    private String id;
    private String buku;
    private String siswa;
    private String tanggal;
    
    
   //constructor
    public telat(String id, String buku, String siswa,String tanggal){
        this.id=id;
        this.buku=buku;
        this.siswa=siswa;
        this.tanggal=tanggal;
    }
    
    //Getter and Setter
    public String getid(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    
    public String getbuku(){
        return buku;
    }
    public void setbuku(){
        this.buku=buku;
    }
    
    public String getsiswa(){
        return siswa;
    }
    public void setsiswa(){
        this.siswa=siswa;
    }
    
    public String gettanggal(){
        return tanggal;
    }
    public void settanggal(){
        this.tanggal=tanggal;
    }
    
    
}
