package Hang_doi_Queue_Deque_OOP_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queue<String> q = new PriorityQueue<String>();
        q.offer("TITV 1");
        q.offer("Hoang Thi B");
        q.offer("Nguyen Van A");
        q.offer("Hoang Hai Dang");
        while (true) {
            String ten = q.poll(); ///peek ==> lay ra nhung khong xoa,  pol==> lay ra va xoa
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
