package chung;

import java.sql.Date;


/**
 *
 * @author HAVIETTRANG
 */
public class User {
    private String ID;
    private String username;
    private String password;
    private String hoTen;
    private Date ngaySinh;
    private String email;
    /**
     * true is male, false is female
     */
    private boolean gioiTinh;

    public User() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (matKhauCu.equals(password)) {
            password = matKhauCu;
            return true;
        }
        return false;
    }
}
