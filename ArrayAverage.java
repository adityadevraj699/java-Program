import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a size of array :-");
        int n=obj.nextInt();
        System.out.println("Enter a array element :- ");
        int sum=array(n);
        System.out.println("Sum of array is :- "+sum);
        double avg=sum/n;
        System.out.println("Average of array is :- " +avg);
        obj.close();
    }
    public static int sum(int []array,int n){
        int a=0;
        for(int i=0;i<n;i++){
            a+=array[i];
        }
        return a;
    }
    public static int array(int n){
        Scanner obj=new Scanner(System.in);
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        obj.close();
        int sum=sum(array, n);

        return sum;
    }
}
