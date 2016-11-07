package database;

import sinhvien.SV;
import sinhvien.SVNienChe;
import sinhvien.SVTinChi;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 4, 2016 10:37:09 AM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class Temp {
    
    SV sv1 = new SVTinChi();
    
    SV sv2 = new SVNienChe();
    
    public SV searchByID(String ID) {
        SV sv = null;
        
        //Code tìm kiếm sinh viên trong database
        
        //In ra loại sinh viên mà không cần quan tâm loại sinh viên tìm được là gì
        System.out.println(sv.getLoaiSinhVien());
        return sv;
    }
}
