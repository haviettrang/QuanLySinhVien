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

    private String maGiaoVien;
    private String hoTen;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String email;
    private String soDienThoai;
    private String khoaVien;
    private ArrayList<MonHoc> monDay;

    public GiaoVien() {

    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
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
