import java.util.Scanner;
import java.lang.Math;
public class Root {
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Value of Quadratic Equation to find Roots :- ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        
        
        double d = Math.sqrt(b*b - 4*a*c);

        if (d>0){
            double Root_1 = (b+d)/(2*a);
            double Root_2 = (b-d)/(2*a);
            System.out.println("The two roots of Quadratic Equations is :-  "+Root_1+" and "+Root_2+" ");   
        }
        else if(d == 0){
            double Root_1 = b/(2*a);
            System.out.println("The two equal roots of Quadratic Equations is ( Root_1 == Root_2 ) :-  " +Root_1); 
        }
        else {
            System.out.println("This quadratic Equation gives a Imaginary Number .");
        }


    }
}
