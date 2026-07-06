public class BasicString {

    public static void main(String[] args) {
        // String FirstName = "babbar";
        // String LastName = new String("love");

        // System.out.println(FirstName + " "+ LastName);

        // // length of string -->
        // System.out.println(FirstName.length());

        // // printing each element of Firstname -->

        // System.out.println(FirstName.charAt(0));
        // System.out.println(FirstName.charAt(1));
        // System.out.println(FirstName.charAt(2));
        // System.out.println(FirstName.charAt(3));
        // System.out.println(FirstName.charAt(4));
        // System.out.println(FirstName.charAt(5));
     
        // // System.out.println(FirstName.charAt(6)); // here give EXCEPTION ERROR 



        // -- STRING IS IMMUTABLLE - WE CANNOT CHAANGE ELEMENT OF STRING
        //  BUT WE CAN DO REFRENCE SHIFTING

        // String name = "Rana";
        // // name[0] = "l";  // NOT POSSIBLE ❌❌🚫🚫  IMMUTABLE 
        // // name.setcharAt("j")   // NOT POSSIBLE ❌❌🚫🚫  IMMUTABLE 

        // // REFRENCE SHIFTING 
        // name = "aman";

        // System.out.println(name);   // output -- aman NOT  rana  it's not mutation -- it's "shifting value of str from rana to aman"




        ///// * comparing strings -- 1. {==} equal to ,, 2. dot {.equalS()} ,, 3. {.equalsIgnoreCase()}
        /// now we have 2 string we gonna compare it --
        
        String name1 = "Love";

        //  // compare each - name2 with name -- one by one ;
        String name2 = "Love";
        // String name2 = new String("Love");
        // String name2 = "love";

        // == 
        if (name1 == name2){   /// it's NOT COMPARE VALUE ; It compare - address of the value is -- SAME OR NOT
            System.out.println("Both strings are EQUAL");
        }
        else{
            System.out.println("Both string are  NOT EQUAL");
        }

        // .equals()
        if (name1.equals(name2)){   /// it compare actual value ; BUT it's a CASE-SENSITIVE 🚫
            System.out.println("Both strings are EQUAL");
        }
        else{
            System.out.println("Both string are  NOT EQUAL");
        }

        //  .equalsIgnoreCase()
        if (name1.equalsIgnoreCase(name2)){   /// it's NOT A CASE-SENSITIVE ; pro version of .equals ; it also compare ACTUAL values .
            System.out.println("Both strings are EQUAL");
        }
        else{
            System.out.println("Both string are  NOT EQUAL");
        }




























    }

    

    


    
}
