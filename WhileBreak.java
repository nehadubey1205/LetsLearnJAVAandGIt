import java.util.Scanner;
public class WhileBreak {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        
        while(true){
           
            System.out.print("enter no= ");
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            System.out.println("your num= "+n);
        }
        
    }
    
}
