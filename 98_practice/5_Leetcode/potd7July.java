/*
You are given an integer n.

Form a new integer x by concatenating all the non-zero digits of n
in their original order. If there are no non-zero digits, then x = 0.

Let sum be the sum of the digits in x.

Return the value of x * sum.

Example 1:
Input: n = 10203004
Output: 12340

Explanation:
Non-zero digits: 1, 2, 3, 4
x = 1234
sum = 1 + 2 + 3 + 4 = 10
Answer = 1234 * 10 = 12340

Example 2:
Input: n = 1000
Output: 1

Explanation:
Non-zero digits: 1
x = 1
sum = 1
Answer = 1 * 1 = 1
*/



// public class potd7July {

//     // 1st we reverse the digit;
//     public static  int reverseDigit(int num){
//         int reverse = 0;
//         while(num!=0){
//             int digit = num%10;
//             reverse = reverse *10 +digit;

//             num = num/10;
//         }
//         return reverse;
//     }
//     public static void nonZeroSum(int num) {
//     int num1 = reverseDigit(num);
//     int sum = 0;
//     int result = 0;

//     while (num1 != 0) {
//         int digit = num1 % 10;

//         if (digit != 0) {
//             sum += digit;
//             result = result * 10 + digit;
//         }

//         num1 = num1 / 10;
//     }

//     System.out.println("Sum = " + sum);
//     System.out.println("x = " + result);
//     System.out.println("Answer = " + (sum * result));
        
//     }
//     public static void main(String[] args) {
//         int num = 120304;
//         nonZeroSum(num);

//     }
    
// }



/// ANOTHER APPROACH 
public class potd7July {

    public static int nonZeroProduct(int n) {

        String s = Integer.toString(n);

        int x = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit != 0) {
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }

    public static void main(String[] args) {

        int n = 10203004;

        System.out.println(nonZeroProduct(n));
    }
}




/// ANOTHER APPROACH  for --LEETCODE.
// class Solution{
//     public long sumAndMultiply(int n){
//         String s = Integer.toString(n);
//         long answer = 0;
//         long sum = 0;
//         for(int i = 0;i<s.length();i++){
//             int digit= s.charAt(i) -'0';
//             if(digit!=0){
//                 sum = sum+digit;
//                 answer = answer * 10+ digit;
//             }
//         }
//         return answer *sum;
//     }
// }
