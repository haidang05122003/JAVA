package bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

 class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Perimeter: " + calculatePerimeter() + "\nArea: " + calculateArea();
    }
}

class FileReaderUtil {
    public static Triangle readTriangleFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line == null) {
                System.out.println("File is empty");
                return null;
            }
            String[] parts = line.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Invalid file format");
                return null;
            }
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            double c = Double.parseDouble(parts[2]);
            return new Triangle(a, b, c);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
            return null;
        }
    }
}
class FileWriterUtil {
    public static void writeResultToFile(String filePath, Triangle triangle) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(triangle.toString());
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void createTriangleFile(String filePath, double a, double b, double c) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(a + " " + b + " " + c);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
public class b01 {
    public static void main(String[] args) {
        String inputFile = "tamgiac.txt";
        String outputFile = "ketqua-lthdtbai01.txt";

        // Tạo tệp tamgiac.txt và ghi dữ liệu vào
        FileWriterUtil.createTriangleFile(inputFile, 6, 7, 9);

        // Đọc dữ liệu từ tệp tamgiac.txt
        Triangle triangle = FileReaderUtil.readTriangleFromFile(inputFile);
        if (triangle != null) {
            System.out.println(triangle);
            FileWriterUtil.writeResultToFile(outputFile, triangle);
        } else {
            System.out.println("Failed to read data from file: " + inputFile);
        }
    }
}
