import java.util.Scanner;
public class Add {
    public static void main(String args[])
    {
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter the two Value :- ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = a + b ;
        System.out.println("Sum is "+a+" and "+b+" is :- " +c);

    }
}
