//  Question --1: -- print the sum of all element of an array

// public class QueOnArray {
//     public static int sumOfArray (int arr[]){
//         int sum = 0;
//         for(int i = 0;i<arr.length;i++){
//             sum = sum+arr[i];
            
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5};
//         System.out.println(sumOfArray(arr));
//     }
    
// }



//  Question --2: -- print the multilpication of all element of an array-:

// public class QueOnArray {
//     public static int sumOfArray (int arr[]){
//         int sum = 1;
//         for(int i = 0;i<arr.length;i++){
//             sum = sum *arr[i];
            
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5};
//         System.out.println(sumOfArray(arr));
//     }
    
// }




//  Question --3: -- FInd the maximum value inside an array--

// public class QueOnArray {

//     // HERE WE suppose maximum = -infinity == Integer.MIN_VALUE. (for comparing with all element of an array)
//     public static int getLargestElement(int arr[]){
//         int largest = Integer.MIN_VALUE;    
//         for(int i = 0; i<arr.length;i++){
//             if (largest < arr[i]){
//                 largest  = arr[i];
//             }

//         }
//         return largest;
//     }

//     // HERE WE suppose maximum = 1st value of array and we comparint it from all other element of an array.

//     public static int getMaxElement(int brr[]){
//         int max = brr[0];
//         for(int i = 0; i< brr.length; i++){
//             if (brr[i] > max){
//                 max = brr[i];
//             }
//         }
//         return max;

//     }




//     public static void main(String[] args) {
//         int crr [] = {1,2,3,4,5};
//         System.out.println(getLargestElement(crr));
//         System.out.println(getMaxElement(crr));

//     }
   
// }


// Question --4: -- FInd the minimum value inside an array--

public class QueOnArray {

    // HERE WE suppose minimun = +infinity == Integer.MIN_VALUE.(for comparing with all element of an array)
    public static int getSmallestElement(int arr[]){
        int smallest = Integer.MAX_VALUE;    
        for(int i = 0; i<arr.length;i++){
            if (smallest > arr[i]){
                smallest = arr[i];
            }

        }
        return smallest;
    }

    // HERE WE suppose maximum = 1st value of array and we comparint it from all other element of an array.

    public static int getMinElement(int brr[]){
        int min = brr[0];
        for(int i = 0; i< brr.length; i++){
            if (brr[i] < min){
                min = brr[i];
            }
        }
        return min;

    }




    public static void main(String[] args) {
        int crr [] = {1,2,3,4,5};
        System.out.println(getSmallestElement(crr));
        System.out.println(getMinElement(crr));

    }
   
}