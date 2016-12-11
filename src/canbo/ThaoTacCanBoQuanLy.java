package canbo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:21:33 AM
 * @website haviettrang.blogspot.com View my notes at haviettrang.postach.io
 */
public class ThaoTacCanBoQuanLy implements IThaoTacCanBo {

    private static ArrayList<CanBoQuanLy> listCanBoQuanLy;

    public ThaoTacCanBoQuanLy() {
        listCanBoQuanLy = new ArrayList<>();
        init();
    }

    private void init() {
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<CanBoQuanLy> getAll() {
        return listCanBoQuanLy;
    }

    @Override
    public boolean addNew(CanBoQuanLy e) {
        return listCanBoQuanLy.add(e);
    }

    @Override
    public CanBoQuanLy update(CanBoQuanLy e) {
        return listCanBoQuanLy.set(listCanBoQuanLy.indexOf(e), e);
    }

    @Override
    public boolean delete(CanBoQuanLy e) {
        return listCanBoQuanLy.remove(e);
    }

    @Override
    public CanBoQuanLy searchByID(String ID) {
        for (Iterator<CanBoQuanLy> iterator = listCanBoQuanLy.iterator(); iterator.hasNext();) {
            CanBoQuanLy next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }
}
