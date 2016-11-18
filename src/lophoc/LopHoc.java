package lophoc;

/**
 *
 * @author HAVIETTRANG
 */
public class LopHoc {

    private String maLop;
    private String phongHoc;
    private String idGiaoVien;
    private String maMonHoc;

    public LopHoc() {
    }

    public LopHoc(String maLop, String phongHoc, String idGiaoVien, String maMonHoc) {
        this.maLop = maLop;
        this.phongHoc = phongHoc;
        this.idGiaoVien = idGiaoVien;
        this.maMonHoc = maMonHoc;
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

    public String getIdGiaoVien() {
        return idGiaoVien;
    }

    public void setIdGiaoVien(String idGiaoVien) {
        this.idGiaoVien = idGiaoVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
}
