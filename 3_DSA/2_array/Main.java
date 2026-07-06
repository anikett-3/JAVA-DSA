// // Linear search 
// public class Main{
//     public static int linearSearch(int numbers [], int key){
//         for (int i =0; i<numbers.length ; i++){
//             if(numbers[i] == key){
//                 return i;
                
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//          int num[]={1,2,3,5,4,6,10,23};
//          int key =11;
         
//          int index = linearSearch(num, key);
//          if (index == -1){
//              System.out.println("Not found");
             
//          }
//          else{
//             System.out.println("index of key "+ index);
//          }
         
//     }
// }



// Largest value
// import java.util.*;
// public class Main{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;     // max ke liye "integer.min" lenge
//         for (int i= 0; i < numbers.length; i++){
//             if (largest<numbers[i]){
//                 largest = numbers[i];
//             }
            
//         }
//         return largest;
        
//     }
//     public static void main(String args[]){
//         int num []= {1,2,3,6,5,0};
//         System.out.println(getLargest(num));
//     }
// }




// //  LARGEST AND SMALLEST;
// import java.util.*;
// public class Main{
//     public static int getLargestAndSmallest(int numbers[]){
//         int largest = Integer.MIN_VALUE;     // max ke liye "integer.min" lenge
//         int smallest = Integer.MAX_VALUE; 
//         for (int i= 0; i < numbers.length; i++){
//             if (largest<numbers[i]){
//                 largest = numbers[i];  // If the current number is greater than largest, update it.
//             }
            
//             if (smallest>numbers[i]){
//                 smallest = numbers[i];   //If the current number is smaller than smallest, update it.
//             }
            
//         }
//         // return smallest;  // WE ONLY RETURN 1 ITEM HERE SO ->
//         System.out.println("smallest value: " +smallest);
//         return largest;
        
//     }
//     public static void main(String args[]){
//         int num []= {1,2,3,6,5,0};
//         System.out.println("largest value : "+ getLargestAndSmallest(num));
//     }
// }
       
//  BINARY SEARCH-- find index if element of an array


public class Main{
    
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        
        while(start <= end){
            int mid = (start + end) /2 ;
            
            // comparison
             if (numbers[mid] == key){
                 return mid;
             }
             if(numbers[mid] < key){
                 start = mid+1;    // we will find key in right of mid
             }
             
             else{   // we will find key in left of mid
             end = mid-1;
             }
             
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10,12,14};
        int key =10;
        System.out.println("Index for key is: "+ binarySearch(numbers,key));
    }
}