import java.util.Scanner;
public class Triangle{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a three angle of Triangle :- ");

        
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        if ((a+b+c) == 180 && a!=0 && b!=0 && c!=0){
            System.out.println("Triange are valid in angle and its type is :- ");

            if ( a==b && b==c){
                System.out.println("Equilateral Triangle . ");
                System.out.println("a = b = c = " +a);
            }
            else if(a==b || a==c || b==c){
                System.out.println("Isosceles Triangle . ");
                if (a==b){
                    System.out.println("a = b = " +a);
                    System.out.println("c = " +c);
                }
                else if(a==c){
                    System.out.println("a = c = " +a);
                    System.out.println("b = " +b);
                }
                else {
                    System.out.println("a = " +a);                                           
                    System.out.println("b = c = " +b);
                }
            }
            else {
                System.out.println("Scalene Triangle . ");
                System.out.println("a = " +a);
                System.out.println("b = " +b);
                System.out.println("c = " +c);
            }
        }
        else{
            System.out.println("Triangle are not valid due to angle . ");
        }

    }
}
