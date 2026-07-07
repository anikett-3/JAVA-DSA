// HERE we gonna print Prime no from 1 to N or in range .
public class primeNoTwo {
    // first we have to write code for check a single number is prime or not
    public static boolean checkPrimeNo(int num){
        if(num<2){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if (num% i ==0){
                return false;
            }
        }
        return true;
    }

    // Here our main code for print prime number in range. 
    public static void primeInRange(int n){
        for(int i =2; i<=n-1;i++){
            if(checkPrimeNo(i)){   // here we use checkprime function to check each number 2 to n. // and if check prime == true (default ) then it goes to next line if false if block will stopp.
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num = 10;
        primeInRange(num);

    }
}


