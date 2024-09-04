package equals_hascode_OOP;

import java.util.Objects;

public class Mydate1 {
    private int day;
    private int month;
    private int year;

    public Mydate1 (int day, int month, int year) {
        if(day>=1 && day<=31) {
            this.day = day;
        }else {
            this.day = 1;
        }
        if(month>=1 && month<=12) {
            this.month = month;
        }else {
            this.month = 1;
        }
        if(year>=0) {
            this.year = year;
        }else {
            this.day = year;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if(day>=1 && day<=31)
        {
            this.day = day;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12)
        {
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year>=1) {
            this.year = year;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mydate1 mydate1 = (Mydate1) o;
        return getDay() == mydate1.getDay() && getMonth() == mydate1.getMonth() && getYear() == mydate1.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    @Override
    public String toString() {
        return "Mydate1{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
