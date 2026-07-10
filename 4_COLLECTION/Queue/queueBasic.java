package Queue;


// // //  we can create a Single ended queue wiht linked list , arrayDeque and stack-- it possible 
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class queueBasic {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(90);
        System.out.println(q);
        System.out.println("removing"+ q.poll());
        System.out.println(q);
        System.out.println("peeking" + q.peek());

        // //  Single ended Queue with --> "ARRAYDEQUE"--
        Queue <Integer> q2 = new ArrayDeque<>();
        q2.offer(108);
        q2.offer(205);
        q2.offer(906);
        System.out.println(q2);
        System.out.println("removing"+ q2.poll());
        System.out.println(q2);
        System.out.println("peeking" + q2.peek());

        // //  Single ended Queue with --> "ARRAYDEQUE"--




} 
    
}
