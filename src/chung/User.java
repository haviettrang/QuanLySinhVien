package chung;

/**
 *
 * @author HAVIETTRANG
 */
public abstract class User {
    private String username;
    private String password;
    

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @param matKhauCu
     * @param matKhauMoi
     * @return 
     */
    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (matKhauCu.equals(this.password)) {
            this.password = matKhauCu;
            return true;
        }
        return false;
    }
}
