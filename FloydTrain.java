import  java.util.Scanner;
class FloydTrain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*floyd traingle is nothing but as the rows number will increase the number will also be incresed
     * and rows no == number present
     * ex = 1            *
     *      1 2          * *
     *      1 2 3        * * *
     */
    // according to question we need to print consecutive natural number.
        int num =1;
        int r,c;// rows and coloum k liye loop
        for(r =1; r<=n; r++){
            for(c =1; c<=r; c++){
                System.out.print(num+" ");
                num++;// no. increase karna h for every rows and colom
            }System.out.println();
        }
    }
}