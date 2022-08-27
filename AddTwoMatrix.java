import java.util.*;
public class AddTwoMatrix {
    // this is for two D array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//rows 
        int n = sc.nextInt();// coloum 
        // here a and b denotes the size of rows and coloum respectively
        int first[] [] = new int [m][n];// first matrix k liye
        int second [] [] = new int [m] [n];// second matrix k liye
        int sum [] [] = new int [m] [n];// third matrix k liye
        for(int c =0;c<m;c++){
            for(int d = 0;d<n;d++){
                first [c][d] = sc.nextInt();

            }
        }
        for(int c =0;c<m;c++){
            for(int d = 0;d<n;d++){
                second [c][d] = sc.nextInt();
                
            }
        }for(int c =0;c<m;c++){
            for(int d = 0;d<n;d++){
                sum [c][d] = first[c][d]+second [c][d];
                System.out.println("sum of matrix"+ sum [c][d]);
                // yha dono ko add kra diya
                // now print karane k liye loop chalana h
                
            }
        }for(int c = 0;c<m;c++){
            for(int d =0; d<n ; d++){
                System.out.print(sum[c][d]+"\t");
            }
        }
        System.out.println();

        
    }


    
}
