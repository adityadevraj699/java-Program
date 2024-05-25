import java.util.Scanner;
class Duplicate{
    public void Array(int arr1[],int a){
       
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr1[i]==arr1[j]){
                    for(int k=j;k<a;k++){
                        arr1[k]=arr1[k+1];
                    }
                    j--;
                    a--;
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");

        }

    }
}
public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter size :-    ");
        int n=obj.nextInt();
        System.out.println("Enter Element ");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("Dispaly Array :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        Duplicate obj1=new Duplicate();
        obj1.Array(arr, n);

        obj.close();
    }
}
