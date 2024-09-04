package BaiTapOOP_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do{
            System.out.println("--------MENU--------");
            System.out.println("1. Nhap vao toa do 2 diem: ");
            System.out.println("2. In ra toa do 2 diem: ");
            System.out.println("3. Tinh khoang cach giua 2 diem: ");
            System.out.println("4. Tinh dien tich tam giac: ");
            System.out.println("5. Tinh chu vi tam giac: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Nhap vao toa do diem1: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                System.out.println("Nhap vao toa do diem2: ");
                float x1 = sc.nextFloat();
                float y1 = sc.nextFloat();
            }else if(luaChon == 2){
                System.out.println("Nhap vao toa do diem: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                Diem diem = new Diem(x,y);
                diem.inDiem();
            }else if(luaChon == 3){
                System.out.println("Nhap vao toa do diem1: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                Diem diem = new Diem(x,y);
                System.out.println("Nhap vao toa do diem2: ");
                float x1 = sc.nextFloat();
                float y1 = sc.nextFloat();
                Diem diem1 = new Diem(x1,y1);
                System.out.println("khoang cach giua 2 diem: "+ diem.khoangCach(diem1));
            }else if(luaChon == 4){
                System.out.println("Nhap vao toa do diem1: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                Diem A = new Diem(x,y);
                System.out.println("Nhap vao toa do diem2: ");
                float x1 = sc.nextFloat();
                float y1 = sc.nextFloat();
                Diem B = new Diem(x1,y1);
                System.out.println("Nhap vao toa do diem3: ");
                float x2 = sc.nextFloat();
                float y2 = sc.nextFloat();
                Diem C = new Diem(x2,y2);
                TamGiac tamGiac = new TamGiac(x,y,A,B,C);
                System.out.println("Dien tich tam giac la: " + tamGiac.dienTich());
            }else if(luaChon == 5){
                System.out.println("Nhap vao toa do diem1: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                Diem A = new Diem(x,y);
                System.out.println("Nhap vao toa do diem2: ");
                float x1 = sc.nextFloat();
                float y1 = sc.nextFloat();
                Diem B = new Diem(x1,y1);
                System.out.println("Nhap vao toa do diem3: ");
                float x2 = sc.nextFloat();
                float y2 = sc.nextFloat();
                Diem C = new Diem(x2,y2);
                TamGiac tamGiac = new TamGiac(x,y,A,B,C);
                System.out.println("Chu vi tam giac la: " + tamGiac.chuVi());
            }
        }while(luaChon != 0);
    }
}
