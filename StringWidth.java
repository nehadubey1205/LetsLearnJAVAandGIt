import java.util.*;
public class StringWidth {
    //Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        //String s1 = "java by TechnoLamror";
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
       System.out.println(s1.endsWith("Lamror")); //true
       System.out.println(s1.endsWith("r")); //true
       System.out.println(s1.endsWith("lamror")); // false, (aisa character jo string m nhi h)

    }
    
    
}
