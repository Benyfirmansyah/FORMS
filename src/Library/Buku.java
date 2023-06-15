/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
 class buku {
    private String no;
    private String kode_buku;
    private String judul;
    
    //constructor
    public buku (String no, String kode_buku, String judul){
            this.no=no;
            this.kode_buku=kode_buku;
            this.judul=judul;
    }
    
    
   //Getter adn Setter
    public String getno(){
        return no;
    }
    public void setno(){
        this.no=no;
    }
    
    public String getkode_buku(){
        return kode_buku;
    }
    public void setkode_buku(){
        this.kode_buku=kode_buku;
    }
    
    public String getjudul(){
        return judul;
    }
    public void setjudul(){
        this.judul=judul;
    }
}

