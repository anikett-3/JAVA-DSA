import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.*;
public class linkedListMethod {
    public static void main(String[] args) {
        // linkedList is a class which implements List interface and extends AbstractSequentialList class.
        // it is a doubly linked list implementation of the List and Deque interfaces.
        // // -->it provides a way to store the elements in a linear order. it allows the elements to be inserted or removed from both ends of the list.
        //  it is not synchronized. it is not thread-safe. it is not random access. it is not resizable. it is not sorted. it is not ordered. it is not unique. 
        // it is not immutable. it is not serializable. it is not cloneable. it is not comparable. it is not iterable. it is not collection. it is not map. 
        // it is not set. it is not queue. it is not stack. it is not priority queue. it is not deque. it is not list iterator. it is not iterator.
        
        /* 
        --> linkedList class provides the following methods:-
        1.add() :--> this method is used to add an element to the end of the list.
        2.addFirst() :--> this method is used to add an element to the beginning of the list.
        3.addLast() :--> this method is used to add an element to the end of the list.
        4.remove() :--> this method is used to remove an element from the list.
        5.removeFirst() :--> this method is used to remove the first element from the list.
        6.removeLast() :--> this method is used to remove the last element from the list.
        7.get() :--> this method is used to get an element from the list.
        8.getFirst() :--> this method is used to get the first element from the list.
        9.getLast() :--> this method is used to get the last element from the list.
        10.size() :--> this method is used to get the size of the list.
        11.clear() :--> this method is used to clear the list.
        12.contains() :--> this method is used to check whether an element exists in the list or not.
        13.indexOf() :--> this method is used to get the index of an element in the list.
        14.lastIndexOf() :--> this method is used to get the last index of an element in the list.
        15.isEmpty() :--> this method is used to check whether the list is empty or not.
        16.iterator() :--> this method is used to get an iterator for the list
        */

        // we can create a linkedList using the following syntax:-
        /* syntax-->
                        LinkedList <Integer> lst = new LinkedList<>();
         */

        // And we can USE almost all the methods which we have learnt in ArrayList and List interface.

        // HERE , ALL LIST INTERFACE METHODS ARE IMPLEMENTED IN LINKEDLIST CLASS. , WHICH WE USED ALSO IN ARRALIST CLASS. SO, WE CAN USE ALL THOSE METHODS IN LINKEDLIST CLASS ALSO.
        LinkedList <Integer> list = new LinkedList<>();
        //1. add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("first list" +list);

        list.add(40);
        System.out.println("appended list" +list);

        // 2. remove
        list.remove(2);   // yaha index dena hai.
        System.out.println("remove one element from list" +list);
        
        // Another new list 
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(90);
        list2.add(80);
        System.out.println("second list"+list2);

        //3. add all - means add 2 list
        list.addAll(list2);
        System.out.println("additoin of list1 and list2" +list);

        //4. removeAll
        list.removeAll(list2);// isme se sare list2 ke element hata do.
        System.out.println("removed all element of list2" + list);

        //5. size();
        System.out.println("size of list1- "+ list.size());

        //  6.clear()
        System.out.println("second list"+list2); // 1st prinnting list2 and thee we will clear al elemnt of list 2
        list2.clear();
        System.out.println("checking size of list2 after useing clear()--> "+list2.size());// checking size of list2 after useing clear()

        //7. ITRERATOR() --> it is a standard way given by collention  to traverse on any collestion instance or obeject.
        // --> suppose i want to travel on Arraylist then we need "ARRAYLIST ITERATOR-"
        // --> suppose i want to travel on LInkedlist then we need "lindedLIST ITERATOR-"
        // --> suppose i want to travel on stack then we need "stack ITERATOR-"
        // SO , sabhi ke specific itrator ko create karene ke hum is --> ITERATOT () function use lar sakte hai
    
        // now , i want to traverse list  using iterator--\

        Iterator <Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("element" + iterator.next());


        }

        // some remaining methods we gonna see here 
        // 1. --> .get()  ---> // kuch fetch karna by index 
        LinkedList <Integer> list3= new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println("new list- list3 --> "+ list3);
        System.out.println("geting / fetching value by get() method --> "+ list3.get(0));
        System.out.println("before set-->" +list3);

        
        // 2. --> set()  -->  'index, value" (dena padega) kidahr ko set karne ka hai.
        // set() method se ham kisi v "INDEX" par value set kar sakte hai,
        //  means waha pehle se jo value hai uski jaga pe ye new value set kar dega 
        list3.set(0,100);
        System.out.println("after set()-->" +list3);

        // 3. toArray() ---> Collection me jitni item store hai use -- ARRAY  me convert kardo means d.type chage karo do string to --> array.
        //#NOTE- COLLECTION me hma kisi v type(array,string,queue,stack,linkeslist,etc) ki value store kar sakte hai .
        // koi v collection ho - stack , queue,vector,sting --> agar hamne waha == " toArray " laga diya wo -- ARRAY me CONVERT ho jaega
          
        Object [] arr = list3.toArray();
        for(Object obj:arr){
            System.out.println(obj);

        }
        //4. contains() -- ye check karat hai ye particular value ye list contain karta hai ki nhi 
        // jo mai input de rha hai kya ye elemnt collection / data structure ke andar presnet hai ki nhi..
        System.out.println("kya 100 list3 ke andar present hai--> "+list3.contains(100));  // lya 100 list3 ke andar present hai 

        /*NOW -->
        SOME ARRAYLIST METHODS WE ARE GONNA USING IN LINKEDLIST   */

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(89);
        list4.add(12);
        list4.add(123);
        list4.add(90);
        list4.add(64);
        System.out.println("list before sorting" + list4);
        Collections.sort(list4); // this method is used to sort the list in ascending order.
        System.out.println("list after sorting" + list4);
        // or
        Collections.sort(list4,Collections.reverseOrder()); // this method is used to sort the list in descending order.
        System.out.println("list after sorting in descending order" + list4);

        // now reverse the list using reverse() method of Collections class.
        Collections.reverse(list4); // this method is used to reverse the list.
        System.out.println("list after reversing" + list4);

        
        // 2. isempty() :--> this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.
        System.out.println("is list empty? " + list4.isEmpty()); // this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.
        
         

        //3. indexOf() :--> this method is used to return the index of the first occurrence of the specified element in the list. if the element is not found, it returns -1.
        System.out.println("index of 90 in list is " + list4.indexOf(90));

        // 4. lastIndexOf() :--> this method is used to return the index of the last occurrence of the specified element in the list. if the element is not found, it returns -1.
        list4.add(90);
        System.out.println("last index of 90 in list is " + list4.lastIndexOf(90));

        // YEAH EVERYTHING WE HAVE LEARNT IN ARRAYLIST CLASS METHODS ARE ALSO IMPLEMENTED IN LINKEDLIST CLASS. 
        // EXCEPT ==> clone(), ensureCapacity() and trimToSize() methods are not implemented in LinkedList class. because linkedlist is a doubly linked list implementation of the List and Deque interfaces. it does not have a capacity. it can grow and shrink dynamically. so, these methods are not applicable to linkedlist class.
        
    }
}