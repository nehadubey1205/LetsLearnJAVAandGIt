import java.util.*;
class SwapWithXor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n= " + " Enter m =");
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n^m;
        m = m^n;
        n= m^n;
        System.out.println("After swap n has become = " +n+ ", m has become =" +m);
    }
    
}

