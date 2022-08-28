import java.util.*;
public class TransposeMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of matrix");
        
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        int transpose[][] = new int [n][m];
        System.out.println("Transpose of matrix- ");
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose [j][i] = matrix [i][j]; 
            }
            //System.out.println(transpose[j][i]+"\t");System.out.println();
        }for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
               // transpose [j][i] = matrix [i][j];
               System.out.print(transpose[i][j]+"\t"); 
            }
            //System.out.println(transpose[j][i]+"\t");
            System.out.println();
        }
    }
    
}
