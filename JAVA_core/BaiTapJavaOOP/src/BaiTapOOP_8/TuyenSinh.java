package BaiTapOOP_8;

import java.util.ArrayList;

public class TuyenSinh {
    private ArrayList<ThongTin>TuyenSinh;

    public TuyenSinh() {
        this.TuyenSinh = new ArrayList<>();
    }

    public TuyenSinh(ArrayList<ThongTin> tuyenSinh) {
        TuyenSinh = tuyenSinh;
    }

    public ArrayList<ThongTin> getTuyenSinh() {
        return TuyenSinh;
    }

    public void setTuyenSinh(ArrayList<ThongTin> tuyenSinh) {
        TuyenSinh = tuyenSinh;
    }

    public void themThongThi(ThongTin thongTin) {
        this.TuyenSinh.add(thongTin);
    }

    public void inThongTin(){
        for(ThongTin thongTin : TuyenSinh){
            System.out.println(thongTin);
        }
    }
    public void timKiemTheoSBD(String sbd){
        for(ThongTin thongTin : TuyenSinh){
                if(thongTin.getSBD().contains(sbd)){
                    System.out.println(thongTin);
                }
        }
    }

}
