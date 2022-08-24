import java.util.Scanner;
class WhileLoop {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");
        //System.out.println("Input an Integer");
        while((n = sc.nextInt())!=0){
            System.out.println("you entered"+n);
            System.out.println("Input an integer");

        }
        System.out.println("out of the looop");
    }
 
 
}
/*
 Input an integer
1
You entered 1
Input an integer
5
You entered 5
Input an integer
4
You entered 4
Input an integer
0
Out of loop
 */