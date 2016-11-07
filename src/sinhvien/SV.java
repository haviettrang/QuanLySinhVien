package sinhvien;

import chung.User;
import java.util.Date;

/**
 *
 * @author HAVIETTRANG
 */
public abstract class SV extends User {

    private String maSv;
    private String tenSv;
    private String lop;
    private Date ngaySinh;
    /**
     * false là nam, true là nữ
     */
    private boolean gioiTinh;
    private String diaChi;
    private String email;
    private double CPA;

    public SV() {
        super();
    }

    public SV(String maSv, String tenSv, String lop, Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.CPA = CPA;
    }

    public SV(String maSv, String tenSv, String lop, Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA, String username, String password) {
        super(username, password);
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.CPA = CPA;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    /**
     *
     * @param gioiTinh false là nam, true là nữ
     */
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(double CPA) {
        this.CPA = CPA;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public abstract String getLoaiSinhVien();

//    /**
//     * 
//     * @return true nếu đủ điều kiện tốt nghiệp, false thì ngược lại
//     */
//    public abstract boolean xetTotNghiep();
}
