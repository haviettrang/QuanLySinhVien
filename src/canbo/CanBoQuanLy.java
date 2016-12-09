package canbo;

import chung.User;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 5:02:33 PM
 * @website haviettrang.blogspot.com
 */
public class CanBoQuanLy extends User {
    
    private int soDienThoai;

    public CanBoQuanLy() {
        super();
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
