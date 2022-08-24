import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int marksobt = sc.nextInt();
        int passmarks = sc.nextInt();
        if(marksobt >= passmarks){
            
            if(marksobt>=90 )
               System.out.println("Excellent ");
            else if(marksobt>=80)   
               System.out.println("very good  ");
            else if(marksobt>=70)   
               System.out.println("good ");
            else if(marksobt>=60)   
               System.out.println("Satisfctry  ");
           
        }
        else       
            System.out.println("You have Failed boz your marks = " + marksobt);
    }
    
}
