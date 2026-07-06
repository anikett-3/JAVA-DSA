public class Basicmaths {
    public static void digitPrint(int num){
        while(num != 0){
            int digit = num%10;
            System.out.println(digit);
            // last digit print
            num = num/10;
        }

    }
    public static void main(String[] args){
        int num =789955;
        digitPrint(num);
    }
}
