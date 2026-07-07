
// //CHECK PRIME OR NOT-->
// public class Main{
//     public static boolean checkPrime(int n){
//         if (n==2){
//         return true;
//         }
        
//         for(int i = 2; i<=n-1; i++){ //    (i = 1 to --> n-1 )
//             if(n%i==0){
//             return false;
//             }
 
//         }
//         return true;
//     }
    
//     public static void main(String args[]){
//         System.out.println(checkPrime(5));
//     }
// }



// //OPTIMIZED WAY TO CHECK PRIME->


// public class Main{
//     public static boolean chekPrime(int n){
//         if (n ==2){
//             return true;
//         }
        
//         if (n<2){
//             return false;
//         }
        
        
//         for(int i = 2; i <= Math.sqrt(n); i++){   // Math.sqrt(n)  --> ( M capital in math)
//             if (n%i == 0){
//                 return false;
//             }
//          }
         
//          return true;
        
//     }
    
//     public static void main(String args[]){
//         System.out.println(chekPrime(5));
//     }
// }










// ------------------------------------------------------------------------------





// PRINT RANGE OF PRIME NUMBER UNDER GIVEN NUMBER (eg n = 5 ==> 2,3)


// public class Main{
//     public static boolean chekPrime(int n){
//         if (n ==2){
//             return true;
//         }
        
//         if (n<2){
//             return false;
//         }
        
        
//         for(int i = 2; i <= Math.sqrt(n); i++){   // Math.sqrt(n)  --> ( M capital in math)
//             if (n%i == 0){
//                 return false;
//             }
//          }
         
//          return true;
        
//     }
    
    
//     public static void printINrange(int n){
//         for (int i =1; i<=n; i++){
//             if (chekPrime(i)){     // i-->  we check (i) in every step;  -- if true then print next line 
//                 System.out.print(i +" ");
//             }
            
//         }
//         System.out.println();
//     }
    
//     public static void main(String args[]){
//         System.out.println(chekPrime(5));
//         printINrange(7);
//     }
// }