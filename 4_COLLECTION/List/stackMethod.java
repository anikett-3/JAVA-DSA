import java.util.Collections;
import java.util.Stack;
public class stackMethod {

/* here we gonna learn "STACK"-
1. most of the methods are we used in ArraList , LinkedList , and Vector are also we used here except one or two
2. but all mehtods of parrent class like - LIST & COLLECTION are obviously wrok fine her.
  */




// Here are some common methods wwhich we also used in other list classes like in arryay, LL and vector -->

    public static void main(String[] args) {

        //   -- > THIS METHOD ARE FORM "LIST" 

        Stack <Integer> list = new Stack <>();
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
        Stack <Integer> list2 = new Stack <>();
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


        // some remaining methods we gonna see here 
        // 1. --> .get()  ---> // kuch fetch karna by index 
        Stack <Integer> list3= new Stack<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
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


       //-------------------------------------------------------------------------------------
        //   -- > THIS METHOD ARE FORM "ArrayLIST"--> 
        
        //1. sort the stack in ASCENDING ORDER.
        Collections.sort(list); // this method is used to sort the list in ascending order.
        System.out.println("list after sorting" + list);

        // 2. isempty() :--> this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.
        System.out.println("is list empty? " + list.isEmpty()); // this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.






// //-------------------------------------------------------------------------------------
        //   -- > THIS METHOD ARE FORM "LinkedLIST"--> 

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


        // 7.peek()    --> this method  also used to get the first element from the list. it returns the first element.
    
        System.out.println(" by only peek " + list.peek());



        //  -------------------------------------------------------------------
        //-----------------------------------------------------------------


// // //  NOW THESE ARE SOME --> 'SPECIFIC METHODS' USED FOR "STACK" --->

        Stack <Integer> st = new Stack<>();

        //1. push  -- > add element 1 by 1 in stack - ek ke pich ek
        st.push(10);
        System.out.println("after pushing 1st element- "+ st);
        st.push(20);
        System.out.println("after pushing 2nd element- "+ st);
        st.push(65);
        System.out.println("after pushing 3rd element- "+ st);
        st.push(50);
        System.out.println("after pushing 4th element- "+ st);

        /* 
        System.out.println(st); -- output --> [10, 20, 65, 50]  yaha 50 sabse last me insert hua hai to ye sabse TOP pe hoga imaign like ham plate rakh rahe hai 
        so - 50 sabse top hai ,then 65 then 20 then 100 if we gonna use pop then pop remove last inserted element/ ya jo sabse top par hai 
        */
        System.out.println("as we see how element are store in LIFO order");
 
        // 2. peek()  --> check / return /see - 1st value of stack
        System.out.println("see/return element using peek() - "+st.peek());

        // 3. search()  -->  search a particular value is it present or not.
        System.out.println("search 50 where is it - "+st.search(50));  
        System.out.println("search 100 in stack which is not present int it - "+st.search(100));  

        // 4. empty()--> check is the stack is empty or not.
        System.out.println("is stack is empty- "+st.empty()); 


        System.out.println("before using pop - "+ st);

        //5. pop() --> REMOVE THE "LAST" value that added in a  stak and return/print that removed value.
        st.pop();
        System.out.println("after using pop 1 time- "+ st);

        st.pop();
        System.out.println("after using pop 2nd time- "+ st);    




    }
}
