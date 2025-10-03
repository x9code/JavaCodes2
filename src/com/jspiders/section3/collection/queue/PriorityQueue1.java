package com.jspiders.section3.collection.queue;
import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(30);
        pq1.add(60);
        pq1.add(20);
        pq1.add(40);
        pq1.add(50);

        for(Integer e : pq1){
            System.out.println(e);//not sorted
        }

        System.out.println("-------------");

        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());//sorted due to poll()
        }
    }
}
