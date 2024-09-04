package XoaTapTin_ThuMuc_Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void xoaFile(File fx) {
        if(fx.isFile()){ //neu no la tap tin
            System.out.println("Da xoa:"+fx.getAbsolutePath());
            fx.delete(); //xoa tap tin
        }else if(fx.isDirectory()){
            //Lay cac file con
            File[] mangCon = fx.listFiles();
            for(File f : mangCon){
                //xoa file con
                xoaFile(f);
            }
            //xoa ban than thu muc sau khi da xoa cac file con
            System.out.println("Da xoa:"+fx.getAbsolutePath());
            fx.delete();
        }
    }

    public static void xoaFile2(Path pt) {
        if(pt.toFile().isFile()) {
            try {
                System.out.println("Da xoa:" + pt.toFile().getAbsolutePath());
                Files.deleteIfExists(pt);
            }catch(IOException e){
                e.printStackTrace();
            }
        }else if(pt.toFile().isDirectory()) {
            File[] mangCon = pt.toFile().listFiles();
            for(File file : mangCon){
                xoaFile2(file.toPath());
            }
        }
        try {
            System.out.println("Da xoa bang file:" + pt.toFile().getAbsolutePath());
            Files.deleteIfExists(pt);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //su dung class file xoa tap tin hoac thu muc ====== FILE
        File f0 = new File("E:\\XoaTHUMUC");
        File f1 = new File("E:\\XoaTHUMUC_1");
        File f2 = new File("E:\\EXE.txt");

        //f0.deleteOnExit(); xoa khong dc vi chua tap tin
        //f1.deleteOnExit(); // xoa dc vi la thu muc rong
        //deleteOnExit(); // xoa dc vi tep .txt cung tinh la thuc muc rong

        //Main.xoaFile(f0);


        //su dung class Files xoa tap tin va thu muc ======FILES

      /*  Path p = f0.toPath();
        Path p1 = f1.toPath();
        Path p2 = f2.toPath();
        try{
            //Files.deleteIfExists(p); khong xoa dc vi co noi dung ben trong
            Files.deleteIfExists(p1);
            Files.deleteIfExists(p2);
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        Main.xoaFile2(f0.toPath());
        Main.xoaFile2(f1.toPath());
        Main.xoaFile2(f2.toPath());

    }
}
