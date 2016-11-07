package sinhvien;

import java.util.Date;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 1:24:03 PM
 * @website haviettrang.blogspot.com
 */
public class SVTinChi extends SV {

    private int tinChiTichLuy;

    public SVTinChi() {
        
    }

    public SVTinChi(int tinChiTichLuy) {
        this();
        this.tinChiTichLuy = tinChiTichLuy;
    }

    public SVTinChi(int tinChiTichLuy, String maSv, String tenSv, String lop, Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA) {
        super(maSv, tenSv, lop, ngaySinh, gioiTinh, diaChi, email, CPA);
        this.tinChiTichLuy = tinChiTichLuy;
    }

    public SVTinChi(int tinChiTichLuy, String maSv, String tenSv, String lop,
            Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA, String username, String password) {
        super(maSv, tenSv, lop, ngaySinh, gioiTinh, diaChi, email, CPA, username, password);
        this.tinChiTichLuy = tinChiTichLuy;
    }

    public int getTinChiTichLuy() {
        return tinChiTichLuy;
    }

    public void setTinChiTichLuy(int tinChiTichLuy) {
        this.tinChiTichLuy = tinChiTichLuy;
    }

    @Override
    public String getLoaiSinhVien() {
        return "Sinh Viên Tín Chỉ";
    }

}
