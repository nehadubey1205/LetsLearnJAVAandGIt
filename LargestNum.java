import java.util.Scanner;
class LargestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z)
            System.out.println("x is largest= "+x);
        else if(y>x && y>z)
            System.out.println("yis largest= "+y);
        else if(z>y && z>x)
            System.out.println("z is largest = "+z);        
    }
}