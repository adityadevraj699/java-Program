import java.util.*;
public class ArrayBoundry {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[][]=new int[100][100];
        System.out.print("Enter size :-    ");
        int n=obj.nextInt();
        System.out.println("Enter Element ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Display boundry of Array  Element :-  ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n-1) || j==(n-1)){
                    System.out.print(arr[i][j] +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        obj.close();
    }
}
