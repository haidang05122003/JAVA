package LapTrinh_TuongTac_Voi_TapTin;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinThuMuc {
    public static void main(String[] args) {
        //luu y
        //MS Window: \ ==> \\  ViDu: C:\\ThuMuc\\ThuMuc2\\TenTapTin.xxx
        //Linux, MaxOS: ==> vidu: /Thumuc1/Thumuc2/TenTapTin.xxx

        //Kiem Tra thu muc co ton tai hay khong
        File folder1 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\LapTrinh_TuongTac_Voi_TapTin");
        File folder2 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\LapTrinh_TuongTac_Voi_TapTin1");

        System.out.println("Kiem tra folder con ton tai hay khong: "+ folder1.exists());
        System.out.println("Kiem tra folder con ton tai hay khong: "+ folder2.exists());

        // tao thu muc
        // phuong thuc mkdir()
        File d1 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\LapTrinh_TuongTac_Voi_TapTin\\Directory_1");
        d1.mkdir();

        //phuong thuc mkidirs() ==> tao nhieu thu muc cung luc
        File d2 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\LapTrinh_TuongTac_Voi_TapTin\\Directory_1\\Directory_2\\Directory_3");
        d2.mkdirs();

        //tao ra 1 tap tin (co phan mo rong: .exe, .txt, .doc, ....)
        File file1 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\LapTrinh_TuongTac_Voi_TapTin\\Directory_1\\ViDu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {   //ly do phai dung try catch
            //phan quyen
            //khong co quyen tao tap tin
            //o cung day
            //duong dan sai
            throw new RuntimeException(e);
        }
    }
}
