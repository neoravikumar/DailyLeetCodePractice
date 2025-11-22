package com.ravi.java.queue;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    static void main() {

        List<Integer> myList = List.of(4,5,6);
        int k = 2;
        PriorityQueue<Integer> myPQ = new PriorityQueue<>();
        for(Integer a : myList){
            myPQ.add(a);
        }

        for(Integer q : myPQ){
            System.out.println(q);
        }
        for(int i=0;i<myList.size()-k;i++){
            myPQ.poll();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : myList) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println("4thLargestElement is:"+myPQ.peek());
        System.out.println("4thLargestElement is:"+minHeap.peek());


    }
}
