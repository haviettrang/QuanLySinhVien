package sinhvien;

import chung.User;

/**
 *
 * @author HAVIETTRANG
 */
public abstract class SV extends User {

    private String lop;
    private String khoaVien;
    private String diaChi;
    private double CPA;

    public SV() {
        super();
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaVien() {
        return khoaVien;
    }

    public void setKhoaVien(String khoaVien) {
        this.khoaVien = khoaVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(double CPA) {
        this.CPA = CPA;
    }
    
    public abstract String getLoaiSinhVien();

    public abstract boolean xetTotNghiep();
    
    public abstract String personalInfo();
}
