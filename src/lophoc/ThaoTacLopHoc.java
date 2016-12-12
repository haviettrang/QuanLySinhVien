package lophoc;

import giaovien.ThaoTacGiaoVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import monhoc.ThaoTacMonHoc;
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

    private static ArrayList<LopHoc> listLopHoc;

    public ThaoTacLopHoc() {
        listLopHoc = new ArrayList<>();
        init();
    }

    /**
     * đọc file lưu thông tin vào ArrayList
     */
    private void init() {
          String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {
            while ((line = br.readLine()) != null) {
                String[] info = line.split(COMMA_DELIMITER);

                LopHoc lopHoc = new LopHoc();

                lopHoc.setMaLop(info[0]);
                lopHoc.setPhongHoc(info[1]);
                lopHoc.setKiHoc(info[2]);
                
                ThaoTacGiaoVien ttgv = new ThaoTacGiaoVien();
                lopHoc.setGiaoVien(ttgv.searchByID(info[3]));
                
                ThaoTacMonHoc ttmh = new ThaoTacMonHoc();
                lopHoc.setMonHoc(ttmh.searchByID(info[4]));

                String[] listIDSV = info[5].split(HYPHEN_SEPARATOR);
                ArrayList<SV> listSV = new ArrayList<>();
                ThaoTacSV ttsv = new ThaoTacSV();
                for (String id : listIDSV) {
                    listSV.add(ttsv.searchByID(id));
                }

                lopHoc.setListSV(listSV);
                
                listLopHoc.add(lopHoc);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<LopHoc> getAll() {
        return listLopHoc;
    }

    @Override
    public boolean addNew(LopHoc e) {
        return listLopHoc.add(e);
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
                    listIDSV.append(a.get(i));
                    listIDSV.append(HYPHEN_SEPARATOR);
                }
                listIDSV.append(a.get(i));
                bw.append(listIDSV);
                bw.append(NEW_LINE_SEPARATOR);

                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("Error when write .csv file!!!");
            ex.printStackTrace();
        }
    }
}
