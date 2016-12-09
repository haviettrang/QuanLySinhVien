package monhoc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 30, 2016 9:15:44 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacMonHoc implements IThaoTacMonHoc {

    private ArrayList<MonHoc> listMonHoc;

    public ThaoTacMonHoc() {
        listMonHoc = new ArrayList<>();
        init();
    }

    private void init() {
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<MonHoc> getAll() {
        return listMonHoc;
    }

    @Override
    public boolean addNew(MonHoc e) {
        return listMonHoc.add(e);
    }

    @Override
    public MonHoc update(MonHoc e) {
        return listMonHoc.set(listMonHoc.indexOf(e), e);
    }

    @Override
    public boolean delete(MonHoc e) {
        return listMonHoc.remove(e);
    }

    @Override
    public MonHoc searchByID(String ID) {
        for (Iterator<MonHoc> iterator = listMonHoc.iterator(); iterator.hasNext();) {
            MonHoc next = iterator.next();
            if (next.getMaMon().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }
}
