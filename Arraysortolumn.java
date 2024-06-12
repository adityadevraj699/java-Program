import java.util.*;
public class Arraysortolumn {
    public static void columnSort(int[][] mat,int col){
        Arrays.sort(mat,(a,b)->Integer.compare(a[col],b[col]));
    }
        public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        System.out.print("Enter a size of row in matrix :- ");
        int n=a.nextInt();
        System.out.print("Enter a size of column in matrix :- ");
        int m=a.nextInt();
        int mat[][]=new int[n][m];
        System.out.println("Enter a Matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=a.nextInt();
            }
        }
        System.out.println("Display a matrix :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+ "  ");
            }
            System.out.println(" ");
        }
        System.out.print("Enter a column");
        int col=a.nextInt();
        int column=col-1;

        columnSort(mat,column);
        
        System.out.println("Display a matrix after sorted :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+ "  ");
            }
            System.out.println(" ");
        }

        a.close();
    }
}
