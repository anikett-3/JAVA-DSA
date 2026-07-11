package set;

import java.util.HashSet;
import java.util.Set;

/* 
>  The HashSet class of the Java Collections framework provides the functionalities of the hash table data structure.
It implements the Set interface.

>syntax --> 
1. // HashSet with default capacity and load factor
HashSet<Integer> numbers1 = new HashSet<>();

2. // HashSet with 8 capacity and 0.75 load factor
HashSet<Integer> numbers = new HashSet<>(8, 0.75);

*/

// public class hashSet{
//     public static void main(){
//         Set <Integer> st = new HashSet<>();
//         st.add(10);
//         st.add(10);
//         st.add(10);
//         st.add(10);
//         st.add(20);
//         st.add(20);
//         st.add(10);
//         st.add(20);
//         st.add(30);
//         //we inserted 10 4 times , 20 3 times and 30 1 times --- now set preserved only unique item not duplicate one
//         System.out.println(st);


//     }


// }


public class hashSet{
    public static void main(){
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("set1- "+ set1);
        System.out.println("set-" +set2);
        // methods --> 

        // 1. retainAll() --> 
        //--> retains all the elements in the set that are  also present in another specified set.
        System.out.println("retain element of set1 and set2- (only common elements) ");
        set1.retainAll(set2);  // set1 ke andar set ke element save ho jaenge but whi jo sirf common ho.
        System.out.println("new set1 after retain or combine common element of both set- " +set1);

        //2. containAll() -->
        //-> returns true if the set contains all the elements of the specified collection.
        

        //->>>>  kya set1 ke andaer set2 ke sare element present hai., if yes return TRUE.
        System.out.println(set1.containsAll(set2)); 

        //->>>>  kya set2 ke andaer set1 ke sare element present hai., if yes return TRUE.
        System.out.println(set2.containsAll(set1)); 

    }


}