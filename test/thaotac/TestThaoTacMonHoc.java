package thaotac;

import java.util.ArrayList;
import monhoc.MonHoc;
import monhoc.ThaoTacMonHoc;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 11, 2016 9:56:17 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class TestThaoTacMonHoc {

    public static void main(String[] args) {
        ThaoTacMonHoc ttmh = new ThaoTacMonHoc();
        MonHoc mh = ttmh.searchByID("IT3020");
        System.out.println(mh.getTenMon());
        ArrayList<MonHoc> list = mh.getHocPhanDieuKien();
        list.stream().forEach((monHoc) -> {
            System.out.println(monHoc.getTenMon());
        });
    }
}
