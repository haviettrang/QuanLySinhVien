package lophoc;

import giaovien.GiaoVien;
import java.util.ArrayList;
import monhoc.MonHoc;
import sinhvien.SV;

/**
 *
 * @author HAVIETTRANG
 */
public class LopHoc {

    private String maLop;
    private String phongHoc;
    private String kiHoc;
    private GiaoVien giaoVien;
    private MonHoc monHoc;
    private ArrayList<SV> listSV;

    public LopHoc() {
    }

    public LopHoc(String maLop, String phongHoc,String kiHoc, GiaoVien giaoVien, MonHoc monHoc, ArrayList<SV> listSV) {
        this.maLop = maLop;
        this.phongHoc = phongHoc;
        this.kiHoc = kiHoc;
        this.giaoVien = giaoVien;
        this.monHoc = monHoc;
        this.listSV = listSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public ArrayList<SV> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SV> listSV) {
        this.listSV = listSV;
    }

    public boolean themSV(SV sv) {
        return listSV.add(sv);
    }

    public boolean xoaSV(SV sv) {
        return listSV.remove(sv);
    }

    public String getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(String kiHoc) {
        this.kiHoc = kiHoc;
    }

}
