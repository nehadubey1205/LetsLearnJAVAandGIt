import java.util.*;
public class ReverseUsingWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//453
        int reverse=0;
        
        while(n!=0){
           
            reverse = reverse*10+ n%10;
            n = n/10;

            /*first iteration---
             number = 1234
             remainder = 1234 % 10 = 4
             reverse = 0 * 10 + 4 = 0 + 4 = 4
             number = 1234 / 10 = 123
             Second Iteration--
             number = 123
             remainder = 123 % 10 = 3
            reverse = 4 * 10 + 3 = 40 + 3 = 43
            number = 123 / 10 = 12
             */

            
            
        }System.out.println(reverse);
    }

    
}
