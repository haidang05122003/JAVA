package GhiDoiTuongXuongFile_File;

import java.io.*;

public class DocDoiTuong {
    public static void main(String[] args) {
        try {
            File file1 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\GhiDoiTuongXuongFile_File/File.txt");
            InputStream is = new FileInputStream(file1);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sinhVien = (SinhVien) ois.readObject();
            System.out.println(sinhVien.getDiemTB());
            System.out.println(sinhVien.getNamSinh());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
