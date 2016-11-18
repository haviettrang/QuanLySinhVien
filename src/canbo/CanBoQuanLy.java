package canbo;

import chung.User;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 28, 2016 5:02:33 PM
 * @website haviettrang.blogspot.com
 */
public class CanBoQuanLy extends User {
    
    private String soDienThoai;

    public CanBoQuanLy() {
        super();
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
