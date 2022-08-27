import java.util.*;
public class TwoDMatrixSubtract {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colom = sc.nextInt();
        int i =0; int  j=0;
        int first [] [] = new int[row][colom];
        int sec [] [] = new int [row][colom];
        int sub[] [] = new int [row][colom];
        for(i=0;i<row;i++){
            for(j=0;j<colom;j++){
                first[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<colom;j++){
                sec[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<colom;j++){
                sub[i][j] = first[i][j]-sec [i][j];
            }
        }System.out.println("subtraction of matrix: ");
        for(i=0;i<row;i++){
            for(j=0;j<colom;j++){
                //first[i][j] = sc.nextInt();
                System.out.print(sub[i][j]+"\t");
            }System.out.println();
        }
    }
    
}
