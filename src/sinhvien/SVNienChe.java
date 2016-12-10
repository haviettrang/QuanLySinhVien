package sinhvien;

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
        super();
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

    @Override
    public boolean xetTotNghiep() {
        return hocHetMonHoc;
    }

    @Override
    public String personalInfo() {
        return String.valueOf(hocHetMonHoc);
    }

}
