import java.util.Scanner;

public class OddSum {
    public static int odd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Nth term sumber to odd sum :- ");
        int n=obj.nextInt();
        int sum =odd(n);
        System.out.println("The sum is odd number term "+n+" is :- "+sum);

            obj.close();
        
    }
    
}
