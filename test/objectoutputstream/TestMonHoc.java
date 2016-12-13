package objectoutputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 12, 2016 1:45:12 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class TestMonHoc {

    public static void main(String[] args) {
        ArrayList<MonHoc> list = new ArrayList<>();

        MonHoc monHoc = new MonHoc();
        monHoc.setMaMon("Mi1010");
        monHoc.setTenMon("GT I");
        monHoc.setSoTinChi(4);
        monHoc.setTrongSo(0.7);
        monHoc.setKhoaVien("math");
        monHoc.setHocPhanDieuKien(new ArrayList<>());

        list.add(monHoc);

        MonHoc monHoc1 = new MonHoc();
        monHoc1.setMaMon("Mi1020");
        monHoc1.setTenMon("GT II");
        monHoc1.setSoTinChi(4);
        monHoc1.setTrongSo(0.7);
        monHoc1.setKhoaVien("math");
        monHoc1.setHocPhanDieuKien(new ArrayList<>(list));

        list.add(monHoc1);

//        try (AppendableObjectOutputStream aoos = new AppendableObjectOutputStream("test/test.bin", true)) {
//            for (MonHoc monHoc2 : list) {
//                aoos.writeObject(monHoc2);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test/test.bin"))) {
            boolean count = true;
            while (count) {
                MonHoc mh = (MonHoc) ois.readObject();

                if (mh != null) {
                    System.out.println(mh.getMaMon());
                    for (MonHoc monHoc2 : mh.getHocPhanDieuKien()) {
                        System.out.println(monHoc2.getMaMon());
                    }
                } else {
                    count = false;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
