package database;

import bangdiem.BangDiem;
import canbo.CanBoQuanLy;
import giaovien.GiaoVien;
import giaovien.ThaoTacGiaoVien;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import lophoc.LopHoc;
import lophoc.ThaoTacLopHoc;
import monhoc.MonHoc;
import monhoc.ThaoTacMonHoc;
import sinhvien.SV;
import sinhvien.SVNienChe;
import sinhvien.SVTinChi;
import sinhvien.ThaoTacSV;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 13, 2016 3:49:15 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
public class ReadFile {
    private static final String FILEPATH_SV = "database/sinhvien.csv";
    private static final String FILEPATH_MONHOC = "database/monhoc.csv";
    private static final String FILEPATH_GIAOVIEN = "database/giaovien.csv";
    private static final String FILEPATH_CANBO = "database/canboquanly.csv";
    private static final String FILEPATH_LOPHOC = "database/lophoc.csv";
    private static final String FILEPATH_BANGDIEM = "database/bangdiem.csv";
    
    private static final String COMMA_DELIMITER = ",";
    private static final String HYPHEN_SEPARATOR = "-";
    
    private static ArrayList<SV> listSV;
    private static ArrayList<MonHoc> listMonHoc;
    private static ArrayList<GiaoVien> listGiaoVien;
    private static ArrayList<CanBoQuanLy> listCanBo;
    private static ArrayList<LopHoc> listLopHoc;
    private static ArrayList<BangDiem> listBangDiem;
    
    private String line;
    
    public ReadFile() {
        listSV = new ArrayList<>();
        listMonHoc = new ArrayList<>();
        listGiaoVien = new ArrayList<>();
        listCanBo = new ArrayList<>();
        listLopHoc = new ArrayList<>();
        listBangDiem = new ArrayList<>();
        
        line = "";
    }

    public static ArrayList<SV> getListSV() {
        return listSV;
    }

    public static ArrayList<MonHoc> getListMonHoc() {
        return listMonHoc;
    }

    public static ArrayList<GiaoVien> getListGiaoVien() {
        return listGiaoVien;
    }

    public static ArrayList<CanBoQuanLy> getListCanBo() {
        return listCanBo;
    }

    public static ArrayList<LopHoc> getListLopHoc() {
        return listLopHoc;
    }

    public static ArrayList<BangDiem> getListBangDiem() {
        return listBangDiem;
    }
    
    /**
     * Đọc file ngay từ class Main của chương trình
     */
    public void read() {
        loadSv();
        loadMonHoc();
        loadGiaoVien();
        loadCanBo();
        loadLopHoc();
        loadBangDiem();
    }

    private void loadSv() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_SV))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
            while ((line = br.readLine()) != null) {
                String [] info = line.split(COMMA_DELIMITER);
                
                if (!" ".equals(info[12])) {
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

    private void loadMonHoc() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_MONHOC))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
            while ((line = br.readLine()) != null) {
                String[] info = line.split(COMMA_DELIMITER);

                MonHoc monHoc = new MonHoc();

                monHoc.setMaMon(info[0]);
                monHoc.setTenMon(info[1]);
                monHoc.setTrongSo(Double.valueOf(info[2]));
                monHoc.setSoTinChi(Integer.valueOf(info[3]));
                monHoc.setKhoaVien(info[4]);

                String[] hpdk = info[5].split(HYPHEN_SEPARATOR);
                monHoc.setHocPhanDieuKien((ArrayList<String>) Arrays.asList(hpdk));

                listMonHoc.add(monHoc);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    private void loadGiaoVien() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_GIAOVIEN))) {
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
                ArrayList<String> list = new ArrayList<>();
                list.addAll(Arrays.asList(monHoc));
                giaoVien.setMonDay(list);

                listGiaoVien.add(giaoVien);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .cgiaoVien file!!!");
            ex.printStackTrace();
        }
    }

    private void loadCanBo() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_CANBO))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
            while ((line = br.readLine()) != null) {
                String[] info = line.split(COMMA_DELIMITER);

                CanBoQuanLy canBo = new CanBoQuanLy();

                canBo.setID(info[0]);
                canBo.setUsername(info[1]);
                canBo.setPassword(info[2]);
                canBo.setHoTen(info[3]);
                canBo.setNgaySinh(info[4]);
                canBo.setEmail(info[5]);
                canBo.setIsNam(info[6]);
                canBo.setSoDienThoai(Integer.parseInt(info[7]));

                listCanBo.add(canBo);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    private void loadBangDiem() {
        ThaoTacSV ttsv = new ThaoTacSV();
        ThaoTacLopHoc ttlh = new ThaoTacLopHoc();
        
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_BANGDIEM))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
            while ((line = br.readLine()) != null) {
                String[] info = line.split(COMMA_DELIMITER);

                BangDiem bangDiem = new BangDiem();

                bangDiem.setSv(ttsv.searchByID(info[0]));
                bangDiem.setLopHoc(ttlh.searchByID(info[1]));
                bangDiem.setDiemQuaTrinh(Double.valueOf(info[2]));
                bangDiem.setDiemCuoiKi(Double.valueOf(info[3]));

                listBangDiem.add(bangDiem);
            }
        } catch (IOException ex) {
            System.out.println("Error when read .csv file!!!");
            ex.printStackTrace();
        }
    }

    private void loadLopHoc() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH_LOPHOC))) {
            br.readLine(); //bỏ qua dòng đầu tiên.
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
}
