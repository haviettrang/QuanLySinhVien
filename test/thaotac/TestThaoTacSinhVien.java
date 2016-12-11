package thaotac;

import sinhvien.SVTinChi;
import sinhvien.ThaoTacSV;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 11, 2016 10:16:42 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class TestThaoTacSinhVien {

    public static void main(String[] args) {
        ThaoTacSV ttsv = new ThaoTacSV();
        SVTinChi sv = new SVTinChi();
        
        sv.setID("20144624");
        sv.setUsername("20144625");
        sv.setPassword("20144625");
        sv.setHoTen("Ha Viet Trang");
        sv.setNgaySinh("01/01/2016");
        sv.setEmail("20144625@student.hust.edu.vn");
        sv.setIsNam(true);
        sv.setLop("CNTT 2-1");
        sv.setKhoaVien("KCNTT");
        sv.setDiaChi("HN");
        sv.setCPA(4.0);
        sv.setTinChiTichLuy(100);
        
        ttsv.addNew(sv);
        ttsv.save();
    }

}
