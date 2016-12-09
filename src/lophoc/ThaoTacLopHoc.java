package lophoc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 30, 2016 9:19:31 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacLopHoc implements IThaoTacLopHoc {

    private ArrayList<LopHoc> listLopHoc;

    public ThaoTacLopHoc() {
        listLopHoc = new ArrayList<>();
        init();
    }

    private void init() {
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<LopHoc> getAll() {
        return listLopHoc;
    }

    @Override
    public boolean addNew(LopHoc e) {
        return listLopHoc.add(e);
    }

    @Override
    public LopHoc update(LopHoc e) {
        return listLopHoc.set(listLopHoc.indexOf(e), e);
    }

    @Override
    public boolean delete(LopHoc e) {
        return listLopHoc.remove(e);
    }

    @Override
    public LopHoc searchByID(String ID) {
        for (Iterator<LopHoc> iterator = listLopHoc.iterator(); iterator.hasNext();) {
            LopHoc next = iterator.next();
            if (next.getMaLop().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }
}
