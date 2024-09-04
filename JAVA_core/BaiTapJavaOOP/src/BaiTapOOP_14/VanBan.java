package BaiTapOOP_14;

public class VanBan {
    private String tenVanBan;
    private String noiDungVanBan;

    public VanBan() {}

    public VanBan(String noiDungVanBan) {}

    public VanBan(String tenVanBan, String noiDungVanBan) {
        this.tenVanBan = tenVanBan;
        this.noiDungVanBan = noiDungVanBan;
    }

    public String getTenVanBan() {
        return tenVanBan;
    }

    public void setTenVanBan(String tenVanBan) {
        this.tenVanBan = tenVanBan;
    }

    public String getNoiDungVanBan() {
        return noiDungVanBan;
    }

    public void setNoiDungVanBan(String noiDungVanBan) {
        this.noiDungVanBan = noiDungVanBan;
    }

    @Override
    public String toString() {
        return "VanBan{" +
                "tenVanBan='" + tenVanBan + '\'' +
                ", noiDungVanBan='" + noiDungVanBan + '\'' +
                '}';
    }
}
