package sinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 30, 2016 9:00:08 PM
 * @website haviettrang.blogspot.com
 */
public class ThaoTacSV implements IThaoTacSV {

    private static final String FILEPATH = "database/sinhvien.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    //CSV file header
    private static final String FILE_HEADER
            = "id,username,password,name,birthday,email,gender,class,faculty,address,cpa,accumalated_credit,complete_program";

    private static ArrayList<SV> listSV;

    public ThaoTacSV() {
        listSV = new ArrayList<>();
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
                String [] info = line.split(COMMA_DELIMITER);
                
                if ("".equals(info[11])) {
                    SVNienChe sv = new SVNienChe();
                    sv.setID(info[0]);
                    sv.setUsername(info[1]);
                    sv.setPassword(info[2]);
                    sv.setHoTen(info[3]);
                    sv.setNgaySinh(info[4]);
                    sv.setEmail(info[5]);
                    sv.setIsNam(info[6]);
                    sv.setLop(info[7]);
                    sv.setKhoaVien(info[8]);
                    sv.setDiaChi(info[9]);
                    sv.setCPA(Double.valueOf(info[10]));
                    sv.setHocHetMonHoc(Boolean.valueOf(info[12]));
                    
                    listSV.add(sv);
                } else {
                    SVTinChi sv = new SVTinChi();
                    sv.setID(info[0]);
                    sv.setUsername(info[1]);
                    sv.setPassword(info[2]);
                    sv.setHoTen(info[3]);
                    sv.setNgaySinh(info[4]);
                    sv.setEmail(info[5]);
                    sv.setIsNam(info[6]);
                    sv.setLop(info[7]);
                    sv.setKhoaVien(info[8]);
                    sv.setDiaChi(info[9]);
                    sv.setCPA(Double.valueOf(info[10]));
                    sv.setTinChiTichLuy(Integer.valueOf(info[11]));
                    
                    listSV.add(sv);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<? extends SV> getAll() {
        return listSV;
    }

    @Override
    public <E extends SV> boolean addNew(E e) {
        return listSV.add(e);
    }

    @Override
    public <E extends SV> SV update(E e) {
        return listSV.set(listSV.indexOf(e), e);
    }

    @Override
    public <E extends SV> boolean delete(E e) {
        return listSV.remove(e);
    }

    @Override
    public SV searchByID(String ID) {
        for (Iterator<SV> iterator = listSV.iterator(); iterator.hasNext();) {
            SV next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public ArrayList<? extends SV> searchByClass(String maLop) {
        ArrayList<SV> list = new ArrayList<>();
        for (Iterator<SV> iterator = list.iterator(); iterator.hasNext();) {
            SV next = iterator.next();
            if (next.getLop().equalsIgnoreCase(maLop)) {
                list.add(next);
            }
        }
        return list;
    }

    @Override
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, true))) {
            for (Iterator<? extends SV> iterator = listSV.iterator(); iterator.hasNext();) {
                SV sv = iterator.next();

                bw.append(sv.getID());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getUsername());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getPassword());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getHoTen());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getNgaySinhString());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getEmail());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(sv.isNam()));
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getLop());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getKhoaVien());
                bw.append(COMMA_DELIMITER);

                bw.append(sv.getDiaChi());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(sv.getCPA()));
                bw.append(COMMA_DELIMITER);

                if (sv instanceof SVTinChi) {
                    bw.append(String.valueOf(((SVTinChi) sv).getTinChiTichLuy()));
                    bw.append(COMMA_DELIMITER);
                    bw.append(" ");
                } else {
                    bw.append(" ");
                    bw.append(COMMA_DELIMITER);
                    bw.append(String.valueOf(((SVNienChe) sv).isHocHetMonHoc()));
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
