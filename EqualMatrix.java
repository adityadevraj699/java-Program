import java.util.Scanner;

public class EqualMatrix {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int matrix1[][]=new int[100][100];
        int matrix2[][]=new int[100][100];
        boolean flag=true;
        System.out.print("Enter a size of Row in matrix 1 :-  ");
        int n=a.nextInt();
        System.out.print("Enter a size of column in matrix 1 :-  ");
        int m=a.nextInt();
        System.out.print("Enter a size of Row in matrix 2:-  ");
        int n1=a.nextInt();
        System.out.print("Enter a size of column in matrix 2 :-  ");
        int m1=a.nextInt();

        if(n!=n1 || m!=m1){
            System.out.println("Both matrix size are not same .");
        }
        else{

        System.out.println("Enter a matrix 1 element :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j]=a.nextInt();
            }
        }
        System.out.println("Display a matrix 1 :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix1[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Enter a matrix 2 element :- ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                matrix2[i][j]=a.nextInt();
            }
        }
        System.out.println("Display a matrix 21 :- ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
               System.out.print(matrix2[i][j]+ " ");
            }
            System.out.println(" ");
        }

       
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix1[i][j]!=matrix2[i][j]){
                flag= false;
                break;
            }
        }
       }

       if(flag){
        System.out.println("YESS!  Both Matrix are Same and Equal .");
       }
       else{
        System.out.println("SORRY!  Both Matrix are not Same and Equal .");
       }
    }
    

        
        

    }
}
