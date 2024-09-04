package GhiDuLieuVanBan_File;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("E:\\JAVA_CORE\\JAVA_core\\Core_1\\GhiDuLieuVanBan_File\\file.txt","UTF-8");
            pw.println("Hello World");
            pw.print("Du lieu: ");
            pw.println(3.14);
            pw.print(' ');

            Student st = new Student(100, "Nguyen Van A");
            pw.println(st);
            pw.print(" La so Pi");
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //muon ghi tieng viet dung PrintWriter su dung UTF-8
        //Dong file lai de mo file ra
    }
}
