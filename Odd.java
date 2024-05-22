import java.util.Scanner;
public class Odd {
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to check a odd and Even :- ");
        int num = kb.nextInt();

        if (num%2 != 0){
            System.out.println("Given number "+num+" is odd . ");
        }
        else{
            System.out.println("Given number "+num+" is Even . ");
        }
    }
}
