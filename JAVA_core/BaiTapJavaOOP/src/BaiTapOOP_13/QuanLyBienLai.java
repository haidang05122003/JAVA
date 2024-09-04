package BaiTapOOP_13;

import java.util.ArrayList;

public class QuanLyBienLai {
    private ArrayList<BienLai> quanLyBienLai;

    public QuanLyBienLai() {
        this.quanLyBienLai = new ArrayList<>();
    }

    public QuanLyBienLai(ArrayList<BienLai> quanLyBienLai) {
        this.quanLyBienLai = quanLyBienLai;
    }

    public ArrayList<BienLai> getQuanLyBienLai() {
        return quanLyBienLai;
    }

    public void setQuanLyBienLai(ArrayList<BienLai> quanLyBienLai) {
        this.quanLyBienLai = quanLyBienLai;
    }

    public void themBienLai(BienLai bienLai) {
        this.quanLyBienLai.add(bienLai);
    }

    public void inBienLai() {
        for (BienLai bienLai : quanLyBienLai) {
            System.out.println(bienLai);
        }
    }

    public void tinhTienPhaiTra(String ten) {
        for (BienLai bienLai : quanLyBienLai) {
            if(bienLai.getHoTen().indexOf(ten) >= 0)
                System.out.println("Số Tiền điện của hộ ông/bà " + bienLai.getHoTen() +
                        " phải trả là: " + ((bienLai.getSoMoi() - bienLai.getSoCu()) * 750));
        }
    }
}