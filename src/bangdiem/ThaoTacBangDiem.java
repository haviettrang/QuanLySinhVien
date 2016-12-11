package bangdiem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:55:03 AM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ThaoTacBangDiem implements IThaoTacBangDiem {

    private static ArrayList<BangDiem> listBangDiem;

    public ThaoTacBangDiem() {
        listBangDiem = new ArrayList<>();
        init();
    }

    private void init() {
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<BangDiem> getAll() {
        return listBangDiem;
    }

    @Override
    public boolean addNew(BangDiem e) {
        return listBangDiem.add(e);
    }

    @Override
    public BangDiem update(BangDiem e) {
        return listBangDiem.set(listBangDiem.indexOf(e), e);
    }

    @Override
    public boolean delete(BangDiem e) {
        return listBangDiem.remove(e);
    }

    @Override
    public ArrayList<BangDiem> searchByMaSinhVien(String maSinhVien) {
        ArrayList<BangDiem> list = new ArrayList<>();
        for (Iterator<BangDiem> iterator = list.iterator(); iterator.hasNext();) {
            BangDiem next = iterator.next();
            if (next.getMaSv().equalsIgnoreCase(maSinhVien)) {
                list.add(next);
            }
        }
        return list;
    }

    @Override
    public ArrayList<BangDiem> searchByMaLopHoc(String maLopHoc) {
        ArrayList<BangDiem> list = new ArrayList<>();
        for (Iterator<BangDiem> iterator = list.iterator(); iterator.hasNext();) {
            BangDiem next = iterator.next();
            if (next.getMaLopHoc().equalsIgnoreCase(maLopHoc)) {
                list.add(next);
            }
        }
        return list;
    }
}
