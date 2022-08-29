import java.util.*;
public class Concatnate {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        // input -"Java programming"
        int n = s.length();
        System.out.println("length of string= "+n );
        String t ="";
        t = s.replace("java", "c++");//"c++ programming"
        System.out.println("new replace String= "+t);
        String u ="";
        u = s.concat(" is fun");//"Java programming is fun
        System.out.println("new concateString= "+u);
    }
    
}
