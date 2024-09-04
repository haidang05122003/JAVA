package equals_hascode_OOP;

import My_date_OOP.Mydate;

public class test {
    public static void main(String[] args) {
        Mydate1 md1 = new Mydate1(14, 5, 1999);
        Mydate1 md2 = new Mydate1(1, 5, 2003);
        Mydate1 md3 = new Mydate1(14, 5, 1999);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

        /* int a = 5;
        int b = 6;
        if(a == b) {
            System.out.println("a == b");
        }else {
            System.out.println("a != b");
        }
         */
       /* if (md2 == md3) {
            System.out.println("md2 == md3");
        } else {
            System.out.println("md2 != md3 ");
        }
        */
        System.out.println("md1 so sanh bang md2: " +md1.equals(md2));
        System.out.println("md1 so sanh bang md3: " +md1.equals(md3));
        System.out.println("Hascode md1 " + md1.hashCode());
        System.out.println("Hascode md2 " + md2.hashCode());
        System.out.println("Hascode md3 " + md3.hashCode());


    }
}
