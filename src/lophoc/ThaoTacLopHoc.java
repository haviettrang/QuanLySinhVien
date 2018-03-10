package lophoc;

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
 * @date Oct 30, 2016 9:19:31 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacLopHoc implements IThaoTacLopHoc {

    private static final String FILEPATH = "database/lophoc.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HYPHEN_SEPARATOR = "-";
    
    private static final String FILE_HEADER = "maLop,phongHoc,kiHoc,maGiaoVien,maMonHoc,maSinhVien";

    private static ArrayList<LopHoc> listLopHoc;

    public ThaoTacLopHoc() {
        listLopHoc = ReadFile.getListLopHoc();
    }

    @Override
    public ArrayList<LopHoc> getAll() {
        return listLopHoc;
    }

    @Override
    public boolean addNew(LopHoc e) {
        return listLopHoc.add(e);
    }
    
    public boolean addNew(String maSV, String maLop, double diemQuaTrinh, double diemCuoiKi) {
        
    }

    @Override
    public LopHoc update(LopHoc e) {
        return listLopHoc.set(listLopHoc.indexOf(e), e);
    }

    @Override
    public boolean delete(LopHoc e) {
        return listLopHoc.remove(e);
    }

    @Override
    public LopHoc searchByID(String ID) {
        for (Iterator<LopHoc> iterator = listLopHoc.iterator(); iterator.hasNext();) {
            LopHoc next = iterator.next();
            if (next.getMaLop().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, true))) {
            
            bw.append(FILE_HEADER);
            bw.append(NEW_LINE_SEPARATOR);
            
            for (Iterator<LopHoc> iterator = listLopHoc.iterator(); iterator.hasNext();) {
                LopHoc lopHoc = iterator.next();

                bw.append(lopHoc.getMaLop());
                bw.append(COMMA_DELIMITER);

                bw.append(lopHoc.getPhongHoc());
                bw.append(COMMA_DELIMITER);

                bw.append(lopHoc.getKiHoc());
                bw.append(COMMA_DELIMITER);

                bw.append(lopHoc.getGiaoVien().getID());
                bw.append(COMMA_DELIMITER);

                bw.append(lopHoc.getMonHoc().getMaMon());
                bw.append(COMMA_DELIMITER);

                StringBuilder listIDSV = new StringBuilder();
                ArrayList<SV> a = lopHoc.getListSV();
                int i;
                for (i = 0; i < a.size() - 1; i++) {
                    listIDSV.append(a.get(i).getID());
                    listIDSV.append(HYPHEN_SEPARATOR);
                }
                listIDSV.append(a.get(i).getID());
                bw.append(listIDSV);
                bw.append(NEW_LINE_SEPARATOR);

                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("Error when write .csv file!!!");
            ex.printStackTrace();
        }
    }

    @Override
    public void themSV(String maLop, String kiHoc, String maSV) {
        for (int i = 0; i < listLopHoc.size(); i++) {
            LopHoc lopHoc = listLopHoc.get(i);
            if (lopHoc.getMaLop().equalsIgnoreCase(maLop) && lopHoc.getKiHoc().equalsIgnoreCase(kiHoc)) {
                
                ThaoTacSV ttsv = new ThaoTacSV();
                SV sv = ttsv.searchByID(maSV);
                
                lopHoc.themSV(sv);
                
                listLopHoc.set(i, lopHoc);
            }
        }
    }

    @Override
    public void xoaSV(String maLop, String kiHoc, String maSV) {
        for (int i = 0; i < listLopHoc.size(); i++) {
            LopHoc lopHoc = listLopHoc.get(i);
            if (lopHoc.getMaLop().equalsIgnoreCase(maLop) && lopHoc.getKiHoc().equalsIgnoreCase(kiHoc)) {
                
                ThaoTacSV ttsv = new ThaoTacSV();
                SV sv = ttsv.searchByID(maSV);
                
                lopHoc.xoaSV(sv);
                
                listLopHoc.set(i, lopHoc);
            }
        }
    }
}
