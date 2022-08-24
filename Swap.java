import java.util.*;
//
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter n no.");
        int n = sc.nextInt();
        System.out.println("Enter s no.");
        int s = sc.nextInt();
        
        int temp;/// yha par sc.next nhi likha coz isko khali rakhna h... isme koi input nhi lena
        System.out.println(" swapping");
        temp = s;
        s= n;
        n = temp;
        System.out.println("now s become= "+s+" , n has become "+n);
        

    }
    
}
