import java.util.*;
public class Staticins {
    public static void main(String[]args){
        display();// without object
        Staticins b = new Staticins();
        b.show();
    }
    static void display()// yha static lga h quki without an oubject h
    {
        System.out.println("without creating object");
    }
     void show(){
        System.out.println("with creating an object");
    }
    
}
