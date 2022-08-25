import java.util.Scanner;
public class NumberArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*lets say we have 153 no. then first we should isolate this then find cube of each no. then add this
        153= 1*1*1+5*5*5+3*3*3=153, here 153 will be armstrong
        125 = 1*1*1+2*2*2+3*3*3=14, this is not armstrong
         * here Logic is first take that nubmer then store it on some other variable
         * why we are storing in other variable? bcoz we dont want to compare with the original value
         * for that we dont disturb the original value 
         * the other valiable will consist the same no(original no) then we will seperate and the we will cude and the sum
         * 
         */
          int n= sc.nextInt();
          int temp = n;
          int r;// r is use for seperation
          int sum =0;
          
          while(n>0){
            r = n%10;//last digit, or seperate the no
            n = n/10;
            sum = sum+r*r*r;

          }
          // now compare
          if(temp==sum){
            System.out.println("Number is Armstrong");
          }else
            System.out.println("no is not armstrong");

    }
    
}
