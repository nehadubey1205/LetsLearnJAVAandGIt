import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String original =  sc.nextLine();
        int size = original.length();
        String reverse="";
        for(int i = size-1; i>=0;i-- ){
            reverse = reverse+ original.charAt(i);
           
        } System.out.print(reverse);

    }
    
}

