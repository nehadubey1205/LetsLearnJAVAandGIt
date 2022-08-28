import java.util.*;
public class ReplaceString {
    public static void main(String[]args){
        //Scanner sc  =new Scanner(System.in);
        //String s1 = sc.nextLine();
        String s1="Hello I am  neha , I am from Delhi, I am a learner.";
        String replaceString=s1.replaceAll("am","was");//replaces all occurrences of "is" to
        //"was
        System.out.println(replaceString);
    }
    
}
