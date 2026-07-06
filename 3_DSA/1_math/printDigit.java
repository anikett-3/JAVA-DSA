public class printDigit {
    public static void PrintDigitOfnumber(int num){
        while(num != 0){
            int digit = num % 10;
            System.out.print(digit);

            // last digit remove-
            num = num/10;


        }
    }
    
    public static void main(String[] args) {
        int num = 2345;
        PrintDigitOfnumber(num);
    }
}
