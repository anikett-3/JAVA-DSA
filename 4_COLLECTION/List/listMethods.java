// import java.util.*;  // if ye likhenge to sab kam ho ek hi bar ho jaega.
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
public class listMethods{
    public static void main(String[] args) {
       /*// List or Collection --> is Interface
        // ArrayList --> Concrete class*/

        // ArrayList <Integer> arr  = new ArrayList<>();
        // List <Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        
        /*
        // tino(3) method se ham ek hi chij declare kar rhe hai. or tino VALID HAI --> 
        // 1. ham arraylist class ke through declare kar rahe hai   --> yaha implementaion arraylist type ka hai OR REFRENCE ArrayList type ka hai. 
        // 2. ham List interface ke through declare kar sakteh hai --> yaha implementaion arraylist type ka hai BUT  REFRENCE  LIST TYPE ka hai 
        // 3.ham root interface Collection ke through declare kar rha hai.--> yaha implementaion arraylist type ka hai BUT  REFRENCE COLLECTION type ka hai
        // IMPLEMENTATION HUM ALWAYS concrete CLASS ke according set karne wale hai
           */
        

        // we gona see some commont methods of given by root collecction-
        ArrayList <Integer> list = new ArrayList<>();
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
        ArrayList<Integer> list2 = new ArrayList<>();
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
        List <Integer> list3= new ArrayList<>();
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

    }


}
