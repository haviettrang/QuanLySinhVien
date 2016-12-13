package monhoc;

import database.ReadFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 30, 2016 9:15:44 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacMonHoc implements IThaoTacMonHoc {

    private static final String FILEPATH = "database/monhoc.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HYPHEN_SEPARATOR = "-";
    //CSV file header
    private static final String FILE_HEADER
            = "maMon,tenMon,trongSo,soTinChi,KhoaVien,hocPhanDieuKien";

    private static ArrayList<MonHoc> listMonHoc;

    public ThaoTacMonHoc() {
        listMonHoc = ReadFile.getListMonHoc();
    }

    @Override
    public ArrayList<MonHoc> getAll() {
        return listMonHoc;
    }

    @Override
    public boolean addNew(MonHoc e) {
        return listMonHoc.add(e);
    }

    @Override
    public MonHoc update(MonHoc e) {
        return listMonHoc.set(listMonHoc.indexOf(e), e);
    }

    @Override
    public boolean delete(MonHoc e) {
        return listMonHoc.remove(e);
    }

    @Override
    public MonHoc searchByID(String ID) {
        for (Iterator<MonHoc> iterator = listMonHoc.iterator(); iterator.hasNext();) {
            MonHoc next = iterator.next();
            if (next.getMaMon().equalsIgnoreCase(ID)) {
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
            
            for (Iterator<MonHoc> iterator = listMonHoc.iterator(); iterator.hasNext();) {
                MonHoc monHoc = iterator.next();

                bw.append(monHoc.getMaMon());
                bw.append(COMMA_DELIMITER);

                bw.append(monHoc.getTenMon());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(monHoc.getTrongSo()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(monHoc.getSoTinChi()));
                bw.append(COMMA_DELIMITER);

                bw.append(monHoc.getKhoaVien());
                bw.append(COMMA_DELIMITER);

                if (monHoc.getHocPhanDieuKien() != null) {
                    ArrayList <MonHoc> a = monHoc.getHocPhanDieuKien();
                    String hpdk = "";
                    int i;
                    for (i = 0; i < a.size() - 1; i++) {
                        hpdk += a.get(i) + HYPHEN_SEPARATOR;
                    }
                    hpdk += a.get(i);
                    bw.append(hpdk);
                } else {
                    bw.append(" ");
                }

                bw.append(NEW_LINE_SEPARATOR);

                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("Error when write .csv file!!!");
            ex.printStackTrace();
        }
    }

}
