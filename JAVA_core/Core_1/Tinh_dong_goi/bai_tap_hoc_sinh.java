package Tinh_dong_goi;

class HOCSINH1
{
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public HOCSINH1() {

    }
    public HOCSINH1(int id, String name, int age, String address, int score) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.setScore(score);
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setScore(int score) {
        if(score < 0){
            this.score = 0;
        }
        else if(score > 0){
            this.score = 10;
        }
        else
            this.score =score;
    }
    public int getScore() {
        return score;
    }
}
public class bai_tap_hoc_sinh 
{
    public static void main(String[] args) {
        HOCSINH1 s = new HOCSINH1(1001, "Trung", 21, "Ha noi",5);
        System.out.println("Id: "+ s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Address: "+s.getAddress());
        System.out.println("Score: "+s.getScore());
        s.setScore(-15);
        System.out.println("Score: "+s.getScore());
        s.setScore(15);
        System.out.println("Score: "+s.getScore());
    }
}
