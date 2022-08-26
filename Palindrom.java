import java.util.*;
public class Palindrom {
    // approch is same --to reverse a string but one logic will be added
    // that is if original string equal to reverse string then palindrome
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reverse = "";
        int size = original.length();
        for(int i = size-1; i>=0;i--){
            reverse = reverse + original.charAt(i);
            
        }if(reverse.equals(original)){
            System.out.println("string is palindrome");
        }else
            System.out.println("not palindrome");

    }
    
}
