import java.util.*;
public class IndexOf {
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
       // String s1 = sc.nextInt();
       String s1 = "we are from Allahabad";
       int index1 = s1.indexOf("are");
       System.out.println(index1);
       // for two index simulteneously
       int index2 = s1.indexOf("from");
       System.out.println(index1+" "+index2);

       // for character we will use ''
       int index3 = s1.indexOf('r');
       System.out.println(index3);
       // now we are going to print a word with index
       //('h',4)
       int index4 = s1.indexOf('h',4);//returns the index of is substring after 4th index
       System.out.println(index4);
       int index5 = s1.indexOf("from",2);
       System.out.println(index5);
    }
    
}
