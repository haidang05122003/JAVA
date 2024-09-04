package My_date_OOP;

public class main {
    public static void main(String[]args) {
        Mydate md = new Mydate(31,1,1999);
        System.out.println("Day: " +md.getDay());
        md.setDay(32);
        System.out.println("Day: "+ md.getDay());
        md.setMonth(5);
        System.out.println("Month: "+ md.getMonth());
        md.setYear(0);
        System.out.println("Year: "+ md.getYear());
    }
}
