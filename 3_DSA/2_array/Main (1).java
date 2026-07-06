//Q.1--> FIND 2ND LARGEST NUMBER IN AN ARRAY
// public class Main{
//     public static int Secodlargest(int arr[]){
//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;
//         for (int i = 0; i<arr.length; i++){
//             if ( arr[i] > first){
//                 second = first;
//                 first = arr[i];
//             }
//             else if(arr[i]> second && arr[i]!= first){
//                 second = arr[i];
//             }
//         }
//         return second;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,3,1,8};
//         System.out.println(Secodlargest(numbers));
//     }
// }






//Q.2--> REVERSE THE ARRAY
// public class Main{
//     public static void reverseArray(int arr[]){
//         int start = 0; int end = arr.length-1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start ++;
//             end--;
//         }
//         for (int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,7,8};
//         reverseArray(numbers);
//     }
// }



// Q.3 FIND MAX AND MIN ELEMENT IN AN ARRAY--
// public class Main{
//     public static void findMaxMin(int arr[]){
//         int max =Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
        
//         for (int i = 0; i<arr.length;i++){
//             if ( arr[i]> max){
//                 max = arr[i];
//             }
//             if (arr[i]< min){
//                 min = arr[i];
//             }
            
//             System.out.println("Max: "+ max + "  Min: " +min);
//         }
//         System.out.println("Max: "+ max + "  Min: " +min);
        
//     }
//     public static void main(String args[]){
//         int numbers[]={4,6,2,7,8,1};
//         findMaxMin(numbers);
//     }
// }


//Q.4--> FIND LINEAR SEAERCH IN AN ARRAY-->

// public class Main{
//     public static int linearSearch(int arr[] , int key){
//         for(int i = 0; i<arr.length; i++){
//             if (arr[i] == key){
//                 return key;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,3,4,5,7};
//         int key = 8;
//         System.out.println(linearSearch(arr,key));  // if value  will not match then return -1
//     }
// }


//Q.5 COUNT THE FREQUENCY OF AN ELEMENT OF AN ARRAY:  (and given number)

// public class Main{
//     public static void countFrequency(int arr[]){
//         int count =1;
//         for (int i = 0 ; i<arr.length-1; i++){
//             if(arr[i]== arr[i+1]){
//                 count++;
//             }        
//             else{
//                 System.out.println(arr[i] + " count -> "+ count);
//                 count =1;
//             }
//         }

//         //--> print last element
//         System.out.println(arr[arr.length-1] + " count  --> " +count);
//     }
//      public static void main(String args[]) {
//         int arr[] = {1,1,1,2,3,3,3,4,5,6,6,7,8};
//         countFrequency(arr);
//     }
// }



// Q.6 ROTATE ELEMENT OF ARRAY BY K POSITION (left rotate and right roatate)-->

// import java.util.*;
// public class Main{
//     public static void reverse(int arr[] , int start , int end){
//         while(start<end){
//             int temp= arr[start];
//             arr[start]= arr[end];
//             arr[end] = temp;
//             start ++;
//             end--;
//         }
        
//     }
    
//     public static void rightRotate(int arrr[], int k){
//         int n = arrr.length;
//         k = k%n;
        
//         // step:1 - reverse whole array;
//         reverse(arrr,0, n-1);
        
//         // step:2-- reverse k element;
//         reverse(arrr, 0, k-1);
        
//         // step 3-- reverse rest element;
//         reverse(arrr, k,n-1);
//     }
    
//     public static void leftRotate(int arrr[], int k){
//         int n = arrr.length;
//         k = k%n;
        
//         // step 1: rotate k element
//         reverse(arrr, 0,k-1);
        
//         // step 2: rotate rest element
//         reverse(arrr, k, n-1);
        
//         // step 3: rotate whole  array now
//         reverse(arrr, 0,n-1);
        
//     }
//     public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5,6,7};
//         int numbers2[] = {1,2,3,4,5,6,7};
//         int j = 3;
        
//         // original array
//         System.out.println("original array--> " + Arrays.toString(numbers));
        
//         rightRotate(numbers, j);
//         System.out.print("right rotate --> ");
//         for (int i = 0; i<numbers.length; i++){
//             System.out.print( numbers[i]+" ");
//         }
        
//         // next line --
//         System.out.println();
        
//         leftRotate(numbers2,j);
//         System.out.print("left rotate --> ");
//         for (int i = 0; i<numbers2.length; i++){
//             System.out.print(numbers2[i]+" ");
//         }
        
//     }
// }
 

        
        
        
        