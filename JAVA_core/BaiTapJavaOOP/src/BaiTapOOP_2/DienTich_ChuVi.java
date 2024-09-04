package BaiTapOOP_2;

import java.util.ArrayList;

public class DienTich_ChuVi {
    private ArrayList<HinhTron>dienTich_chuVi;

    public DienTich_ChuVi() {
        this.dienTich_chuVi = new ArrayList<HinhTron>();
    }
    public DienTich_ChuVi(ArrayList<HinhTron> dienTich_chuVi) {
        this.dienTich_chuVi = dienTich_chuVi;
    }

    public void themHinhTron(HinhTron hinhTron) {
        this.dienTich_chuVi.add(hinhTron);
    }

    public void inRaManHinh() {
        for(HinhTron hinhTron : this.dienTich_chuVi) {
            System.out.println(hinhTron);
        }
    }

public void tinhVaInChuViVaDienTich() {
    for (HinhTron hinhTron : this.dienTich_chuVi) {
        double dienTich = 3.14 * hinhTron.getR() * hinhTron.getR();
        double chuVi = 2 * 3.14 * hinhTron.getR();
        System.out.println("Hinh Tron với bán kính " + hinhTron.getR() + " và màu " + hinhTron.getMau() +
                " có Chu vi: " + chuVi + " và Diện tích: " + dienTich);
        }
    }
}
