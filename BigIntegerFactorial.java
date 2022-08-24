import java.util.Scanner;
import java.math.BigInteger;
public class BigIntegerFactorial{
    static BigInteger factorial(int n){
        //BigInteger f = new BigInteger("1");
        
        for(int i = 2; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
            
        }return f;
    }
    public static void main(String[]args) throws Exception
    
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n= 4;
        System.out.println(factorial(n));


    }
    
}