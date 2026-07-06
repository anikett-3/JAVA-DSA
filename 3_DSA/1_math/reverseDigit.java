public class reverseDigit {
    public static int ReverseNumber(int num){
        int reverseNum = 0;
        while (num!= 0){
            int digit = num %10;
            reverseNum = (reverseNum * 10) + digit;

            // remove last digtit 
            num = num/10;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
    int num = 2345;
    System.out.print(ReverseNumber(num));
    }
    
}


//  12345