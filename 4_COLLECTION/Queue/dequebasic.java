package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class dequebasic {
    public static void main(String[] args) {

        // // //  WE ALSO USE --> "DEQUE" WITH LINKEDLIST-->

        /// so now we can use here -- offer-First/last , peekFirst/Last,etc.. 
        Deque<Integer> q1 = new LinkedList<>();
        q1.offerFirst(10);
        q1.offerLast(20);
        q1.offerFirst(90);
        System.out.println(q1);
        System.out.println("removing last element- "+ q1.pollLast());
        System.out.println(q1);
        System.out.println("peeking first element - " + q1.peekFirst());


        // ArrayDeque with DEQUE.
        // //  JO V  DEQUE KE METHOD HAMNE LINKED LIST KE SATH USE KYA WO HAM ARRAYDEQUE KE SATH V AKR SAKTHE HAI--
        System.out.println("now output from ArrayQeque");
        Deque <Integer> q = new ArrayDeque<>();
        q.offerFirst(10);
        q.offerFirst(20);
        q.offerLast(90);
        System.out.println(q);
        System.out.println("removing first element- "+ q.pollFirst());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println("peeking last element - " + q.peekLast());


        // //  JO V  DEQUE KE METHOD HAMNE LINKED LIST  ARRAY KE SATH USE KYA WO HAM  " STACK " KE SATH V AKR SAKTHE HAI--
        // stack operation -- push(), pop()
        // stact with Dequeue
        System.out.println("now output from stack");
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(109);
        stack.push(208);
        stack.push( 632);
        System.out.println(stack);
        stack.pop();
        
        stack.peek();
        System.out.println(stack);
    }
    
}
