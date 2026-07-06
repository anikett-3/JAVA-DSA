// creation of 2d arrar-->

// public class Basic2DArray{
//     static void main(){

//         //declaration 
//         // int[][] arr;

//         // allocation -
//         // arr = new int [3][4];

//         // initilaize 2d array by giving input self 

//         int[][] brr = {
//             {1,2},
//             {2,3},
//             {3,4},
//             {4,5}
//         };

//         // System.out.println(brr[2][0]); //   --> print any particular value by using cell/row-colunm
         

//         // NOW print ALL VALUE OF 2D ARRAY-->

//         //  we use NESTED LOOP FOR THIS --


//         int rowLength = brr.length;        
//         int colLength = brr[0].length;  // here length of all column is same so we use -- brr[0]

//         for (int row =0; row <= rowLength-1; row++){
//             for(int col = 0; col <= colLength -1; col++){
//                 System.out.print(brr[row][col]+" ");
//             }
//             System.out.println();
//         }    
        

//     }

// }




// SUPPOSE WHEN WE DON'T HAVE SAME NO OF COLUMN THEN WE DELCARE this as-- "JACKED ARRAY"


// public class Basic2DArray{
//     static void main(){

//         int[][] brr = {
//             {1,2},
//             {2,3,6,7},
//             {3,4,5},
//             {4,5,8,9,0,6,3}
//         };

//         int rowLength = brr.length;        
//         // int colLength = brr[0].length;  // here THIS METHOD IS WRONG --



//         for (int row =0; row <= rowLength-1; row++){

//             // row to same rahega 

//             // JAISE hi main kisi new row me aaya 
//             // same point pr mai useee row ka col length find out karunga
//             //  current row ---> brr[row]
//             // issme kitne columns --> brr[row].length

//             int colLength = brr[row].length;

//             for(int col = 0; col <= colLength -1; col++){
//                 System.out.print(brr[row][col]+" ");
//             }
//             System.out.println();
//         }    
        

//     }

// }


// QUESTION -- 3 -- HOMEWORK --> find out karo kya mai array declare kar sakta hu ki jaise mai
//  row 0 oe jau to 2 col banjae then row 1 par 5 col then row 3 par 4 col ban jae --FIND OUT IS THIS IS POSSIBLE
// means jab me 2D array bana rah hu then "arr[3][4]" ek bar mai declare na karu jabki har ek row alag alag column value ko dalu 