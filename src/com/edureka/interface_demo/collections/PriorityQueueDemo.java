package com.edureka.interface_demo.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>(new ReverseSort());
        integers.add(345);
        integers.add(23);
        integers.add(12);
        integers.add(35);


        Integer poll1 = integers.poll();
        Integer poll2 = integers.poll();
        Integer poll3 = integers.poll();
        Integer poll4 = integers.poll();
        System.out.println("poll1 "+poll1);
        System.out.println("poll2 "+poll2);
        System.out.println("poll3 "+poll3);
        System.out.println("poll4 "+poll4);
    }
}

class ReverseSort implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
