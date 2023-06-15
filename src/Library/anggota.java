/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
 class anggota {
     private String no_induk;
     private String nama;
     private String kelas;
     
     //constructor
     public anggota(String no_induk, String nama, String kelas){
         this.no_induk= no_induk;
         this.nama= nama;
         this.kelas= kelas;
     }
     
     //Getter and Setter
     public String  getno_induk(){
         return no_induk;
     }
     public void setno_induk(){
         this.no_induk= no_induk;
     }
     
     public String getnama(){
        return nama;
     }
     public void setnama(){
         this.nama= nama;
     }
     
     public String getkelas(){
         return kelas;
     }
     public void setkelas(){
         this.kelas= kelas;
     }
    
}
