import java.util.*;
public class StringToInteger{  
    public static void main(String args[]){  
    //Declaring String variable  
    String s="200";  
    //Converting String into int using Integer.parseInt()  
    //int i=Integer.parseInt(s);  
    Integer i=Integer.valueOf(s);  
    //System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator  
    System.out.println(i+100);//300, because 200+100, here + is a binary plus operator  
    }}  
    
