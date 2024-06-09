import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to check armstrong :- ");
        int n=obj.nextInt();
        int arm=armstrong(n);
        if(arm==n){
            System.out.println("YES! given number is Armstrong :- "+n);
        }
        else{
            System.out.println("NO! given number is not armstrong .");
        }

        obj.close();
    }
   
    public static int armstrong(int n){
        int order=order(n); //function call to check digit of number
        int sum=0;
        //System.out.println("Number of Digit in given number "+n+" is :-  "+order);
        while(n>0){
            sum+=Math.pow(n%10,order);
            n/=10;
        }
        return sum;
    }
    public static int order(int n){ //to find the order of given number 
        int order=0;
        while(n>0){
            n/=10;
            order++;
        }
        return order;
    }
    
}
