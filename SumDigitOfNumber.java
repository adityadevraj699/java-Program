import java.util.Scanner;

public class SumDigitOfNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a digit to get sum :- ");
        int n=obj.nextInt();
        int sum=Digit(n);
        System.out.println("the sum of digit "+n+" is :-  "+sum);
        obj.close();
    }
    public static int Digit(int n){
        int sum=0;
       while(n>0){
        sum+=n%10;
        n/=10;
       }
        return sum;
    }
}
