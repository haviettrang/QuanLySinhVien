package bangdiem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import lophoc.ThaoTacLopHoc;
import monhoc.ThaoTacMonHoc;
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
            "maSv,maMon,maLopHoc,diemQuaTrinh,DiemCuoiKi,trongSo,diemTongKet";

    private static ArrayList<BangDiem> listBangDiem;
    
    private static ThaoTacSV ttsv;
    private static ThaoTacMonHoc ttmh;
    private static ThaoTacLopHoc ttlh;

    public ThaoTacBangDiem() {
        listBangDiem = new ArrayList<>();
        ttsv = new ThaoTacSV();
        ttmh = new ThaoTacMonHoc();
        ttlh = new ThaoTacLopHoc();
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

                BangDiem bangDiem = new BangDiem();

                bangDiem.setSv(ttsv.searchByID(info[0]));
                bangDiem.setMonHoc(ttmh.searchByID(info[1]));
                bangDiem.setLopHoc(ttlh.searchByID(info[2]));
                bangDiem.setDiemQuaTrinh(Double.valueOf(info[3]));
                bangDiem.setDiemCuoiKi(Double.valueOf(info[4]));
                bangDiem.setTrongSo(Double.valueOf(info[5]));

                listBangDiem.add(bangDiem);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<BangDiem> getAll() {
        return listBangDiem;
    }

    @Override
    public boolean addNew(BangDiem e) {
        return listBangDiem.add(e);
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

                bw.append(bangDiem.getMonHoc().getMaMon());
                bw.append(COMMA_DELIMITER);

                bw.append(bangDiem.getLopHoc().getMaLop());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(bangDiem.getDiemQuaTrinh()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(bangDiem.getDiemCuoiKi()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(bangDiem.getTrongSo()));
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
