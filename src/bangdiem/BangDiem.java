package bangdiem;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:21:33 AM
 * @website haviettrang.blogspot.com View my notes at haviettrang.postach.io
 */
public class BangDiem {

    private String maSv;
    private String maMon;
    private String maLopHoc;
    private double diemQuaTrinh;
    private double diemCuoiKi;
    private double trongSo;
    private double diemTongKet;

    public BangDiem() {
    }

    public BangDiem(String maSv, String maMon, String maLopHoc, double diemQuaTrinh, double diemCuoiKi, double trongSo) {
        this.maSv = maSv;
        this.maMon = maMon;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemCuoiKi = diemCuoiKi;
        this.trongSo = trongSo;
        this.maLopHoc = maLopHoc;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
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

    public double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(double trongSo) {
        this.trongSo = trongSo;
    }

    public double getDiemTongKet() {
        tinhDiem();
        return diemTongKet;
    }

    private void tinhDiem() {
        diemTongKet = diemQuaTrinh * (1 - trongSo) + diemCuoiKi * trongSo;
    }
}
