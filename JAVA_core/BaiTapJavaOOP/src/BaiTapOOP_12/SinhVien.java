package BaiTapOOP_12;

import java.time.LocalDate;

public class SinhVien {
    private String name;
    private String id;
    private LocalDate date;
    private String lop;

    public SinhVien(){

    }

    public SinhVien(String name, String id, LocalDate date, String lop) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", date=" + date +
                ", lop='" + lop + '\'' +
                '}';
    }
}
