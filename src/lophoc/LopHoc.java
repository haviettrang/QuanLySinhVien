/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophoc;

/**
 *
 * @author HAVIETTRANG
 */
public class LopHoc {

    private String maLop;
    private String tenLop;
    private String giaoVienDay;
    private String maMonHoc;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, String giaoVienDay, String maMonHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.giaoVienDay = giaoVienDay;
        this.maMonHoc = maMonHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getGiaoVienDay() {
        return giaoVienDay;
    }

    public void setGiaoVienDay(String giaoVienDay) {
        this.giaoVienDay = giaoVienDay;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    
}
