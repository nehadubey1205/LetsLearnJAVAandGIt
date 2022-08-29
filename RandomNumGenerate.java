import java.util.*;
public class RandomNumGenerate {
    public static void main(String[]args){
        Random r = new Random();
       // int n = r.nextInt(100);
        for(int i =1;i<=5;i++)// 5 random no dega 0 to 100 k bich
        {
            System.out.println(r.nextInt(100));
        }
        

    }
   
}
