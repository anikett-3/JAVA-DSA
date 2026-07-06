// 1. finding largest number in an array:-->

// public class arrayOne{
//     public static int getLargest (int num []){
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i<num.length;i++){
//             if (largest < num[i]){
//                 largest = num[i];
//             }
//         }
//         return largest;

//     }

//     public static void main(String args[]){
//         int number []= {1,2,6,3,5,0};
//         System.out.print(getLargest(number));
//     }

// }

// 2. Binary Search :-->




public class arrayOne {

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;   // Return the index
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 2;

        int result = BinarySearch(arr, key);

        if (result == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}