package Bai05;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private String soTrang;

    public Sach(){}

    public Sach(String maTaiLieu , String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, String soTrang){
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Tên tác giả: " + tenTacGia);
        System.out.println("Số trang: " + soTrang);
    }
}
