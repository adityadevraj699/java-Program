import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int Array[]=new int[100];
        System.out.print("Enter a size of array :-   ");
        int n=a.nextInt();
        System.out.println("Enter a Array element :- ");
        for(int i=0;i<n;i++){
            Array[i]=a.nextInt();
        }
        System.out.println("Diaplay a Array :- ");
        for(int i=0;i<n;i++){
            System.out.print(Array[i]+"  ");
        }
        for(int i=0;i<n/2;i++){
            int temp=Array[i];
            Array[i]=Array[n-1-i];
            Array[n-1-i]=temp;
        }
        System.out.println("\nDiaplay a Array after reverse :- ");
        for(int i=0;i<n;i++){
            System.out.print(Array[i]+"  ");
        }
        a.close();
    }
}
