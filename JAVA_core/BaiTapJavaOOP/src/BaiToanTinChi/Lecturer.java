package BaiToanTinChi;

public class Lecturer extends Human{
    private String password;

    public Lecturer(String fullName, String address, String code, String password) {
        super(fullName, address, code);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Lecturer {" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
