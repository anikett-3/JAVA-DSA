package set;

import java.util.Set;
import java.util.TreeSet;



// -> A TreeSet is a collection in Java that stores unique elements and automatically sorts them.

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
            st.add(110);
            st.add(110); 
            st.add(15);
            st.add(5);
            st.add(10);
            st.add(20);
            st.add(20);
            st.add(30);
            System.out.println(st);  // --> [5, 10, 15, 20, 30, 110]  
            // tree ne automaticlly sort kar diya set ko
            

        }
    }
    

