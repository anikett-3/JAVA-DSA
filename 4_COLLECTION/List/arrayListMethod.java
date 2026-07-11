
import java.util.*;
public class arrayListMethod {
    // as we know we already learned various methods regarding collection and list.
    // now some new methods other than which we have learnt for ArrayList particularly.
    /*including--
    1. sort(), 2.   */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(12);
        list.add(123);
        list.add(90);
        list.add(64);
        System.out.println("list before sorting" + list);
        Collections.sort(list); // this method is used to sort the list in ascending order.
        System.out.println("list after sorting" + list);
        // or
        Collections.sort(list,Collections.reverseOrder()); // this method is used to sort the list in descending order.
        System.out.println("list after sorting in descending order" + list);

        // now reverse the list using reverse() method of Collections class.
        Collections.reverse(list); // this method is used to reverse the list.
        System.out.println("list after reversing" + list);

        //2. clone()  :-->
        // cloning the list using clone() method of ArrayList class.
        // and clone() method is used to create a copy of the list. it returns an object of type Object. so we need to typecast it to ArrayList.
        ArrayList <Integer> newlist = (ArrayList<Integer>)list.clone();
        System.out.println("cloned list" + newlist);

        //3.-- > ensureCapacity() :--> this method is used to ensure that the list has enough capacity to hold the specified number of elements. if the current capacity is less than the specified capacity, then the capacity is increased to the specified capacity.
        list.ensureCapacity(10); // this method is used to ensure that the list has enough capacity to hold 10 elements.
        System.out.println("list after ensuring capacity" + list);
        System.out.println("Size of list after ensuring capacity"+ list.size());

        // another example using -- marks -

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // this method is used to ensure that the list has enough capacity to hold 100 elements.
        System.out.println("marks list after ensuring capacity" + marks);
        System.out.println("size of marks list after ensuring capacity: " + marks.size()); // this method is used to get the size of the list.
        
        // 4. isempty() :--> this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.
        System.out.println("is list empty? " + list.isEmpty()); // this method is used to check whether the list is empty or not. it returns true if the list is empty, otherwise it returns false.
        System.out.println("is marks list empty? " + marks.isEmpty()); 
         
        
        // 5. trimToSize() :--> this method is used to trim the capacity of the list to the current size of the list. it reduces the storage of the list to the current size of the list.
        list.trimToSize(); 
        System.out.println("list after trimming size" + list);
        System.out.println("size of list after trimming: " + list.size());

        //6. indexOf() :--> this method is used to return the index of the first occurrence of the specified element in the list. if the element is not found, it returns -1.
        System.out.println("index of 90 in list is " + list.indexOf(90));
        
        // 7. lastIndexOf() :--> this method is used to return the index of the last occurrence of the specified element in the list. if the element is not found, it returns -1.
        list.add(90);   
        System.out.println("last index of 90 in list is " + list.lastIndexOf(90));
    }
}
 