package DoiTen_DiChuyen_Copy_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        File f0 = new File("E:\\XoaTHUMUC\\Xoa\\TEXT.txt");
        File f1 = new File("E:\\XoaTHUMUC\\Xoa\\TEXT2.txt");
        File f2 = new File("E:\\XoaTHUMUC\\Xoa\\TEXT2xyz.txt");


        //1. Thay doi ten tap tin hoac thu muc
        //su dung File de thay doi ten
        f0.renameTo(f1);

        //su dung Files de thay doi ten
        try{
            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }

        //2. di chuyen file
        File f_2new = new File("E:\\XoaTHUMUC\\Xoa\\F0\\TEXT2xyz.txt");
        try{
            Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){
            e.printStackTrace();
        }

        //3. Copy file
        File f_0 = new File("E:\\XoaTHUMUC\\Xoa\\F0");
        File f_0copy = new File("E:\\XoaTHUMUC\\Xoa\\F0_copy");

        /* try{
            Files.copy(f_0.toPath(), f_0copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        } */

        Main.copyAll(f_0, f_0copy);
    }

    public static void copyAll(File f1, File f2) {
        try{
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            File[] mangCon = f1.listFiles();
            for(File f : mangCon){
                File f_new = new File(f2.getAbsoluteFile()+ "/"+ f.getName());
                copyAll(f, f_new);
            }
        }
    }
}
