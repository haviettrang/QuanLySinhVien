package bangdiem;

import lophoc.LopHoc;
import sinhvien.SV;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:21:33 AM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class BangDiem {

    private SV sv;
    private LopHoc lopHoc;
    private double diemQuaTrinh;
    private double diemCuoiKi;
    private double diemTongKet;

    public BangDiem() {
    }

    public BangDiem(SV sv, LopHoc lopHoc, double diemQuaTrinh, double diemCuoiKi) {
        this.sv = sv;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemCuoiKi = diemCuoiKi;
        this.lopHoc = lopHoc;
    }

    public SV getSv() {
        return sv;
    }

    public void setSv(SV sv) {
        this.sv = sv;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemCuoiKi() {
        return diemCuoiKi;
    }

    public void setDiemCuoiKi(double diemCuoiKi) {
        this.diemCuoiKi = diemCuoiKi;
    }

    public double getDiemTongKet() {
        tinhDiem();
        return diemTongKet;
    }

    private void tinhDiem() {
        double trongSo = lopHoc.getMonHoc().getTrongSo();
        diemTongKet = diemQuaTrinh * (1 - trongSo) + diemCuoiKi * trongSo;
    }
}
