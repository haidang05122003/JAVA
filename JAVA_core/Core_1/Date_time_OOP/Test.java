package Date_time_OOP;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        //ham lay thoi gian hien tai
        long time = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++ ) {
            System.out.println("TEST");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Truoc khi chay for: "+ time);
        System.out.println("Sau khi chay for: " + time2);
        System.out.println("Thoi gian: " + ((time2 - time))+" mls");
        System.out.println("Thoi gian: " + ((time2 - time)/1000)+"s");

        //TimeUnil
        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365)+" s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25)+" s");
        System.out.println("25min = " + TimeUnit.MINUTES.toSeconds(25)+" s");

        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate() +"/"+ (d.getMonth()+1) +"/"+ (d.getYear()+1900));

        //Calender
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.YEAR)));

        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.YEAR)));

        c.add(Calendar.DATE, 30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.YEAR)));

        //DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    }
}
