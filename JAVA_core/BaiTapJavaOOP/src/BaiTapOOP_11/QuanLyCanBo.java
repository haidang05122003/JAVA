package BaiTapOOP_11;

import java.util.ArrayList;

public class QuanLyCanBo {
    private ArrayList<Nguoi>quanLyCanBo;

    public QuanLyCanBo() {
        this.quanLyCanBo = new ArrayList<>();
    }

    public QuanLyCanBo(ArrayList<Nguoi> quanLyCanBo) {
        this.quanLyCanBo = quanLyCanBo;
    }

    public ArrayList<Nguoi> getQuanLyCanBo() {
        return quanLyCanBo;
    }

    public void setQuanLyCanBo(ArrayList<Nguoi> quanLyCanBo) {
        this.quanLyCanBo = quanLyCanBo;
    }

    public void themCanBo(CanBo canBo) {
        this.quanLyCanBo.add(canBo);
    }

    public void inCanBo(){
        for(Nguoi nguoi : quanLyCanBo){
            if(nguoi instanceof CanBo){
                CanBo canBo = (CanBo) nguoi;
                System.out.println(canBo);
            }
        }
    }

    public double tinhLuongCuaCanBo(String ten){
        for(Nguoi nguoi : quanLyCanBo){
            if(nguoi instanceof CanBo){
                CanBo canBo = (CanBo) nguoi;
                if(nguoi.getHoTen().equals(ten)){
                    System.out.println("Lương được lãnh của cán bộ là: "+ (canBo.getLuongCung() + canBo.getThuong() - canBo.getPhat()));
                }
            }
        }
        return 0;
    }

    public void inRaLuongTren8Tr(){
        for(Nguoi nguoi : quanLyCanBo){
            if(nguoi instanceof CanBo){
                CanBo canBo = (CanBo) nguoi;
                    if(canBo.getLuongThucLinh() >= 8000000)
                    System.out.println(canBo);
            }
        }
    }
}
