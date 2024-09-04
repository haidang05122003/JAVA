package DocDuLieuVanBan_File;

import javax.net.ssl.StandardConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cach 1
        /* File f = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\DocDuLieuVanBan_File\\file.txt");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }else{
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //Cach 2
        File f2 = new File("E:\\JAVA_CORE\\JAVA_core\\Core_1\\DocDuLieuVanBan_File\\file.txt");
        try{
            List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for(String line : allText){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
