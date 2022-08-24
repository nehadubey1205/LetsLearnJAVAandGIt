import java.util.*;
public class CompareTwoString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.compareTo(s2) > 0){
            System.out.println("s1 is greater");
        }else if(s1.compareTo(s2) <0){
            System.out.println("s2 is grater");
        }else{
            System.out.println("both are equal");
        }
        // s1 = aa
        //s2 = aaa
        // output will be "s2 is greater"

    }
    
}
