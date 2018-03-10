package bangdiem;

import database.ReadFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import sinhvien.SV;
import sinhvien.ThaoTacSV;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:55:03 AM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ThaoTacBangDiem implements IThaoTacBangDiem {
    
    private static final String FILEPATH = "database/bangdiem.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    
    private static final String FILE_HEADER =
            "maSv,maLopHoc,diemQuaTrinh,DiemCuoiKi,diemTongKet";

    private static ArrayList<BangDiem> listBangDiem;
    
    public ThaoTacBangDiem() {
        listBangDiem = ReadFile.getListBangDiem();
    }

    @Override
    public ArrayList<BangDiem> getAll() {
        return listBangDiem;
    }

    @Override
    public boolean addNew(BangDiem e) {
        boolean check = listBangDiem.add(e);
        
        if (!check) {
            return check;
        }
        
        SV sv = e.getSv();
        
        double cpa = sv.getCPA();
        int tctl = sv.getTinChiTichLuy();
        int soTinChi = e.getLopHoc().getMonHoc().getSoTinChi();
        sv.setCPA((cpa * tctl + e.getDiemTongKet() * soTinChi) / (soTinChi + sv.getTinChiTichLuy()));
        ThaoTacSV ttsv = new ThaoTacSV();
        ttsv.update(sv);
        ttsv.save();
        
        return check;
    }

    @Override
    public BangDiem update(BangDiem e) {
        return listBangDiem.set(listBangDiem.indexOf(e), e);
    }

    @Override
    public boolean delete(BangDiem e) {
        return listBangDiem.remove(e);
    }

    @Override
    public ArrayList<BangDiem> searchByMaSinhVien(String maSinhVien) {
        ArrayList<BangDiem> list = new ArrayList<>();
        for (Iterator<BangDiem> iterator = list.iterator(); iterator.hasNext();) {
            BangDiem next = iterator.next();
            if (next.getSv().getID().equalsIgnoreCase(maSinhVien)) {
                list.add(next);
            }
        }
        return list;
    }

    @Override
    public ArrayList<BangDiem> searchByMaLopHoc(String maLopHoc) {
        ArrayList<BangDiem> list = new ArrayList<>();
        for (Iterator<BangDiem> iterator = list.iterator(); iterator.hasNext();) {
            BangDiem next = iterator.next();
            if (next.getLopHoc().getMaLop().equalsIgnoreCase(maLopHoc)) {
                list.add(next);
            }
        }
        return list;
    }

    @Override
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, false))) {
            
            bw.append(FILE_HEADER);
            bw.append(NEW_LINE_SEPARATOR);
            
            for (Iterator<BangDiem> iterator = listBangDiem.iterator(); iterator.hasNext();) {
                BangDiem bangDiem = iterator.next();

                bw.append(bangDiem.getSv().getID());
                bw.append(COMMA_DELIMITER);

                bw.append(bangDiem.getLopHoc().getMaLop());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(bangDiem.getDiemQuaTrinh()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(bangDiem.getDiemCuoiKi()));
                bw.append(COMMA_DELIMITER);
                
                bw.append(String.valueOf(bangDiem.getDiemTongKet()));
                bw.append(COMMA_DELIMITER);
                
                bw.append(NEW_LINE_SEPARATOR);

                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("Error when write .csv file!!!");
            ex.printStackTrace();
        }
    }
}
