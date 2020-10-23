package _11_stack_queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void printElement(Queue<?> objects) {
        while (!objects.isEmpty()) {
            System.out.println(objects.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> myQueue= new LinkedList<>();
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        printElement(myQueue);
        System.out.println("===========================");
    }
}
