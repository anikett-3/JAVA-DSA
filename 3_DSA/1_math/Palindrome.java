/* BY STATIC METHOD --> WHICH WE USE IN OUR VS CODE  */

class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = reverseDigit(x);

        return original == reverse;
    }

    public static int reverseDigit(int num) {
        int reverseNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }

        return reverseNum;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}


// ----------------------------------------------------------------------------------------------------------------------------------------

// /* BY   W I T H O U T   STATIC METHOD --> WHICH USE BY LEETCODE   */
// // it not use static -- it direcltly give input from class method 
// // where we use only -- > "Palnidrome" - in leetcode is to "Solution"



// class Palindrome {

//     public boolean isPalindrome(int x) {
//         if (x < 0) {
//             return false;
//         }

//         int original = x;
//         int reverse = reverseDigit(x);

//         return original == reverse;
//     }

//     public int reverseDigit(int num) {
//         int reverseNum = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reverseNum = reverseNum * 10 + digit;
//             num /= 10;
//         }

//         return reverseNum;
//     }

//     public static void main(String[] args) {
//         Palindrome obj = new Palindrome();

//         int num = 121;
//         System.out.println(obj.isPalindrome(num));
//     }
// }






