package GhiDoiTuongXuongFile_File;

import GhiDuLieuVanBan_File.Student;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\GhiDoiTuongXuongFile_File/File.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sinhVien = new SinhVien("001","Hoang Hai Dang",2003,10);
            oos.writeObject(sinhVien);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
