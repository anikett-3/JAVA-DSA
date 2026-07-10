package Queue;

/* priority Queue ->
1. It's NOT like a normal queue and , It "DOES NOT" FOLLOW -FiFO
2. it is slightly Different thAn normal queue --
--> in normal queue we know that - whenever we add element it store one after another ,
and wehenever we remove elemnent from queue it removed element the 1st element which store in queue --
and follow FIFO principle.
BUT BUT BUT--
IN PRIORITY QUEUE
1. It's DOESN't folloe FIFO ORDER -- > IT'S work on basis of -->"" PRIORITY "" 
Priority menas which - in case of <Integer> the ELEMENT WHICH HAS MINIMUM value it is in 1st /HIGH PRIORITY and follow on.
matlab - jiski priority jada hai /  Vvip person hai - uska kam pehle hoga  ;
or { priority sabse jada --> "sabse chote number /elemnt ki hoti hai " <iNTEGER> KE CASE ME" }
eg --[7,5,8,2,9]--> isme 2 ki priority sabse jada hai jab ham element fetch karenge.
  */

import java.util.PriorityQueue;
import java.util.Queue;
public class priorityQueue {
    public static void main(String[] args) {
        // DEFULT behaviour -> in case of  Integer -> less value -> High priority ---> and it's called -' MinHeap'
        // "minheap" --> it give high priority to less integer value among all 
        Queue <Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(50);
        pq.offer(4);
        pq.offer(100);
        pq.offer(6);

        // if we fetch element it print -- priority wise --> 
        // and jo sabse choota hai uski priority sabse jada hai. - g - "4"

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("again pop " + pq.poll());
        System.out.println(pq);


        // we used poll (which remove and ruturned removed value) and poll have to  remove first value which added in queue --
        // BUT BUT it removed -- 4 and return .because, it work on basis of priority and 4 has high priority than others.
        // and one more i thing i would like add look -- output of print (pq) -- all value in "ascending orders"

        // --------------------------------------------------------------------------------------------------------------
        
        // // // //  ye to ho gyi DEFALUT CASE KI baat--
        // NOW - ISKA ULTA KARTE HAI -- MEANS - high value interer element has to be HIGH PRIORITY .


        // - iske liye hame ek comparator ADD karna hoga  --> " (a,b)->b-a  " -- ye 
        // ye comparator hamre - minHeap ko --> MaxHeap me convert kar dega .
        //syntax -->
        //
        //  Queue <Integer> pq = new PriorityQueue<>((a,b)->b-a); //


        System.out.println("Priority queue from max value -->");
        Queue <Integer> pq1 = new PriorityQueue<>((a,b)->b-a);
        pq1.offer(40);
        pq1.offer(50);
        pq1.offer(4);
        pq1.offer(100);
        pq1.offer(6);

        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println("again pop " + pq1.poll());
        System.out.println(pq1);
    } 
    
}


// // IN CASE OF --> STRING / CUSTOM OPERATOR -->
// // // we have to write  specific code/ "COMPARATOR" FOR string and custom operator .


// again -- in default case of INTEGER -- priority is less integer value., 
// but if we want ki priority high inetger value ho to -->ham ek comparator use karte hai.