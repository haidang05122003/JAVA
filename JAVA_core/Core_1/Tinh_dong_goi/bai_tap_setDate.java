package Tinh_dong_goi;

class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(int day,int month, int year) {
        this.day =day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day, int month,int year) {
        this.day= day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    /*public void display() {
       System.out.println(day + "/" + month + "/" + year);
    }
    */
    public void display()
    {
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";

        if(day.length() == 1) {
            day = "0" + day;
        }
        if(month.length() == 1) {
            month = "0" + month;
        }
        System.out.println(day +"/" + month +"/" + year);
    }
}
public class bai_tap_setDate {
    public static void main(String[] args) {
        Date d = new Date(5,12,2003);
        d.display();
        d.setDate(11, 12, 2024);
        d.display();
        d.setMonth(3);
        d.display();
    }
}
