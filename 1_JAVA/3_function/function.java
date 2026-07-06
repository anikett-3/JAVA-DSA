// syntax -->

// public class function{
//     public static void main(String args[]){
//         // # body 
//         // work 1
//         System.out.println("Hello world!");
        
//                 // work 3
//         System.out.println("Hello world!");
        
//                 // work 3
//         System.out.println("Hello world!");
//     }
// }




// ek hi kam ko ham bar bar kar rehe hai isiliye ham function likhenege 
// HELLLO PRNINT KARWANE KE LIYE;

// public class function{
//     public static void printHelloWorld(){
//         System.out.println("Hello world");
//         System.out.println("Hello world 2");
//         System.out.println("Hello world 3");
//         System.out.println("Hello world 4");
//     }// wrire function once and call it whenever nedd ,, everthing write under aboove function print in ONE COMMAND-->
    
//     public static void main(String args[]){
//         printHelloWorld();
//     }
// }

// NOTE--> IF FUNCTION IS 'INT' THEN ADD {RETURN TYPE} AT LAST  






/*
 # SYNTAX WITH PARAMETER --(input)

returnType name(type parameter1 , type paramete 2){   
    // body 
    rerurn statement;
    
}

*/

// import java.util.*;
// public class function{
    
//     public static void calculateSum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         int sum = a+b ;
//         System.out.print("sum is :" +sum);
//     }
    
//     public static void main(String args[]){
//         calculateSum();
        
//     }
// }


//  NOW --> same code but see diffenrent-->


// import java.util.*;
// public class function{
    
//     public static void calculateSum(int num1, int num2){    // function ke andar ke input ko parameter kahte hai

//         int sum = num1 +num2  ;
//         System.out.print("sum is :" +sum);
//     }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         calculateSum(a,b);
        
//     }
// }

// NOW AGAIN Same code but slightly diffenent  -- chages --> return type ,more


// import java.util.*;
// public class function{
//                                                             // function defination
//     public static int calculateSum(int num1, int num2){    // function ke andar ke input ko=> parameter kahte hai or formal pa paameyteri

//         int sum = num1 +num2  ;
//         return sum;
        
//     }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();           // function call
//         int sum = calculateSum(a,b);     // a,b = argument , actual parameter/values  ( jise call karte hai)
//         System.out.print("sum is :" +sum);
        
//     }
// }







//Q.1.. PRINT GIVEN NAME BY FUNCTION;

// import java.util.*;
// public class function{
    
    
//     // FUNCTION--
//     public static void PrintName(String name){
//         System.out.print(name);
//         return;
//     }
    
    
    
    
//     // MAIN FUNCTION--
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String NAAM = sc.nextLine();
        
        
//         PrintName(NAAM);
        
        
//     }
// }











//Q2.. MAKE FUNCTION TO ADD 2 NUMBER AND RETURN THEIR SUM


// import java.util.*;
// public class function{
    
    
//     // FUNCTION--
//     public static int CalculateSum(int a, int b){
//         int sum = a+b;
        
//         return sum ;
//     }
    
    
    
    
//     // MAIN FUNCTION--
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int NUM1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int NUM2 = sc.nextInt();
        
//         int sum = CalculateSum(NUM1 , NUM2);
        
//         System.out.println("The sum of given two numbers is :"+ sum);
//     }
// }





//Q3..  MAKE FUNCTION TO MULTIPLY 2 NUMBER AND RETURN THEIR PRODUCT;


// import java.util.*;
// public class function{
    
//     public static int CalculateProduct(int a , int b){
//         return a*b;
//     }
    
//     public static void main(String args []){
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int NUM1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int NUM2 = sc.nextInt();
        
//         System.out.println("The product  of given two numbers is : "+ CalculateProduct(NUM1, NUM2));
//     }
    
// }



// Q. 4... FIND FACTORAL NUMBER;



// import java.util.*;
// public class function{
//     public static void PrintFactorial(int num){
//         if (num <= 0){
//             System.out.println("Inalid input: ");
//             return;
//         }
        
//         int Factorial = 1;
//         for(int i = num ; i>= 1; i--){
//             Factorial = Factorial *i;
//         }
//         System.out.println(Factorial);
//         return;
//     }
    
//     public static void main(String args []){
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int N = sc.nextInt();
        
//         // System.out.println("The Factorial of a given numbers is : "+ PrintFactorial(N));
        
//        PrintFactorial(N)
        
//     }
    
// }










// import java.util.*;

// public class function {

//     // Method to calculate factorial and return the result
//     public static int calculateFactorial(int num){
//         if (num < 0) {
//             return -1; // used to signal invalid input
//         }
//         int factorial = 1;
//         for (int i = num; i >= 1; i--) {
//             factorial = factorial * i;
//         }
//         return factorial;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int N = sc.nextInt();

//         int result = calculateFactorial(N);

//         if (result == -1) {
//             System.out.println("Invalid input! Factorial is not defined for negative numbers.");
//         } else {
//             System.out.println("The factorial of " + N + " is: " + result);
//         }
//         sc.close();
//     }
// }






//Q.1.. PRINT GIVEN NAME BY FUNCTION;

// import java.util.*;
// public class function{
    
    
//     // FUNCTION--
//     public static void PrintName(String name){
//         System.out.print(name);
//         return;
//     }
    
    
    
    
//     // MAIN FUNCTION--
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String NAAM = sc.nextLine();
        
        
//         PrintName(NAAM);
        
        
//     }
// }





//Q2.. MAKE FUNCTION TO ADD 2 NUMBER AND RETURN THEIR SUM


// import java.util.*;
// public class function{
    
    
//     // FUNCTION--
//     public static int CalculateSum(int a, int b){
//         int sum = a+b;
        
//         return sum ;
//     }
    
    
    
    
//     // MAIN FUNCTION--
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int NUM1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int NUM2 = sc.nextInt();
        
//         int sum = CalculateSum(NUM1 , NUM2);
        
//         System.out.println("The sum of given two numbers is :"+ sum);
//     }
// }





//Q3..  MAKE FUNCTION TO MULTIPLY 2 NUMBER AND RETURN THEIR PRODUCT;


// import java.util.*;
// public class function{
    
//     public static int CalculateProduct(int a , int b){
//         return a*b;
//     }
    
//     public static void main(String args []){
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int NUM1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int NUM2 = sc.nextInt();
        
//         System.out.println("The product  of given two numbers is : "+ CalculateProduct(NUM1, NUM2));
//     }
    
// }



// Q. 4... FIND FACTORAL NUMBER;



// import java.util.*;
// public class function{
//     public static void PrintFactorial(int num){
//         if (num <= 0){
//             System.out.println("Inalid input: ");
//             return;
//         }
        
//         int Factorial = 1;
//         for(int i = num ; i>= 1; i--){
//             Factorial = Factorial *i;
//         }
//         System.out.println(Factorial);
//         return;
//     }
    
//     public static void main(String args []){
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int N = sc.nextInt();
        
//         // System.out.println("The Factorial of a given numbers is : "+ PrintFactorial(N));
        
//        PrintFactorial(N)
        
//     }
    
// }










// import java.util.*;

// public class function {

//     // Method to calculate factorial and return the result
//     public static int calculateFactorial(int num){
//         if (num < 0) {
//             return -1; // used to signal invalid input
//         }
//         int factorial = 1;
//         for (int i = num; i >= 1; i--) {
//             factorial = factorial * i;
//         }
//         return factorial;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int N = sc.nextInt();

//         int result = calculateFactorial(N);

//         if (result == -1) {
//             System.out.println("Invalid input! Factorial is not defined for negative numbers.");
//         } else {
//             System.out.println("The factorial of " + N + " is: " + result);
//         }
//         sc.close();
//     }
// }


