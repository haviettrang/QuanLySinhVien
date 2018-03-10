package sinhvien;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 1:24:03 PM
 * @website haviettrang.blogspot.com
 */
public class SVTinChi extends SV {

    public SVTinChi() {
        super();
    }

    @Override
    public String getLoaiSinhVien() {
        return "Sinh Viên Tín Chỉ";
    }

    @Override
    public boolean xetTotNghiep() {
        return getTinChiTichLuy() >= 150 && getCPA() >= 1.5;
    }

    @Override
    public String personalInfo() {
        return String.valueOf(getTinChiTichLuy());
    }

}
