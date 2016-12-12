package giaovien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import monhoc.MonHoc;
import monhoc.ThaoTacMonHoc;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Nov 4, 2016 7:21:12 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ThaoTacGiaoVien implements IThaoTacGiaoVien {

    private static final String FILEPATH = "database/giaovien.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HYPHEN_SEPARATOR = "-";

    private static ArrayList<GiaoVien> listGiaoVien;

    public ThaoTacGiaoVien() {
        listGiaoVien = new ArrayList<>();
        init();
    }

    /**
     * đọc file lưu thông tin vào ArrayList
     */
    private void init() {
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
            while ((line = br.readLine()) != null) {
                String[] info = line.split(COMMA_DELIMITER);

                GiaoVien giaoVien = new GiaoVien();

                giaoVien.setID(info[0]);
                giaoVien.setUsername(info[1]);
                giaoVien.setPassword(info[2]);
                giaoVien.setHoTen(info[3]);
                giaoVien.setNgaySinh(info[4]);
                giaoVien.setEmail(info[5]);
                giaoVien.setIsNam(info[6]);
                giaoVien.setSoDienThoai(Integer.parseInt(info[7]));
                giaoVien.setKhoaVien(info[8]);

                String[] monHoc = info[9].split(HYPHEN_SEPARATOR);
                ArrayList<MonHoc> list = new ArrayList<>();
                ThaoTacMonHoc ttmh = new ThaoTacMonHoc();
                for (String mh : monHoc) {
                    list.add(ttmh.searchByID(mh));
                }
                giaoVien.setMonDay(list);

                listGiaoVien.add(giaoVien);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .cgiaoVien file!!!");
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<GiaoVien> getAll() {
        return listGiaoVien;
    }

    @Override
    public boolean addNew(GiaoVien e) {
        return listGiaoVien.add(e);
    }

    @Override
    public GiaoVien update(GiaoVien e) {
        return listGiaoVien.set(listGiaoVien.indexOf(e), e);
    }

    @Override
    public boolean delete(GiaoVien e) {
        return listGiaoVien.remove(e);
    }

    @Override
    public GiaoVien searchByID(String ID) {
        for (Iterator<GiaoVien> iterator = listGiaoVien.iterator(); iterator.hasNext();) {
            GiaoVien next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, true))) {
            for (Iterator<GiaoVien> iterator = listGiaoVien.iterator(); iterator.hasNext();) {
                GiaoVien giaoVien = iterator.next();

                bw.append(giaoVien.getID());
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getUsername());
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getPassword());
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getHoTen());
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getNgaySinhString());
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getEmail());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(giaoVien.isNam()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(giaoVien.getSoDienThoai()));
                bw.append(COMMA_DELIMITER);

                bw.append(giaoVien.getKhoaVien());
                bw.append(COMMA_DELIMITER);

                if (giaoVien.getMonDay() != null) {
                    ArrayList<MonHoc> a = giaoVien.getMonDay();
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
            System.out.println("Error when write .cgiaoVien file!!!");
            ex.printStackTrace();
        }
    }
}
