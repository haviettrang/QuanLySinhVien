package sinhvien;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 8:17:31 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacSV {
    public ArrayList<? extends SV> getAll();

    public <E extends SV> boolean addNew(E e);

    public <E extends SV> SV update(E e);

    public <E extends SV> boolean delete(E e);

    public SV searchByID(String ID);
    
    public ArrayList<? extends SV> searchByClass(String maLop);
}
