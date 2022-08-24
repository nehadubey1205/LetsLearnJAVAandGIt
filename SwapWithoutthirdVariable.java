import java.util.*;
public class SwapWithoutthirdVariable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n= " + " Enter m =");
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n+m;
        m = n-m;
        n= n-m;
        System.out.println("After swap n has become = " +n+ ", m has become =" +m);
    }
    
}
