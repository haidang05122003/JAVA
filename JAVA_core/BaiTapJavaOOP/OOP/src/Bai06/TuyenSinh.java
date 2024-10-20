package Bai06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    private List<ThiSinh> TuyenSinh;

    public TuyenSinh() {
        TuyenSinh = new ArrayList<ThiSinh>();
    }

    public void nhapThongTinThiSinh(){
        Scanner scanner = new Scanner(System.in);
        String next = " ";
        do{
            System.out.println("Nhập thông tin thí sinh");
            System.out.println("Số báo danh: ");
            String soBaoDanh = scanner.nextLine();

            System.out.println("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.println("Địa chỉ: ");
            String diaChi = scanner.nextLine();

            System.out.println("Ưu tiên khu vực: ");
            String uuTienKhuVuc = scanner.nextLine();

            System.out.println("Chọn khối thi (A, B, C): ");
            String khoiThi = scanner.nextLine().toUpperCase();

            ThiSinh thiSinh = null;
            if(khoiThi.equals("A")){
                thiSinh = new ThiSinhKhoiA(soBaoDanh,hoTen,diaChi,uuTienKhuVuc);
            } else if (khoiThi.equals("B")) {
                thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, uuTienKhuVuc);
            } else if (khoiThi.equals("C")) {
                thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, uuTienKhuVuc);
            }else {
                System.out.println("Khối thi không hợp lệ !");
                continue;
            }

            TuyenSinh.add(thiSinh);

            System.out.println("Bạn có muốn nhập thêm thi sinh không (y/n) :");
            next = scanner.nextLine();

        }while (next.equalsIgnoreCase("y"));
    }

    public void hienThiThiSinh(){
       if(TuyenSinh.isEmpty()){
           System.out.println("Không có thí sinh nào trong danh sách !");
       }else{
           System.out.println("Danh sách toàn bộ thí sinh ");
           for(ThiSinh thiSinh : TuyenSinh){
               thiSinh.hienThiThongTin();
               System.out.println("---------------------");
           }
       }
    }

    public ThiSinh timKiemThiSinh(String soBaoDanh){
        for(ThiSinh thiSinh : TuyenSinh){
            if(thiSinh.getSoBaoDanh().equals(soBaoDanh)){
                return thiSinh;
            }
        }
        return null;
    }

    public void hienThiThongTinTimKiem(ThiSinh thiSinh){
        if(thiSinh != null){
            thiSinh.hienThiThongTin();
        }else {
            System.out.println("Không tìm thấy thí sinh !");
        }
    }
}
