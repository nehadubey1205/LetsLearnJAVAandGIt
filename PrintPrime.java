import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class PrintPrime {
    public static void main(String[]args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
    /*logic- suppose hum 7 lete hain to humein bss "2 to 6" k bich k number(2,3,4,5,6)
     check karne honge ki divide ho rhe or nhi , jiske liye loop lagayeng, agar 
     divide hua to mtlb prime nhi h

     * 
     */
    for(int i=2; i<n ; i++){
        if(n%i==0){
            System.out.println("number is not prime");

        }
           
        else{
            System.out.println("number is prime");
 
        }
    /*lekin isme ek weekness point h, ki bar bar number check ho rha prime hai or nhi, 
     * example 6 ko le, to agar ye 2 se ekbar divide ho gya toh mtlb ki ye prime nhi h
     * there is no need with 2,3,4,5, if we have already found that 6 is divible by 2 in our first iteration
     iske liye optimum prime number ka case dekhenge
     */
    
        }   


    }
    
    
    
}
