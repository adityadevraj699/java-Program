import java.util.Scanner;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int arr[][]=new int[100][100];
        int arr1[][]=new int[100][100];
        int product[][]=new int[100][100];
        System.out.print("Enter a size of row and column in Matrix :-  ");
        int n=a.nextInt();
        System.out.println("Enter a  First  Matrix Element :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = a.nextInt();
            }
        }
        System.out.println("Display  a  First  Matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("  ");
        }


        System.out.println("Enter a  Second  Matrix Element :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = a.nextInt();
            }
        }

        System.out.println("Display  a  Second  Matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println("  ");
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                product[i][j]=0;
                for(int k=0;k<n;k++){
                    product[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
        }

        System.out.println("Product of matrix is :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(product[i][j]+"  ");
            }
            System.out.println("  ");
        }


    }
}
