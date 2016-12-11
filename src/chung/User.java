package chung;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author HAVIETTRANG
 */
public class User {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    private String ID;
    private String username;
    private String password;
    private String hoTen;
    private Date ngaySinh;
    private String email;
    /**
     * true is male, false is female
     */
    private boolean isNam;

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

    public boolean isNam() {
        return isNam;
    }

    public void setIsNam(boolean isNam) {
        this.isNam = isNam;
    }
    
    public void setIsNam(String isNam) {
        this.isNam = Boolean.valueOf(isNam);
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (matKhauCu.equals(password)) {
            password = matKhauCu;
            return true;
        }
        return false;
    }
    
    public String getNgaySinhString() {
        return formatter .format(ngaySinh);
    }
    /**
     * Lưu thông tin ngày Sinh
     * Ví Dụ: 01/01/2016
     * @param ngaySinh dạng dd/MM/YYYY
     */
    public void setNgaySinh(String ngaySinh) {
        try {
            this.ngaySinh = (Date) formatter.parse(ngaySinh);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
