package canbo;

import chung.User;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 5:02:33 PM
 * @website haviettrang.blogspot.com
 */
public class CanBoQuanLy extends User {

    private String ID;
    private String hoTen;
    private String email;

    public CanBoQuanLy() {
    }

    public CanBoQuanLy(String ID, String hoTen, String email) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.email = email;
    }

    public CanBoQuanLy(String ID, String hoTen, String email, String username, String password) {
        super(username, password);
        this.ID = ID;
        this.hoTen = hoTen;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
