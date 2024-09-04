package Ngay_thang_nam;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) {
        this.day= d;
        this.month = m;
        this.year =y;
    }
    public void PrintDay() {
        System.out.println("Day: "+ this.day);
    }
    public void PrintMonth() {
        System.out.println("Month: "+ this.month);
    }
    public void PrintYear() {
        System.out.println("Year: "+ this.year);
    }
    public void PrintDate() {
        System.out.println("Date: "+ this.day+"/"+this.month+"/"+this.year);
    }

}
