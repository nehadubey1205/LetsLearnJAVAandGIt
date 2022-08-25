import java.util.*;
public class PrimeNoComplexityLess{
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        /*  take "count" variable and marked as agar number ekbar bhi i se devide ho gya toh
count ko increment kar denge aur agr count > 0 hua toh it means you have found non-prime no there should be no traverse further
        else if count is less than 0 means there is chances to find out prime
     */
        for(int i=2;i*i<n;i++){// this loop will run for root n times, since i*i=n is nothing but i = root n
            
            if(n%i==0){
                count = count+1;
                break;// yha jaise hi ek bar divide hua hum loop se bahar aa jayenge, bar bar divide nhi karenge
            }

        }if(count>0){
            System.out.println("nonprime");
        }else{
            System.out.println("prime");
        }

    }
    
    




}