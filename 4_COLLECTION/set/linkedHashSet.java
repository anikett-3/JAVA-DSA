package set;

import java.util.LinkedHashSet;
import java.util.Set;

/* A LinkedHashSet is a collection in Java that stores unique elements (no duplicates) and also maintains the order in which elements were inserted. */
public class linkedHashSet {
    public static void main(String[] args) {

        Set <Integer> st = new LinkedHashSet<>();
        st.add(110);
        st.add(90); 
        st.add(10);
        st.add(10);
        st.add(25);
        st.add(20);
        st.add(20);
        st.add(30);

        System.out.println(st);  // --> [110, 90, 10, 25 20, 30] --> here ordered is preserved - 
        //                   // - means - jaisa hamne insert kiya tha waisa hi print hua hai. 
    }
}


    

