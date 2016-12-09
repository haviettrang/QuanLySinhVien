package sinhvien;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 30, 2016 9:00:08 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacSV implements IThaoTacSV {
    
    private ArrayList<SV> listSV;
    
    public ThaoTacSV() {
        listSV = new ArrayList<>();
        init();
    }
    private void init(){
        //đọc file lưu thông tin vào ArrayList
    }

    @Override
    public ArrayList<? extends SV> getAll() {
        return listSV;
    }

    @Override
    public <E extends SV> boolean addNew(E e) {
        return listSV.add(e);
    }

    @Override
    public <E extends SV> SV update(E e) {
        return listSV.set(listSV.indexOf(e), e);
    }

    @Override
    public <E extends SV> boolean delete(E e) {
        return listSV.remove(e);
    }

    @Override
    public SV searchByID(String ID) {
        for (Iterator<SV> iterator = listSV.iterator(); iterator.hasNext();) {
            SV next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public ArrayList<SV> searchByClass(String maLop) {
        ArrayList<SV> list = new ArrayList<>();
        for (Iterator<SV> iterator = list.iterator(); iterator.hasNext();) {
            SV next = iterator.next();
            if (next.getLop().equalsIgnoreCase(maLop)) {
                list.add(next);
            }
        }
        return list;
    }
}
