package canbo;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 9, 2016 9:26:39 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
interface IThaoTacCanBo {

    public ArrayList<CanBoQuanLy> getAll();

    public boolean addNew(CanBoQuanLy e);

    public CanBoQuanLy update(CanBoQuanLy e);

    public boolean delete(CanBoQuanLy e);

    public CanBoQuanLy searchByID(String ID);

}
