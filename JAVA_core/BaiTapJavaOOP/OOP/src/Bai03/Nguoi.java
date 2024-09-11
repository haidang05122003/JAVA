package Bai03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;

    public Nguoi() {

    }

    public Nguoi(String hoTen) {
        this.hoTen = hoTen;
    }
    public Nguoi(String hoTen, Date ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh (dd/MM/yyyy): ");
        String ngaySinhStr = sc.nextLine();
        this.ngaySinh = stringToDate(ngaySinhStr);
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
    }


    public Date stringToDate(String ngaySinhStr){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date ngaySinhDate = null;
        try {
            ngaySinhDate = sdf.parse(ngaySinhStr);
        } catch (Exception ex) {
            System.out.println("Định dạng ngày sinh không hợp lệ. Vui lòng nhập lại (dd/MM/yyyy): ");
        }
        return ngaySinhDate;
    }


    public Date getNgaySinh(){
        return ngaySinh;
    }

    public String getQueQuan(){
        return queQuan;
    }

    public void inThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhFormatted = (ngaySinh != null) ? sdf.format(ngaySinh) : "N/A";
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinhFormatted);
        System.out.println("Que quan: " + queQuan);
    }

}
