import java.util.Scanner;

public class palindromeNumber {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to reverse :- ");
        int n=obj.nextInt();
        boolean res=reverse(n);
        if(res){
            System.out.println("YES!  given number is Palindrome :- "+n);
        }
        else{
            System.out.println("NO!  goven number is not Palindrome .");
        }
        obj.close();
    }
    public static boolean reverse(int n){
        int numcopy=n;
        int a,res=0;
        while(n>0){
            a=n%10;
            res=res*10+a;
            n/=10;
        }
        return res==numcopy;
    }
}
