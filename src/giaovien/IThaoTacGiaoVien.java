package giaovien;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 9:25:10 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacGiaoVien {

    public ArrayList<GiaoVien> getAll();

    public boolean addNew(GiaoVien e);

    public GiaoVien update(GiaoVien e);

    public boolean delete(GiaoVien e);

    public GiaoVien searchByID(String ID);

}
