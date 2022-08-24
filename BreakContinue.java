import java.util.Scanner;
public class BreakContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter no = ");
            int n  = sc.nextInt();
            if(n!=0){
                System.out.println("the number is ="+n);
                continue;
            }else{
                break;
            }

        }
        
        
    }
    
}
