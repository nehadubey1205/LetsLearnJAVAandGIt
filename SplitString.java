import java.util.*;
public class SplitString {
    public static void main(String[]args){
        Scanner sc=  new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = s.split("\\s");// split string based on spaces beween them
        // use for each loop
        for(String w: word){
            System.out.println(w);
        }
    }
    
}
