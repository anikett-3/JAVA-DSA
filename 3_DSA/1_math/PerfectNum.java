public class PerfectNum {
    static boolean checkPerfectNumber(int num){
        int sum = 1;   // sum ko hamne 1 se initalizie kiya hai Qk 1 sabse divisible hota hai 
        for(int i = 2; i*i <= num;i++ ){  // or jab 1 se pehle hi initalize kar liya then -- i ko 2 se chalte hai 
            if(num % i == 0){
                // i ne num ko perfectly divide kar diya hai tabhi idhar aya hai-
                // to ab factor pair kya banega
                // 1st factor to visible hai -- i ; num % i = o hua hai tabhi to yaha tak aya hai than 
                // second factor hoga -- num/i ;; (num = 1st factor and 2nd factor) simple 
                // or now ham ye av chek karenge -- num == sum of both factor 

                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum+ firstFactor + secondFactor;

            }
        }
        if (num == sum){
            return true;
        }
        else{
        return false;
        }
        
    }
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }

    
}
