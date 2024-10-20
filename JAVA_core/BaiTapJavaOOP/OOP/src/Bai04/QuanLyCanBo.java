package Bai04;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo {
    private List<CanBo> danhSachCanBo;

    public QuanLyCanBo() {
        this.danhSachCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public CanBo timKiemCanBo(String hoTen){
        for(CanBo canBo : danhSachCanBo){
            if(canBo.getHoTen().equalsIgnoreCase(hoTen)){
                return canBo;
            }
        }
        return null;
    }

    public void hienThiThongTin(CanBo canBo){
        if(canBo != null){
            canBo.hienThiThongTin();
        }else {
            System.out.println("Không tìm thấy cán bộ");
        }
    }
}
