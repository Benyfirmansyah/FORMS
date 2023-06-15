/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
 class Log {
    private String id;
    private String user;

    // Constructor
    public Log(String id, String user) {
        this.id = id;
        this.user= user;
    }

    // Getter dan Setter
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }
}
