package thaotac;

import java.util.ArrayList;
import lophoc.LopHoc;
import lophoc.ThaoTacLopHoc;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 12, 2016 10:52:18 AM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class TestThaoTacLopHoc {
    public static void main(String[] args) {
        ThaoTacLopHoc ttlh = new ThaoTacLopHoc();
        ArrayList<LopHoc> list = ttlh.getAll();
        
        for (LopHoc lopHoc : list) {
            System.out.println(lopHoc.getMaLop());
            System.out.println(lopHoc.getPhongHoc());
            System.out.println(lopHoc.getKiHoc());
            System.out.println(lopHoc.getGiaoVien().getID());
            System.out.println(lopHoc.getMonHoc().getMaMon());
            lopHoc.getListSV().stream().forEach((sv) -> {
                System.out.println(sv.getID());
            });
        }
    }
}
