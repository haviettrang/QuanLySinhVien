package monhoc;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 9:17:06 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacMonHoc {

    public ArrayList<MonHoc> getAll();

    public boolean addNew(MonHoc e);

    public MonHoc update(MonHoc e);

    public boolean delete(MonHoc e);

    public MonHoc searchByID(String ID);

}
