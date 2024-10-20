package Bai05;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> quanLyTaiLieu;

    public QuanLyTaiLieu() {
        quanLyTaiLieu = new ArrayList<>();
    }

    public void themTaiLieu(TaiLieu taiLieu){
        quanLyTaiLieu.add(taiLieu);
    }

    public TaiLieu timTaiLieu(String maTaiLieu){
        for(TaiLieu taiLieu : quanLyTaiLieu){
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)){
                return taiLieu;
            }
        }
        return null;
    }

    public void hienThiTimKiem(TaiLieu taiLieu){
        if(taiLieu != null){
            taiLieu.hienThi();
        }else {
            System.out.println("Không tìm thấy dữ liệu cần tìm.");
        }
    }
}
