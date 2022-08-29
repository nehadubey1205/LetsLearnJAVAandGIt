import java.util.*;
public class ExceptionHand {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        int m = sc.nextInt();//2
        
        int result ;
        try{
            result = n/m;
            System.out.println("Result= "+result);
        }catch(ArithmeticException e){
            System.out.println("result not foud due to divide by zero");
        }
    }
    
}
