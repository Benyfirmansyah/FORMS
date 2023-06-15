/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public class kas {
    private String id;
    private String masuk;
    private String keluar;
    private String saldo;
    
    //constructor
    public kas (String id, String masuk, String keluar, String saldo){
        this.id=id;
        this.masuk=masuk;
        this.keluar=keluar;
        this.saldo=saldo;
    }
    
    //Getter and Setter
    public String getid(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    
    public String getmasuk(){
        return masuk;
    }
    public void setmasuk(){
        this.masuk=masuk;
    }
    
    public String getkeluar(){
        return keluar;
    }
    public void setkeluar(){
        this.keluar=keluar;
    }
    
    public String getsaldo(){
        return saldo;
    }
    public void setsaldo(){
        this.saldo=saldo;
    }
}
