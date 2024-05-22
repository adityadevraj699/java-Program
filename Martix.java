import java.util.*;
public class Martix {
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int Product[][] = new int[3][3];

        System.out.println("Enter a size of martix (row and column) :-");
        int n = kb.nextInt();
        System.out.println("Enter a matric  1 :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j]=kb.nextInt();
            }
        }
        System.out.println("Enter a matric  2 :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=kb.nextInt();
            }
        }

        System.out.println("the product of matrix is :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Product[i][j]=0;
                for(int k=0;k<n;k++){
                    Product[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            } 
        }

        for(int[] row : Product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

    }
}
