import java.util.*;
interface I1{
    public void show();
}

 class Test implements I1 {
    public void show(){
        System.out.println("I am here");
    }
    public static void main(String[]args){
        Test t = new Test();
        t.show();
    }

    
}
