package Kieu_Enum;

public class ThoiKhoaBieu {
        private Test thu;
        private String cacMonHoc;

    public ThoiKhoaBieu(Test thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Test getThu() {
        return thu;
    }

    public void setThu(Test thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "thu=" + thu +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }
}

