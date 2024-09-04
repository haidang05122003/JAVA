package BaiTapOOP_5;

import java.util.ArrayList;

public class QuanLyCanBo {
    private ArrayList<CanBo>QuanLyCanBo;


    public QuanLyCanBo(ArrayList<CanBo> quanLyCanBo) {
        QuanLyCanBo = quanLyCanBo;
    }

    public QuanLyCanBo() {
        this.QuanLyCanBo = new ArrayList<>();
    }

    public ArrayList<CanBo> getQuanLyCanBo() {
        return QuanLyCanBo;
    }

    public void setQuanLyCanBo(ArrayList<CanBo> quanLyCanBo) {
        QuanLyCanBo = quanLyCanBo;
    }

    public void themCanBo(CanBo canBo) {
        this.QuanLyCanBo.add(canBo);
    }

    public void inCanBo(){
        for(CanBo canBo : this.QuanLyCanBo){
            System.out.println(canBo);
        }
    }

    public void timTheoTenCanBo(String ten){
        for(CanBo canBo : this.QuanLyCanBo){
            if(canBo.getHoTen().indexOf(ten)>=0){
                System.out.println(canBo);
            }
        }
    }
}
