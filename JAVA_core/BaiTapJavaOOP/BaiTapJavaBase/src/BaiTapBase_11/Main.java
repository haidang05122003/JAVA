package BaiTapBase_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int tb = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i< 50; i++ ){
            if(i % 2 != 0){
                sum += i;
                count++;
                tb = sum / count;
            }
        }
        System.out.println(sum);
        System.out.println(tb);
    }
}
