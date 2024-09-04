package BaiTapOOP_14;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class QuanLyVanBan {
    private ArrayList<VanBan> quanLyVanBan;

    public QuanLyVanBan() {
        quanLyVanBan = new ArrayList<>();
    }

    public QuanLyVanBan(ArrayList<VanBan> quanLyVanBan) {
        this.quanLyVanBan = quanLyVanBan;
    }

    public ArrayList<VanBan> getQuanLyVanBan() {
        return quanLyVanBan;
    }

    public void setQuanLyVanBan(ArrayList<VanBan> quanLyVanBan) {
        this.quanLyVanBan = quanLyVanBan;
    }

    public void themVanBan(VanBan vanBan) {
        this.quanLyVanBan.add(vanBan);
    }

    public void inRaVanBan() {
        for(VanBan vanBan : quanLyVanBan) {
            System.out.println(vanBan);
        }
    }
    public void demSoTuTrongXau(String noiDung){
        for(VanBan vanBan : quanLyVanBan) {
            StringTokenizer strTokenizer = new StringTokenizer(vanBan.getNoiDungVanBan());
            System.out.println("Số từ trong chuỗi là: " + strTokenizer.countTokens());

        }
    }

    public void demSoKyTuH(String noiDung){
        int soKyTuH = 0; // Biến đếm số ký tự 'H' hoặc 'h'

        for(VanBan vanBan : quanLyVanBan) {
            String noiDungVanBan = vanBan.getNoiDungVanBan(); // Lấy nội dung của văn bản
            int doDai = noiDungVanBan.length(); // Lấy độ dài của chuỗi nội dung

            for(int i = 0 ; i < doDai ; i++){
                if(noiDungVanBan.charAt(i) == 'H' || noiDungVanBan.charAt(i) == 'h'){
                    soKyTuH ++;
                }
            }
        }
        System.out.println("Số kí tự H trong nội dung văn bản la: "+ soKyTuH);
    }

    public void chuanHoaXau(String noiDung){
        for(VanBan vanBan : quanLyVanBan) {
            String noiDungVanBan = vanBan.getNoiDungVanBan();
            noiDungVanBan = noiDungVanBan.trim();
            noiDungVanBan = noiDungVanBan.replaceAll("\\s+", " ");
            System.out.println("Nội dung sau chuẩn hóa: " + noiDungVanBan);
        }
    }
}
