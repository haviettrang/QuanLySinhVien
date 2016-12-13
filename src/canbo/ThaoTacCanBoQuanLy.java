package canbo;

import database.ReadFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Oct 31, 2016 10:21:33 AM
 * @website haviettrang.blogspot.com View my notes at haviettrang.postach.io
 */
public class ThaoTacCanBoQuanLy implements IThaoTacCanBo {

    private static final String FILEPATH = "database/canboquanly.csv";
    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    
    private static final String FILE_HEADER =
            "id,username,password,name,birthday,email,gender,phoneNumber";

    private static ArrayList<CanBoQuanLy> listCanBoQuanLy;

    public ThaoTacCanBoQuanLy() {
        listCanBoQuanLy = ReadFile.getListCanBo();
    }

    @Override
    public ArrayList<CanBoQuanLy> getAll() {
        return listCanBoQuanLy;
    }

    @Override
    public boolean addNew(CanBoQuanLy e) {
        return listCanBoQuanLy.add(e);
    }

    @Override
    public CanBoQuanLy update(CanBoQuanLy e) {
        return listCanBoQuanLy.set(listCanBoQuanLy.indexOf(e), e);
    }

    @Override
    public boolean delete(CanBoQuanLy e) {
        return listCanBoQuanLy.remove(e);
    }

    @Override
    public CanBoQuanLy searchByID(String ID) {
        for (Iterator<CanBoQuanLy> iterator = listCanBoQuanLy.iterator(); iterator.hasNext();) {
            CanBoQuanLy next = iterator.next();
            if (next.getID().equalsIgnoreCase(ID)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, false))) {
            
            bw.append(FILE_HEADER);
            bw.append(NEW_LINE_SEPARATOR);
            
            for (Iterator<CanBoQuanLy> iterator = listCanBoQuanLy.iterator(); iterator.hasNext();) {
                CanBoQuanLy canBo = iterator.next();

                bw.append(canBo.getID());
                bw.append(COMMA_DELIMITER);

                bw.append(canBo.getUsername());
                bw.append(COMMA_DELIMITER);

                bw.append(canBo.getPassword());
                bw.append(COMMA_DELIMITER);

                bw.append(canBo.getHoTen());
                bw.append(COMMA_DELIMITER);

                bw.append(canBo.getNgaySinhString());
                bw.append(COMMA_DELIMITER);

                bw.append(canBo.getEmail());
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(canBo.isNam()));
                bw.append(COMMA_DELIMITER);

                bw.append(String.valueOf(canBo.getSoDienThoai()));
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
