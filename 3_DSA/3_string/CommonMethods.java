public class CommonMethods {
    public static void main(String[] args) {
        // // // 1. -->  .length()   → Returns the number of characters.
        // // // 2. -->  .charAt(index) → Returns the character at the specified index.
        // // // 3. -->  .equals(Object 0bj) → Compares the contents of two strings (case-sensitive).
        // // // 4. -->  .equalsIgnoreCase(String s) → Compares two strings while ignoring letter case.


        // String str1 = "aman";
        
        // System.out.println(str1.length());
        // System.out.println(str1.charAt(1));

        // String str2 = "AMAN";
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2));


        // // // 5. --> .isEmpty() -> length = 0 ; Returns true if the string length is 0.
        // // // 6. --> .isBlank() -> only spaces ;Returns true if the string is empty or contains only whitespace (spaces, tabs, newlines, etc.).

        // String s1 = "";
        // String s2 = " ";
        // String s3 = "   ";
        // String s4 = "\t\n";
        // String s5 = "Aman";

        // System.out.println(s1.isEmpty()); // true
        // System.out.println(s1.isBlank()); // true

        // System.out.println(s2.isEmpty()); // false
        // System.out.println(s2.isBlank()); // true

        // System.out.println(s3.isEmpty()); // false
        // System.out.println(s3.isBlank()); // true

        // System.out.println(s4.isEmpty()); // false
        // System.out.println(s4.isBlank()); // true

        // System.out.println(s5.isEmpty()); // false
        // System.out.println(s5.isBlank()); // false



        // // // 7. trim() --> it removes leading and trailing whitespace from a string.
        // remove whitespace from front and back of strings -

        // String name = "    Aman     ";
        // System.out.println(name.length());  // 13
        // name = name.trim();  // we save in another variable because we can not direct print because it function is return.
        // System.out.println(name.length());   //4


        // // // 8. --> .toUpperCase() → Converts all characters in the string to uppercase.
        // // // 9. --> .toLowerCase() → Converts all characters in the string to lowercase.

        
        // String s2 = "JaVa ProGRAmminG";
        // System.out.println(s2.toUpperCase());
        // System.out.println(s2.toLowerCase());


        // // // 10. --> .substring() -> Returns a part/ sppecified part of the string.
        // // // .substring(beginIndex) → Returns the substring from the given index to the end.
        // // // .substring(beginIndex, endIndexbeginIndex)  → Starting index (included) ,, endIndex → Ending index (excluded).

        // String str1 = "Programming";
 
        // System.out.println(str1.substring(3));   // gramming
        // System.out.println(str1.substring(3, 7));  // gram
        
        /*  P  r  o  g  r  a  m  m  i  n  g
            0  1  2  3  4  5  6  7  8  9 10  */

        
        // // // 11. --> .contains() ->   Checks whether a string contains a specific sequence of characters.

        /* string.contains("text");--> return -
            true → if the text is found.
            false → otherwise. */

        // String str3 = "Java Programming";

        // System.out.println(str3.contains("Java"));
        // System.out.println(str3.contains("Program"));
        // System.out.println(str3.contains("Python"));
                   
        // // // 12.--> .valuOf(any type) --> it convert other datatypes into string-->

        // int num = 2342;
        // String str = String.valueOf(num);
        // System.out.println((num +1)); // 2342 +1 = 2343 because its int
        // System.out.println(str+1);  //  2342 + 1 = 23421 becaue its string

        // // // 13. --> .startsWith(String prefix) --> it checks is String/words --> STARTS with this particular prefix(word/char/string) or not. and it return Boolean value --> 

         



    }
    
}
