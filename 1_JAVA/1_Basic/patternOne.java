// public class patternOne{
//     public static void main(String args[]){
//         System.out.println("****");
//         System.out.println("****");
//         System.out.println("****");
//         System.out.println("****");
        
//     }
// }




// public class patternOne{
//     public static void main(String args[]){
//         String name = "Tony kakar";
//         int age = 14;
//         double price = 35.5555;
//         int bag  = 6;
        
//         System.out.println(name);
//     }
// }



// public class patternOne{
//     public static void main(String args[]){
//     int a = 10;
//     int b =34;
    
//     int sum = a+b;
//     System.out.println(sum);
    
//     }
// }



// import java.util.*;
// public class patternOne{
//     public static void main(String args []){
    
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
        
    
//     }
// }


// import java.util.*;
// public class patternOne{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }





// Q.1--> check Number is Even or Odd:

// import java.util.*;
// public class patternOne{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         if (num %2 == 0){
//             System.out.println(num+" is an Even number:");
        
//         }
//         else{
//             System.out.println(num+ " is an odd number:");
//         }
//     }
// }



// Q.2 chek greatest among 2 no.

// import java.util.*;
// public class patternOne{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         if (a == b){
//             System.out.println("Both"+a + b+ " are equal:");
            
//         }
//         else if( a > b){
//             System.out.println(a + " is greater than " +b);
            
//         }
//         else{
//             System.out.println(b +" is greate than "+a);
//         }
//     }
// }





//Q.3 use Switch case:-- 3 button -- 1.denote hello ; 2. denote namaste; 3. denote bonjur:


// import java.util.*;
// public class patternOne{
//     public static void main(String args[]){
    
//         System.out.println("Enter a number between 1 to 3: ");
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
        
//         switch(button){
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("Namaste");
//                 break;
//             case 3:
//                 System.out.println("Bonjour");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
// }








//Q.4 print hello 10 times;

// public class patternOne{
//     public static void main(String args[]){
//         for(int i = 0; i <=10; i++){
//             System.out.println("hello");
//         }
//     }
// }



// Q.5 print the sum of 1st N natural number:


// import java.util.*;
// public class patternOne{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum =0;
        
//         for(int i = 1 ; i <= num; i++ ){
//             sum = sum +i;
//             System.out.print(sum);
//         }
//     }
// }






// import java.util.*;

// public class patternOne {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read the input number
//         int num = sc.nextInt();
//         int sum = 0;

//         // Loop through numbers 0 to num and calculate the cumulative sum
//         for (int i = 1; i <= num; i++) {
//             sum += i;  // Add i to sum
//             System.out.println("Sum after adding " + i + ": " + sum); // Display sum at each step
//         }
//     }
// }







//Q. 6 --> PATTERN-->

// 1. SOLID RECTANGLE;

// public class patternOne{
//     public static void main(String args[]){
        
//         int n = 4;
//         int m = 5;
        
//         for(int i = 1; i<=n;i++ ){
//             for(int j =1; j<=m; j++){
//                 System.out.print("*");
//             }
            
//             System.out.println(" ");
//         }
        
//     }
// }




//2. HOLLOW RECTANGLE;

// public class patternOne{
//     public static void main(String args[]){
//         int n = 4;
//         int m = 5;
        
//         for (int i =1 ; i <=n; i++){
//             for(int j = 1; j<= m; j++){
//                 if(i == 1 || j ==1|| i ==n || j==m){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
            
//             System.out.println(" ");
//         }
//     }
// }







//3. E print

// public class patternOne{
//     public static void main(String args[]){
//         int n = 5;
//         int m = 5;
        
//         for (int i =1 ; i <=n; i++){
//             for(int j = 1; j<= m; j++){
//                 if(i == 1||i ==3|| j ==1|| i == n){ 
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
            
//             System.out.println(" ");
//         }
//     }
// }


/*
1. i ==1 ( 1st line total star)--(****)
2. j == 1 (2nd line ,3rd line ,etc - 1st star ) --(*)
3. j == m ( 2nd line , 3rd line ,etc -- last star)          ( isme use nhi kiye hai)
4. i ==n ( last line total star. )-- (****)
5. i == 3( 3rd line total star) -- (****)
*/




// 4. HALF PYRAMID;





// Q..10 BUTTERFLY PATTERN

// public class patternOne{
//     public static void main(String args []){
//         int n = 4;
        
//         // UPPER PART/HALF
//         for(int i = 1; i<=n; i++){
            
//             // 1ST PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // SPACE 
//             int space =2*(n-i);        // ALL SPACEs ARE MULTIPLE OF 2 IN PATTERN
//             for (int s=1; s<=space; s++){
//                 System.out.print(" ");
//             }
            
//             // 2ND HALF
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // NEXT LINE
//             System.out.println();
//         }
        
        
        
//         // LOWER PART/HALF
//         for(int i = n; i>=1; i--){
            
//             // 1ST PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // SPACEs
//             int space =2*(n-i);                 // ALL SPACEs ARE MULTIPLE OF 2 IN PATTERN
//             for (int s=1; s<=space; s++){
//                 System.out.print(" ");
//             }
            
//               // 2ND HALF
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // NEXT LINE
//             System.out.println();
//         }
       
        
//     }
    
// }









//Q. 13  ---    PALINDROMIC PYRAMID NUMBER



// public class patternOne{
//     public static void main(String args[]){
//         int n =5;
//         for (int i =1; i<=n; i++){
//             // SPACES
//             for(int s=1; s<=(n-i); s++){
//                 System.out.print(" ");
//             }
            
//             // 1ST HALF
//             for(int k = i ; k>=1; j--){
//                 System.out.print(k);
//             }
            
            
//             // 2ND HALF
//             for(int j =2; j<=i;k++){     
//                 System.out.print(j);     
//             }
            
//             // NEXT LINE
//             System.out.println();
//         }
//     }
// }




/// SLIGHTLY DIFFERNECE BETWEN BOTH CODE ABPVE AND LOWER;     ONE RUN (k=i-->1)& (j= 2-->i) OR    2nd RUN (k=i-->2)& (j= 1-->i



// public class patternOne{
//     public static void main(String args[]){
//         int n = 5;
        
//         for(int i = 1; i<=n; i++){
//             for(int s = 1; s <=(n-i); s++){
//                 System.out.print(" ");       // SAPCE
//             }
            
//             // 1ST HALF
//             for(int k = i; k>=2; k--){
//                 System.out.print(k);
//             }
            
            
//             // 2ND HALF
//             for(int j = 1 ; j<=i; j++){
//                 System.out.print(j);
//             }
            
            
//             // NEXT LINE
//             System.out.println();
//         }
//     }
// }








// Q.-- DIAMOND STAR PATTERN


// public class patternOne{
//     public static void main(String aargs[]){
//         int n =4;
        
//         // UPPPER HALF
//         for (int i =1; i<=4; i++){
            
//             //SPACES
//             for(int s=1; s<=(n-i); s++){
//                 System.out.print(" ");
//             }
            
//             for(int j= 1; j<=(2*i-1);j++){   // (2*i-1) because [when (i=1; star ==1 ; means (2*1-1 == 1*)); ] similarly --
//                 System.out.print("*");      // [when (i=2; star ==3 ; means (2*2-1 == 3*)); ]  yeah we got point
//             }
            
//             System.out.println("");
            
//         }
        
//         // LOWER HA              //  1st me make upper half and we flip it by slighty code [means we do ( i = n--> 1; i--)]
        
//         for (int i =n; i>=1; i--){
            
//             //SPACES
//             for(int s=1; s<=(n-i); s++){
//                 System.out.print(" ");
//             }
            
//             for(int j= 1; j<=(2*i-1);j++){
//                 System.out.print("*");
//             }
            
//             System.out.println("");
            
//         }
//     }
// }





//Q. HOLLOW RHOMBUS------HW

// public class patternOne{
//     public static void main(String args []){
//         int n =5;
//         for(int i =1; i<=n; i++){
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
            
//             for (int k = 1; k<= n; k++){
//                 if(i==1|| i == n|| k==1|| k==n){
//                 System.out.print("*");
//                 }
                
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// Q.. INVERTED HALF PYRAMID NUMBER 


// public class patternOne{
//     public static void main(String args[]){
//         int n = 5;
//         for(int i = 1; i<= n; i++){
//             for(int j =1 ; j<=(n-i) ; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }



// Q. HALF PYRAMID NUMBER 


// public class patternOne{
//     public static void main(String args []){
//         int n =5;
        
//         for (int i = 1; i<= n; i++){
            
//             // SAPCES--
            
//             for(int s= 1; s<=(n-i); s++){
//                 System.out.print(" ");
//             }
            
//             // numbers
//             for(int j=1; j<= i; j++){
//                 System.out.print(j + " ");  // space for make pyramid
//             }
            
//             // next line
//             System.out.println();
//         }
//     }
// }



/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5

*/








// // Q.. BUTTERFLY PATTERN

// public class patternOne {
//     public static void main(String args []){
//         int n = 4;
        
//         // UPPER PART/HALF
//         for(int i = 1; i<=n; i++){
            
//             // 1ST PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // SPACE 
//             int space =2*(n-i);        // ALL SPACEs ARE MULTIPLE OF 2 IN PATTERN
//             for (int s=1; s<=space; s++){
//                 System.out.print(" ");
//             }
            
//             // 2ND HALF
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // NEXT LINE
//             System.out.println();
//         }
        
        
//         // LOWER PART/HALF
//         for(int i = n; i>=1; i--){
            
//             // 1ST PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // SPACEs
//             int space =2*(n-i);                 // ALL SPACEs ARE MULTIPLE OF 2 IN PATTERN
//             for (int s=1; s<=space; s++){
//                 System.out.print(" ");
//             }
            
//               // 2ND HALF
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
            
//             // NEXT LINE
//             System.out.println();
//         }
       
        
//     }
    
// }






// Q. HOLLOW BUTTERFLY---HW;


public class patternOne {
    public static void main(String args[]) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            if (i <= 2) {
                // print i stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // first star
                System.out.print("*");

                // spaces
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }

                // last star
                System.out.print("*");
            }
            
            
            int space = 2*(n-i);
            for(int s= 1; s<=space; s++){
                System.out.print(" ");
            }
            
            
                        if (i <= 2) {
                // print i stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // first star
                System.out.print("*");

                // spaces
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }

                // last star
                System.out.print("*");
            }
            
            

            System.out.println();
        }
        
        
        //LOWER HALF
        
    
            for (int i = n; i >=1; i--) {

            if (i <= 2) {
                // print i stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // first star
                System.out.print("*");

                // spaces
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }

                // last star
                System.out.print("*");
            }
            
            
            int space = 2*(n-i);
            for(int s= 1; s<=space; s++){
                System.out.print(" ");
            }
            
            
                        if (i <= 2) {
                // print i stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // first star
                System.out.print("*");

                // spaces
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }

                // last star
                System.out.print("*");
            }
            
            

            System.out.println();
        }
    
        
    }
}





// ---- CLEAN CODE >>



// public class patternOne {
//     public static void main(String args[]) {
//         int n = 4;

//         // UPPER HALF
//         for (int i = 1; i <= n; i++) {

//             // LEFT WING
//             if (i == 1) {
//                 System.out.print("*");
//             } else if (i == n) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 System.out.print("*");
//                 for (int j = 1; j <= i - 2; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }

//             // MIDDLE SPACES
//             for (int s = 1; s <= 2 * (n - i); s++) {
//                 System.out.print(" ");
//             }

//             // RIGHT WING (same logic)
//             if (i == 1) {
//                 System.out.print("*");
//             } else if (i == n) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 System.out.print("*");
//                 for (int j = 1; j <= i - 2; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//         // LOWER HALF
//         for (int i = n; i >= 1; i--) {

//             // LEFT WING
//             if (i == 1) {
//                 System.out.print("*");
//             } else if (i == n) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 System.out.print("*");
//                 for (int j = 1; j <= i - 2; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }

//             // MIDDLE SPACES
//             for (int s = 1; s <= 2 * (n - i); s++) {
//                 System.out.print(" ");
//             }

//             // RIGHT WING
//             if (i == 1) {
//                 System.out.print("*");
//             } else if (i == n) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//             } else {
//                 System.out.print("*");
//                 for (int j = 1; j <= i - 2; j++) {
//                     System.out.print(" ");
//                 }
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }












































