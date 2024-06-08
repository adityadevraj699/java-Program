import java.util.Scanner;

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a First number :- ");
        int first=obj.nextInt();
        System.out.println("Enter a Second number :-");
        int second=obj.nextInt();
        long gcd=gcd(first,second);
        System.out.println("the Greatest Common Divisor of "+first+" and "+second+" is :-  "+gcd);
        obj.close();
    }
    public static long gcd(int f,int s){
        int i=f;
        long a;
        while(i>0){
            a=f%i;
            if(a==0){
                if(s%i==0){
                    return i;
                }
            }
            i-=1;
        }
        return 1;
    }
    
}
