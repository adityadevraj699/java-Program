import java.util.Scanner;
public class ElementLarger {
   public static void main(String[] args) {
    Scanner A=new Scanner(System.in);
    int arr[]=new int[100];
    System.out.print("Enter a size of array :-  ");
    int n=A.nextInt();
    System.out.println("Entert a element of Array :- ");
    for(int i=0;i<n;i++){
      arr[i]=A.nextInt();
    }
    System.out.println("Display a Array :- ");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+"  ");
    }

    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<n;i++){
      if(arr[i]>max){
         max=arr[i];
      }
      if(arr[i]<min){
         min=arr[i];
      }
    }
    System.out.println("The Maximum Element of Array is :-  "+max);
    System.out.println("The Minimum Element of Array is :-  "+min);

   } 
}
