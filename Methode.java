import java.util.*;
public class Methode{
    public static int AddNum(int a, int b)//yha static nhi us ekiya h qukii object creat kar diya h
    // main methode m 
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//25;
        int m = sc.nextInt();//15;
        //ConstructMethod ob = new ConstructMethod();
        int result = AddNum(n,m);
        System.out.println(result);

    }
}