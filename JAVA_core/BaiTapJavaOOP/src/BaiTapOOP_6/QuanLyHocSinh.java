package BaiTapOOP_6;

import java.util.ArrayList;

public class QuanLyHocSinh {
    private ArrayList<Nguoi> quanLyHocSinh;

    public QuanLyHocSinh() {
        this.quanLyHocSinh = new ArrayList<>();
    }

    public QuanLyHocSinh(ArrayList<Nguoi> quanLyHocSinh) {
        this.quanLyHocSinh = quanLyHocSinh;
    }

    public ArrayList<Nguoi> getQuanLyHocSinh() {
        return quanLyHocSinh;
    }

    public void setQuanLyHocSinh(ArrayList<Nguoi> quanLyHocSinh) {
        this.quanLyHocSinh = quanLyHocSinh;
    }

    public void themHocSinh(Nguoi nguoi) {
        this.quanLyHocSinh.add(nguoi);
    }

    public void inHocSinh() {
        for (Nguoi nguoi : this.quanLyHocSinh) {
            System.out.println(nguoi);
        }
    }

    public void timHocSinhTheoNamVaQue(String ngaySinh, String queQuan) {
        System.out.println("Danh sách học sinh sinh năm " + ngaySinh + " và quê ở " + queQuan + ":");
        boolean found = false;
        for (Nguoi nguoi : this.quanLyHocSinh) {
            if (nguoi.getNgaySinh().contains(ngaySinh) && nguoi.getQueQuan().equalsIgnoreCase(queQuan)) {
                System.out.println(nguoi);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh nào sinh năm " + ngaySinh + " và quê ở " + queQuan + ".");
        }
    }

    public void timHocSinhTheoLop() {
        for (Nguoi nguoi : this.quanLyHocSinh) {
            if (nguoi instanceof HocSinh) {
                HocSinh hocSinh = (HocSinh) nguoi;
                if (hocSinh.getLop().equalsIgnoreCase("10A1")) {
                    System.out.println(hocSinh);
                }
            }
        }
    }
}

