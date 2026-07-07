import java.util.ArrayList;
public class Array{
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
        
        ArrayList <Integer> list = new ArrayList<>();
        //1. add
        list.add(10);
        list.add(20);
        list.add(30);

    
    }


}
