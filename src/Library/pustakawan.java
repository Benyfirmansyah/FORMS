/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
 class pustakawan {
     private String id;
     private String user;
     private String nama;
     
     //constructor
     public pustakawan(String id, String user, String nama){
         this.id=id;
         this.user=user;
         this.nama=nama;
     }
     
     //getter dan setter
     public String getid(){
         return id;
     }
     public void setid(String id){
         this.id=id;
     }
     
     public String getuser(){
         return user;
     }
     public void setuser(String user){
         this.user=user;
     }
     
     public String getnama(){
         return nama;
     }
     public void setnama(String nama){
         this.nama=nama;
     }
 }
     