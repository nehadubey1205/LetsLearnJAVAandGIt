import java.util.*;
public class Finally {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res ;
        try{
            res = n/m;
            System.out.println("try this = "+res);
        }catch(Exception e){
            System.out.println("devide by zero not worked");
        }finally{
            System.out.println("Finally will not disppoint you");
        }
    }
    
}
