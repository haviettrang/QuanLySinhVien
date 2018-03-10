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
    
    /**
     * method đăng ký môn học cho sinh viên
     * @param maLop mã lớp cần đăng kí
     * @param kiHoc kì học sv đkí
     * @param maSV mã số sv của sv
     */
    public void themSV(String maLop,String kiHoc, String maSV);
    
    public void xoaSV(String maLop, String kiHoc, String maSV);
}
