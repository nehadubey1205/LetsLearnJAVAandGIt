import java.util.*;
public class CurrentDateTime {
    public static void main(String[]args){
       // Scanner sc = new Scanner(System.in);
        int y; //= sc.nextInt();//year
        int m; //= sc.nextInt();//month
        int d; //= sc.nextInt();//date
        int h ;//= sc.nextInt();//hour
        int n ;//= sc.nextInt();//minute
        int s ;//= sc.nextInt();//second
        //int d = sc.nextInt();
        GregorianCalendar date = new GregorianCalendar();
        d = date.get(Calendar.DAY_OF_MONTH);
        m = date.get(Calendar.MONTH);
        y = date.get(Calendar.YEAR);
        h = date.get(Calendar.HOUR);
        n = date.get(Calendar.MINUTE);
        s = date.get(Calendar.SECOND);
        System.out.println("Current date "+d+"/" +(m+1)+"/"+y );
        System.out.println("Current Time "+d+"/" +n+"/"+y );


    }
    
}
