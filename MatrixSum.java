import java.util.*;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int c=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=a.nextInt();
        }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j || j==3-i-1){
                    c+=arr[i][j];
                    System.out.print(c+ "  ");
                }
        }
        }

        a.close();
    }
}
