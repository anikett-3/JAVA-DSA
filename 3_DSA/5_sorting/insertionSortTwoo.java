

public class insertionSortTwoo{
    
// INSERTION SORT--
public static void insertionSort(int arr[]){
    for (int i = 1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev]> curr){
            arr[prev+1]  =    arr[prev];
            prev--;
        }
        
        arr[prev+1] = curr;
    }
}
    
    
// BUBBLE SORT-->
public static void bubbleSort(int arr[]){
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void printAr(int arr1[]){
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr2[]={5,4,3,6,2,1,0};
        printAr(arr2);
        insertionSort(arr2);
        printAr(arr2);
        
    }
}