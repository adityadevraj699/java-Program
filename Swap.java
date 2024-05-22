import java.util.Scanner;
public class Swap {
    public static void main(String agrs[])
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter two number for swapping :- ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        System.out.println("before swapping value is :-");
        System.out.println("a :-  " +a);
        System.out.println("b :-  " +b);

        int c;

        c=a;
        a=b;
        b=c;

        /*
        a= a+b;    without third variable;
        b= a-b;
        a= a-b
        */ 


        System.out.println("After Swapping value is :-");
        System.out.println("a :-  " +a);
        System.out.println("b :-  " +b);
    }
}
