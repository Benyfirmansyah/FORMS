/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;
import dataset.*;
import forms.*;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Student
        /**Student student = new Student("John Doe", "123456");
        System.out.println("Name: " + student.getName());
        System.out.println("NPM: " + student.getNpm());

        // Membuat objek User
        User user = new User(1, "johndoe");
        System.out.println("ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        
        // Membuat objek log
        Log log = new Log ("3284363","dsreuydu");
        System.out.println("id: " + log.getid());
        System.out.println("user: " + log.getuser());
        
        // Membuat objek config
        config config = new config ("12093174");
        System.out.println("id= " + config.getid());
        
        // Membuat objek pustakawan
        pustakawan orang = new pustakawan("23657","baru","beny");
        System.out.println("id: " + orang.getid());
        System.out.println("user: " + orang.getuser());
        System.out.println("nama: " + orang.getnama());
        
        
        
        // Membuat objek anggota
        anggota perpus = new anggota("134838382","beny","4");
        System.out.println("no_induk: " + perpus.getno_induk());
        System.out.println("nama: " + perpus.getnama());
        System.out.println("kelas: " + perpus.getkelas());
        
        //Membuat objek peminjaman
        peminjaman book = new peminjaman("1374721","beny","sosiologi");
        System.out.println("id: " + book.getid());
        System.out.println("siswa: " + book.getsiswa());
        System.out.println("buku: " + book.getbuku());
        
        //Membaut objek buku
        buku panjang = new buku("131434","2A","Matematika");
        System.out.println("no: " + panjang.getno());
        System.out.println("kode_buku: " + panjang.getkode_buku());
        System.out.println("kelas: " + panjang.getjudul());
        
        //Membbua objek kas
        kas internal = new kas("1241324","kamis","sabtu","mencukupi");
        System.out.println("id: " + internal.getid());
        System.out.println("masuk: " + internal.getmasuk());
        System.out.println("keluar: " + internal.getkeluar());
        System.out.println("saldo: " + internal.getsaldo());
        
        //Membuat objek telat
        telat denda = new telat("185394","IPA","7C","9 maret");
        System.out.println("id: " + denda.getid());
        System.out.println("buku: " + denda.getbuku());
        System.out.println("siswa: " + denda.getsiswa());
        System.out.println("tanggal: " + denda.gettanggal());
        
        
        //Memasukkan array list dalam object
        dsanggota Anggota = new dsanggota();
        dsbuku Buku = new dsbuku();
        dsconfig Config = new dsconfig();
        dskas Kas =  new dskas();
        dslog Log = new dslog();
        dspeminjaman Peminjaman = new dspeminjaman();
        dspustakawan Pustakawan = new dspustakawan ();
        dstelat Telat = new dstelat ();
               
     
        
        
        //Menginput data ArrayList pada masing-masing tabel
        Anggota.insertno_induk(1);
        Anggota.insertnama("Beny");
        Anggota.insertkelas("3B");
        System.out.println("DATA ANGGOTA");
        System.out.println(Anggota.getRecordno_induk());
        System.out.println(Anggota.getRecordnama());
        System.out.println(Anggota.getRecordkelas());
        
        
        Buku.insertno(01);
        Buku.insertkode_buku("3a");
        Buku.insertjudul("Sikancil");
        System.out.println("DATA BUKU");
        System.out.println(Buku.getRecordno());
        System.out.println(Buku.getRecordkode_buku());
        System.out.println(Buku.getRecordjudul());
        
        
        
        Config.insertid(01);
        System.out.println("CONFIG");
        System.out.println(Config.getRecordid());
        
        Kas.insertid(01);
        Kas.insertmasuk("selasa");
        Kas.insertkeluar("kamis");
        Kas.insertsaldo(70000);
        System.out.println("KAS");
        System.out.println(Kas.getRecordid());
        System.out.println(Kas.getRecordmasuk());
        System.out.println(Kas.getRecordkeluar());
        System.out.println(Kas.getRecordsaldo());
        
        
        Log.insertid(01);
        Log.insertuser("Baru");
        System.out.println("LOG");
        System.out.println(Log.getRecordid());
        System.out.println(Log.getRecorduser());
        
        
        Peminjaman.insertid(01);
        Peminjaman.insertsiswa("3A");
        Peminjaman.insertbuuku("Matematika");
        System.out.println("PEMINJAMAN");
        System.out.println(Peminjaman.getRecordid());
        System.out.println(Peminjaman.getRecordsiswa());
        System.out.println(Peminjaman.getRecordbuku());
        
        
        Pustakawan.insertid(01);
        Pustakawan.insertnama("Beny");
        Pustakawan.insertuser("Baru");
        System.out.println("PUSTAKAWAN");
        System.out.println(Pustakawan.getRecordid());
        System.out.println(Pustakawan.getRecordnama());
        System.out.println(Pustakawan.getRecorduser());
        
        Telat.insertid(01);
        Telat.insertbuku("FISIKA");
        Telat.insertsiswa("Beny");
        Telat.inserttangal("8 Januari");
        System.out.println("TELAT");
        System.out.println(Telat.getRecordid());
        System.out.println(Telat.getRecordbuku());
        System.out.println(Telat.getRecordsiswa());
        System.out.println(Telat.getRecordtanggal());*/
        
        
        new frameUtama().setVisible(true);
        
        
        
    }
}
