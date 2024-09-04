package hang_doi_Queue_Deque_OOP;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> danhSach = new LinkedList<String>();
        danhSach.offer("DANHSACH");
        danhSach.offer("Hoanghaidang");
        danhSach.offer("NguyenVanA");
        danhSach.offer("HoangThiT");
        while (true) {
            String ten = danhSach.poll(); ///peek ==> lay ra nhung khong xoa,  pol==> lay ra va xoa
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
