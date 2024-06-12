import java.util.*;
public class ArraySort {
    
    public static void main(String[] args) {
        int i;
        Scanner a=new Scanner(System.in);
        int array[]=new int[100];
        System.out.print("Enter a size of array :-  ");
        int n=a.nextInt();
        System.out.println("Enter a Array :- ");
        for(i=0;i<n;i++){
            array[i]=a.nextInt();
        }
        System.out.print("Display a array before sorting:- ");
        for(i=0;i<n;i++){
            System.out.print(array[i]+ "  ");
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.print("\nDisplay a array after sorting:- ");
        for(i=0;i<n;i++){
            System.out.print(array[i]+ "  ");
        }
    }

    
}
