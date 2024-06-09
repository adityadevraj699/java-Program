import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to Fabonacci serirs :- ");
        int n=obj.nextInt();
        System.out.println("Print the Fabonacci Series in "+n+"th term :- ");
        fabonacci(n);
        obj.close();
    }
    public static void fabonacci(int n){
        if(n<0)return;
        int a=0;int b=1;
        System.out.print(a+" ");
        if(n==0)return;
        System.out.print(b+" ");
        while((a+b)<n){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
