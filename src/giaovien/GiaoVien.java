package giaovien;

import chung.User;
import java.util.ArrayList;
import monhoc.MonHoc;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 4, 2016 7:10:20 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class GiaoVien extends User {

    private int soDienThoai;
    private String khoaVien;
    private ArrayList<MonHoc> monDay;

    public GiaoVien() {

    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
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
