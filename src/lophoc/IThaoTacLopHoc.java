package lophoc;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 9:22:37 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacLopHoc {

    public ArrayList<LopHoc> getAll();

    public boolean addNew(LopHoc e);

    public LopHoc update(LopHoc e);

    public boolean delete(LopHoc e);

    public LopHoc searchByID(String ID);
    
    public void save();
}
