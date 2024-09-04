package Tinh_ke_thua;

class hocsinh
{
    private String name;
    private String address;
    private double gpa;

    public hocsinh(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    @Override
	public String toString() {
		return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
	}
}
public class Object_trong_java {
    public static void main(String[] args) {
        hocsinh h = new hocsinh("Nam", "Thai Nguyen", 9.21);
        System.out.println(h.toString());
    }
}
