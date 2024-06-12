import java.util.Scanner;

public class ArrayCheckSorted {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a size of array :- ");
        int n=obj.nextInt();
        
        int array[]=new int[n];
        System.out.println("Enter a array element :- ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        sort(array, n);
        obj.close();

    }
    public static void sort(int array[],int n){
        int i=0;
        if(array[i]<array[i+1]){
            for(i=1;i<n;i++){
                if(array[i-1]<=array[i]){
                    continue;
                }
                else{
                    System.out.println("Array is not sorting !");
                    return;
                }
            }
           System.out.println("YES!  Array is sorting in Ascending order");
        }
        else{
            for(i=1;i<n;i++){
                if(array[i-1]>=array[i]){
                    continue;
                }
                else{
                    System.out.println("Array is not sorting !");
                    return;
                }
            }
            System.out.println("YES!  Array is sorting in Descending order");
        }
       
    }
}
