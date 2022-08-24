import java.util.*;
import java.math.BigInteger;
// adding big number
public class AddBigno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        // here i will use .add function to add
        BigInteger sum = first.add(second);
        System.out.println("addition of large no= "+sum);
    }
    
}
