import java.util.Scanner;
public class IfElseMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MarksObtain = sc.nextInt();
        int Passingmarks = sc.nextInt();
        if(MarksObtain >= Passingmarks)
           System.out.println("A person has been passed");
        else   
           System.out.println("A person has been failed");

    }
    
}
