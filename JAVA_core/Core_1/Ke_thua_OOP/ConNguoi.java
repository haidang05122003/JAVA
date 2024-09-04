package Ke_thua_OOP;

public class ConNguoi {
   private String hoVaten;
   private int namSinh;

    public ConNguoi(String hoVaten, int namSinh) {
        this.hoVaten = hoVaten;
        this.namSinh = namSinh;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void An() {
        System.out.println("Mam mam");
    }

    public void Ngu() {
        System.out.println("Kho kho");
    }

    public void Uong() {
        System.out.println("uc uc");
    }

}
