import java.util.Scanner;

public class FactorialNumber {
    public static  long factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        long fac=1;
        int i=2;
        while(i<=n){
           fac*=i; 
           i+=1;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to find Factorial :- ");
        int n=obj.nextInt();
        long fac=factorial(n);
        System.out.println("the Factorial of "+n+" is :- "+fac);
        obj.close();
    }
}
