package giaovien;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 4, 2016 7:21:12 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ThaoTacGiaoVien implements IThaoTacGiaoVien {

    private static ArrayList<GiaoVien> listGiaoVien;

    public ThaoTacGiaoVien() {
        listGiaoVien = new ArrayList<>();
        init();
    }

    private void init() {
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<GiaoVien> getAll() {
        return listGiaoVien;
    }

    @Override
    public boolean addNew(GiaoVien e) {
        return listGiaoVien.add(e);
    }

    @Override
    public GiaoVien update(GiaoVien e) {
        return listGiaoVien.set(listGiaoVien.indexOf(e), e);
    }

    @Override
    public boolean delete(GiaoVien e) {
        return listGiaoVien.remove(e);
    }

    @Override
    public GiaoVien searchByID(String ID) {
        for (Iterator<GiaoVien> iterator = listGiaoVien.iterator(); iterator.hasNext();) {
            GiaoVien next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }
}
