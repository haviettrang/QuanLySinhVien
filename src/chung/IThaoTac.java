package chung;

import java.util.ArrayList;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @param <E>
 * @date Nov 3, 2016 10:56:49 PM
 * @website haviettrang.blogspot.com
 *  View my notes at haviettrang.postach.io
 */
public interface IThaoTac {

    public ArrayList<? extends Object> getAll();

    public <E extends Object> E addNew(E eletment);

    public <E extends Object> E update(E eletment);

    public <E extends Object> E delete(E eletment);

    public ArrayList<? extends Object> searchByID(String ID);
}
