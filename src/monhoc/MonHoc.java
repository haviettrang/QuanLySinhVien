package monhoc;

import java.util.ArrayList;

/**
 *
 * @author HAVIETTRANG
 */
public class MonHoc {

    private String maMon;
    private String tenMon;
    private double trongSo;
    private int soTinChi;
    private String KhoaVien;
    private ArrayList<MonHoc> hocPhanDieuKien;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, double trongSo, int soTinChi, String KhoaVien, ArrayList<MonHoc> hocPhanDieuKien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.trongSo = trongSo;
        this.soTinChi = soTinChi;
        this.KhoaVien = KhoaVien;
        this.hocPhanDieuKien = hocPhanDieuKien;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo =  trongSo;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getKhoaVien() {
        return KhoaVien;
    }

    public void setKhoaVien(String KhoaVien) {
        this.KhoaVien = KhoaVien;
    }

    public ArrayList<MonHoc> getHocPhanDieuKien() {
        return hocPhanDieuKien;
    }

    public void setHocPhanDieuKien(ArrayList<MonHoc> hocPhanDieuKien) {
        this.hocPhanDieuKien = hocPhanDieuKien;
    }

}
