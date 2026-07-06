// public class Main{
    
//     public static void swap(int a, int b){
//         int temp = a;
//         a =b ;
//         b =temp;
        
//         System.out.println("a =" + a);
//         System.out.println("b = " +b);
//     }
    
//     public static void main(String args []){
//         int x  = 12;
//         int y = 5;
//         swap(x,y);
//     }
// }




// public class Main{
    
//     public static void swap(int a, int b){
//         int temp = a;
//         a =b ;
//         b =temp;
        
//     }
    
//     public static void main(String args []){
//         int x  = 12;
//         int y = 5;
//         System.out.println("x=" + x);
//         System.out.println("y= " +y);
//     }
// }









// public class Main{
    
//     public static void changeA(int a){
//         a=10;
        
//     }
    
//     public static void main(String args []){
//         int x = 5;
//         changeA(x);
//         System.out.print(x);
//     }
// }




public class call_by_value{
    
    public static void changeA(int a){
        a=10;
        System.out.print(a);
        
    }
    
    public static void main(String args []){
        int x = 5;
        changeA(x);
        
    }
}