import java.util.LinkedList;

public class linkedListMethodTwo {
    public static void main(String[] args) {

        // on previous we have learnt about linkedList class and learned some methods which are collection and list interface .
        // AND we also use some ARRAYLIST methods
        //  now we will learn about some more specific methods of linkedList class. 
        // and it's also caled as "Deque" methods. because linkedList class implements Deque interface. and Deque interface extends Queue interface. and Queue interface extends Collection interface. so, linkedList class is a child class of Deque interface. and Deque interface is a child interface of Queue interface. and Queue interface is a child interface of Collection interface.
        // so, linkedList class is a child class of Deque interface

        /*
        1. addFirst() --> this method is used to add an element to the beginning of the list. it takes an element as a parameter and adds it to the beginning of the list. it returns void.
        2. addLast() --> this method is used to add an element to the end of the list. it takes an element as a parameter and adds it to the end of the list. it returns void.
        3. removeFirst() --> this method is used to remove the first element from the list. it returns the removed element. if the list is empty, it throws NoSuchElementException.
        4. removeLast() --> this method is used to remove the last element from the list. it returns the removed element. if the list is empty, it throws NoSuchElementException.
        5. getFirst() --> this method is used to get the first element from the list. it returns the first element. if the list is empty, it throws NoSuchElementException.
        6. getLast() --> this method is used to get the last element from the   list. it returns the last element. if the list is empty, it throws NoSuchElementException.
        7. offerFirst() --> this method is used to add an element to the beginning  of the list. it takes an element as a parameter and adds it to the beginning of the list. it returns true if the element is added successfully, otherwise it returns false.
        8. offerLast() --> this method is used to add an element to the end of the list. it takes an element as a parameter and adds it to the end of the list. it returns true if the element is added successfully, otherwise it returns false.
        9. pollFirst() --> this method is used to remove the first element from the list. it returns the removed element. if the list is empty, it returns null.
        10. pollLast() --> this method is used to remove the last element from the list. it returns the removed element. if the list is empty, it returns null.
        11. peekFirst() --> this method is used to get the first element from the list. it returns the first element. if the list is empty, it returns null.
        12. peekLast() --> this method is used to get the last element from the list. it returns the last element. if the list is empty, it returns null.
        13. push() --> this method is used to add an element to the beginning of the list. it takes an element as a parameter and adds it to the beginning of the list. it returns void.
        14. pop() --> this method is used to remove the first element from the list and returns the removed element. if the list is empty, it throws NoSuchElementException.
        15. removeFirstOccurrence() --> this method is used to remove the first occurrence of the specified element from the list. it takes an element as a parameter and removes the first occurrence of the specified element from the list. it returns true if the element is removed successfully, otherwise it returns false.
        16. removeLastOccurrence() --> this method is used to remove the last occurrence of the specified element from the list. it takes an element as a parameter and removes the last occurrence of the specified element from the list. it returns true if the element is removed successfully, otherwise it returns false.
        
        */
        LinkedList <Integer> list = new LinkedList<>();
        list.add(30);
        list.add(24);
        list.add(70);
        list.add(30);
        System.out.println("printing original list:"+list);

        // lastIndexOf()
        System.out.println("printing index of value 30--> " +list.lastIndexOf(30));

        // remove by index
        System.out.println("removing and return value at index 3--> "+ list.remove(3));

        // NOW

        //1. addFirst()  -->  used to add an element to the beginning of the list.
        list.addFirst(101);
        System.out.println("adding element at first index by - addFirst() in list -->"+ list);
        
        //2. addLast ()  --> used to add an element to the end of the list.
        list.addLast(134);
        System.out.println( "adding element in the list by -addlast()  -->"+list);

        // 3. removeFirst()    -->  used to remove an element from the beginning of the list.
        list.removeFirst();
        System.out.println("list after removing 1st element- "+list);

        // 4. removeLast ()  -->  used to remove an element from the end of the list.
        list.removeLast();
        System.out.println("list after removing 1st element- "+list);


        // 5. getFirst()   --> this method is used to get the first element from the list. it returns the first element.
        System.out.println("getting by getFirst method- "+list.getFirst());


        // 6. getLast()  --> this method  is  used to get the last element from the list. it returns the last element.
        System.out.println("getting by getLast method- "+list.getLast());

        // * " get(index) "  --> by this we get any value by index 
        System.out.println("getting value by get(index) method  -" + list.get(1));


        // 7. peekFirst()  OR peek()    --> this method  also used to get the first element from the list. it returns the first element.
        System.out.println(" by peekFirst method " + list.peekFirst());
        System.out.println(" by only peek " + list.peek());


        // 8. peeklast()   --> --> this method  also used to get the last element from the list. it returns the last element.
        System.out.println("peek last " + list.peekLast());
        


        // 9. pollFirst()     ---> this method is used to remove the first element from the list
        System.out.println("pollFirst " +list.pollFirst());
        System.out.println("by ony poll method " +list.poll());


        //10.PollLast()  --> this method is used to remove the last element from the list
        System.out.println("pollLast " +list.pollLast());

        //11. offeFirst()   --> this method is used to add an element to the beginning  of the list
        list.offerFirst(87);

        //11. offerLast () ---> this method is used to add an element to the end  of the list
        list.offerLast(899);
        System.out.println("after addding element by offerfirst()  & offerLast()  --> "+list);

        
        // *  offer() - onlly --> it default add an element to the end of the list.
        list.offer(34);
        System.out.println("after addding element by offer() only --> "+list);

        System.out.println(list);

        list.add(45);  // add 45 at in list 
        list.addLast(45);  // add 45 at lasts
        list.add(3,45);   // add 45 at index 3 

        list.add(23);
        list.add(2,23);

        //12. removeFirstOccurrence()  --> this method is used to remove the first occurrence of the specified element from the list.
        list.removeFirstOccurrence(23);



        //13. removeLastOccurrence() --> this method is used to remove the last occurrence of the specified element from the list.
        list.removeLastOccurrence(45);

        System.out.println(list);


        //14. push() --> this method is used to add an element to the beginning of the list.// yeah this is queue method but also work LL
        list.push(99);
        list.push(123);
        System.out.println("after pushing 2 element and before pop "+ list);

        //15. pop()  --> this method is used to remove the first element from the list and returns the removed element ..// yeah this is queue method but also work LL

        list.pop();
        System.out.println("after pop "+ list);

        list.offer(34);
        System.out.println(list);









    }

}

