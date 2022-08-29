import java.io.IOException;
import java.util.*;
import java.io.IOException.*;
public class OpenNotePad {
    public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("notepad");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
