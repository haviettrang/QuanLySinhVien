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
    private String khoaVien;
    private ArrayList<MonHoc> hocPhanDieuKien;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, double trongSo, int soTinChi,
            String khoaVien, ArrayList<MonHoc> hocPhanDieuKien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.trongSo = trongSo;
        this.soTinChi = soTinChi;
        this.khoaVien = khoaVien;
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
        this.trongSo = trongSo;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getKhoaVien() {
        return khoaVien;
    }

    public void setKhoaVien(String KhoaVien) {
        this.khoaVien = KhoaVien;
    }

    public ArrayList<MonHoc> getHocPhanDieuKien() {
        return hocPhanDieuKien;
    }

    public void setHocPhanDieuKien(ArrayList<MonHoc> hocPhanDieuKien) {
        this.hocPhanDieuKien = hocPhanDieuKien;
    }
    
    @Override
    public String toString() {
        return maMon + tenMon + soTinChi + trongSo + khoaVien;
    }

}
