package sinhvien;

import java.util.Date;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 2:05:00 PM
 * @website haviettrang.blogspot.com
 */
public class SVNienChe extends SV {
    /**
     * Để kiểm tra xem SV học tất cả các môn quy định hay chưa
     */
    private boolean hocHetMonHoc;

    public SVNienChe() {
    }

    public SVNienChe(boolean hocHetMonHoc) {
        this.hocHetMonHoc = hocHetMonHoc;
    }

    public SVNienChe(boolean hocHetMonHoc, String maSv, String tenSv, String lop, Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA) {
        super(maSv, tenSv, lop, ngaySinh, gioiTinh, diaChi, email, CPA);
        this.hocHetMonHoc = hocHetMonHoc;
    }

    public SVNienChe(boolean hocHetMonHoc, String maSv, String tenSv, String lop, Date ngaySinh, boolean gioiTinh, String diaChi, String email, double CPA, String username, String password) {
        super(maSv, tenSv, lop, ngaySinh, gioiTinh, diaChi, email, CPA, username, password);
        this.hocHetMonHoc = hocHetMonHoc;
    }

    public boolean isHocHetMonHoc() {
        return hocHetMonHoc;
    }

    public void setHocHetMonHoc(boolean hocHetMonHoc) {
        this.hocHetMonHoc = hocHetMonHoc;
    }

    @Override
    public String getLoaiSinhVien() {
        return "Sinh Viên Niên Chế";
    }

}
