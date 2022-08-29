import java.util.*;
public class Main {
    //static int Product(int a, int b)
    // i am going to create an object , static word will not be used
    public int Product(int a, int b)
    {
        int p = a*b;
        return p;
    }
    
    public static void main(String[]args){
        int n =2;
        int m= 3;
        Main ob = new Main();
        int res = ob.Product(n,m);
        System.out.println(res);
    }
    
}
