package giaovien;

import java.util.ArrayList;
import java.util.Date;
import monhoc.MonHoc;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 4, 2016 7:10:20 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class GiaoVien {

    private String maGiaoVienString;
    private String hoTen;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String email;
    private String soDienThoai;
    private String khoaVien;
    private ArrayList<MonHoc> monDay;

    public GiaoVien() {

    }

    public GiaoVien(String maGiaoVienString, String hoTen, Date ngaySinh, boolean gioiTinh, String email, String soDienThoai, String khoaVien, ArrayList<MonHoc> monDay) {
        this.maGiaoVienString = maGiaoVienString;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.khoaVien = khoaVien;
        this.monDay = monDay;
    }

    public String getMaGiaoVienString() {
        return maGiaoVienString;
    }

    public void setMaGiaoVienString(String maGiaoVienString) {
        this.maGiaoVienString = maGiaoVienString;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getKhoaVien() {
        return khoaVien;
    }

    public void setKhoaVien(String khoaVien) {
        this.khoaVien = khoaVien;
    }

    public ArrayList<MonHoc> getMonDay() {
        return monDay;
    }

    public void setMonDay(ArrayList<MonHoc> monDay) {
        this.monDay = monDay;
    }

}
