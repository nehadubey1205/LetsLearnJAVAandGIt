import java.util.*;
class FahrenheitToCelsius{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the Fahrenheit");
        float tempreture = sc.nextFloat();
        tempreture = ((tempreture -32)*5)/9;
        System.out.println("celscius="+tempreture);
    }
}