/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public class peminjaman {
    private String id;
    private String siswa;
    private String buku;
    
    //construture
    public peminjaman (String id, String siswa,String buku){
        this.id=id;
        this.siswa=siswa;
        this.buku=buku;
    }
    
    //Getter dan Setter
    public String getid(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    
    public String getsiswa(){
        return siswa;
    }
    public void setsiswa(){
        this.siswa=siswa;
    }
    
    public String getbuku(){
        return buku;
    }
    public void setbuku(){
        this.buku=buku;
    }
    
}
