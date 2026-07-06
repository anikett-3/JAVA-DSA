// public class Main
// {
// 	public static void main(String[] args) {
// 	    start = 0;
// 	    end = 1;
// 	    arr[] ={1,2,2,2,3,4,5,5,5,5};
// 	    count =0;
// 	    while(start < end){
// 	        if(arr[start] ==  arr[end]){
// 	            count ++;
// 	            end --;
// 	        }
// 	        else{
// 	            arr[start] = arr[end];
// 	        }
// 	    }
// 	}
// }





// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1,2,2,2,3,4,5,5,5,5};

//         int count = 1;

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] == arr[i - 1]) {
//                 count++;
//             } else {
//                 System.out.println(arr[i - 1] + " → " + count);
//                 count = 1;
//             }
//         }

//         System.out.println(arr[arr.length - 1] + " → " + count);
//     }
// }











// public class Main {
//     public static void main(String[] args) {

//         int[] arr = {1,2,2,2,3,4,5,5,5,5};

//         int start = 0;
//         int end = 1;
//         int count = 1;

//         while (end < arr.length) {

//             if (arr[start] == arr[end]) {
//                 count++;
//                 end++;
//             }else {
//                 System.out.println(arr[start] + " → " + count);
//                 start = end;
//                 count = 1;
//                 end++;
//             }
//         }

//         // print last element frequency
//         System.out.println(arr[start] + " → " + count);
//     }
// }

public class Main{
    public static void main(String args[]){
        int start =0;
        int end =1;
        int arr[]= {1,1,2,2,2,3,3,4,4,4,4};
        int count =1;
        while(end<arr.length){
            if(arr[start] == arr[end]){
                count ++;
                end ++;
            }
            else{
                
                System.out.println(arr[start] + "-->"+ count);
                start=end;
                count = 1;
                end++;
                
            }
        }
        System.out.println(arr[start] + "-->"+ count );
    }
}




