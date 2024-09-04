package BaiTapOOP_20;

public class Student {
    private String name;
    private String id;
    private String lop;

    public Student(){

    }

    public Student(String name, String id, String lop) {
        this.name = name;
        this.id = id;
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
                ", lop='" + lop + '\'' +
                '}';
    }
}
