
import database.ConnectDatabase;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 18, 2016 10:47:22 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class TestDatabase {
    public static void main(String[] args) {
        ConnectDatabase cd = new ConnectDatabase();
        System.out.println(cd.getConnection());
        cd.disconnectToDatabase();
    }
}
