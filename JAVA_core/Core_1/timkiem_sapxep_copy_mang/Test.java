package timkiem_sapxep_copy_mang;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static int[] reverse (int[] x) {
        int[] rs = new int[x.length];
        int index = 0;
        for(int i = x.length - 1; i >= 0; i--) {
            rs[index]=x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args) {
        int [] a = new int []{1,8,2,5,6,8,9,10};
        int [] b = new int [15];

        System.out.println("a ban dau: "+Arrays.toString(a));
        //ham sap xep tang dan
        Arrays.sort(a);
        System.out.println("a sau khi sap xep: "+Arrays.toString(a));

        //ham tim kiem mang da sap xep tang dan
        System.out.println(Arrays.binarySearch( a,10));
        System.out.println(Arrays.binarySearch(a,-1));

        System.out.println();

        //ham dien gia tri
        Arrays.fill(b, 5);
        System.out.println("B sau khi dien gia tri: "+Arrays.toString(b));

        System.out.println();

        //ham sap xep giam dan
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sau khi sap xep: "+ Arrays.toString(a));


    }
}
