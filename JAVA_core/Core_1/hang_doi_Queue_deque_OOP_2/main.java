package hang_doi_Queue_deque_OOP_2;


import java.util.ArrayDeque;
import java.util.Deque;

public class main {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<String>();
        danhSach.offer("THTV 1");
        danhSach.offer("Hoang Thi B");
        danhSach.offer("Nguyen Van A");
        danhSach.offer("Hoang Hai Dang");
        danhSach.offerLast("THTV 4");
        danhSach.offerFirst("THTV 0");

        while(true) {
            String ten = danhSach.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}

