import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a First number :- ");
        int first=obj.nextInt();
        System.out.println("Enter a Second number :-");
        int second=obj.nextInt();
        long lcm=lcm(first,second);
        System.out.println("the Least Common Multiple of "+first+" and "+second+" is :-  "+lcm);
        obj.close();
    }
    public static long lcm(int f,int s){
        int i=1;
        long a=1;
        while(i>0){
            a=s*i;
            if(a%f==0){
                return a;
            }
            i+=1;
        }   
        
        return 0;
    }
}
