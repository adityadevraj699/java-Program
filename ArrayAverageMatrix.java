import java.util.Scanner;

public class ArrayAverageMatrix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a size of row :- ");
        int n=obj.nextInt();
        System.out.print("Enter a size of column :-");
        int m=obj.nextInt();
        int array[][]=new int[n][m];
        System.out.println("Enter a 2D-Array :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=obj.nextInt();
            }
        }
        System.out.println("Display a array :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+ "   ");
            }
            System.out.println("\n");
        }
        int sum=sum(array,n,m);
        System.out.print("Sum of array is :-  "+sum);
        double avg=average(sum,n,m);
        System.out.print("\nAverage of Array :- "+avg);
        obj.close();
    }
    public static int sum(int array[][],int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }
    public static double average(double sum,int n,int m){
        sum/=(n*m);
        return sum;
    }
}
