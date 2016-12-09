package bangdiem;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 9:36:47 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacBangDiem {

    public ArrayList<BangDiem> getAll();

    public boolean addNew(BangDiem e);

    public BangDiem update(BangDiem e);

    public boolean delete(BangDiem e);

    public ArrayList<BangDiem> searchByMaSinhVien(String maSinhVien);

    public ArrayList<BangDiem> searchByMaLopHoc(String maLopHoc);
}
