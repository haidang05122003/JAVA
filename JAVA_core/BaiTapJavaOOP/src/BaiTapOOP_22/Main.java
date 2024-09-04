package BaiTapOOP_22;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
/*
Bài 01(lthdtbai01.cpp): Tính diện tích và chu vi hình tam giác có 3 cạnh a,b,c. Ba cạnh a,b,c đọc vào
từ tệp văn bản "tamgiac.txt". Đưa kết quả ra màn hình, đồng thời ghi ra tệp văn bản "ketqua-lthdtbai01.txt".
 */
public class Main {
    public static void main(String[] args) {
        // Đường dẫn đến file đầu vào và đầu ra
        File file = new File("E:\\JAVA_CORE\\JAVA_core\\BaiTapJavaOOP\\src\\BaiTapOOP_22\\3 canh tam giac.txt");
        File file1 = new File("E:\\JAVA_CORE\\JAVA_core\\BaiTapJavaOOP\\src\\BaiTapOOP_22\\ket qua.txt");

        try {
            // Đọc tất cả các dòng từ file đầu vào
            List<String> allNum = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            List<String> result = new ArrayList<>();

            // Duyệt qua từng dòng trong file
            for (String num : allNum) {
                if (num.trim().isEmpty()) continue; // Bỏ qua dòng trống

                String[] parts = num.split("\\s+");
                if (parts.length < 3) continue; // Bỏ qua nếu không đủ 3 phần tử

                try {
                    double a = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                    double c = Double.parseDouble(parts[2]);

                    TamGiac tamGiac = new TamGiac(a, b, c);

                    // Tính và lưu kết quả chu vi, diện tích
                    result.add(tamGiac.toString());

                    // In kết quả ra màn hình
                    System.out.println(tamGiac);

                } catch (NumberFormatException e) {
                    // In ra thông báo lỗi nếu gặp dữ liệu không hợp lệ
                    System.err.println("Lỗi định dạng số trong dòng: " + num + " - " + e.getMessage());
                }
            }

            // Ghi kết quả vào file đầu ra
            Files.write(file1.toPath(), result, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
