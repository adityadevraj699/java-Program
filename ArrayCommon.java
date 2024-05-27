import java.util.Scanner;
class Common{
    public static void FindArrayCommonElement(int arr1[],int arr2[],int n1,int n2){

        int arr3[]=new int[100];
        int n=0;

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    arr3[n]=arr2[j];
                    n++;
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr3[i]==arr3[j]){
                    for(int k=j;k<n;k++){
                        arr3[k]=arr3[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.print(("\nThe Common element of Array is :-   "));
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+"  ");
        }

    }
}
public class ArrayCommon {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int arr1[]=new int[100];
        int arr2[]=new int[100];
        System.out.print("Enter a size of First Array :-  ");
        int n1=a.nextInt();
        System.out.println("Enter a Array element :- ");
        for(int i=0;i<n1;i++){
            arr1[i]=a.nextInt();
        }
        System.out.print("Enter a size of Second Array :-  ");
        int n2=a.nextInt();
        System.out.println("Enter a Array element :- ");
        for(int i=0;i<n2;i++){
            arr2[i]=a.nextInt();
        }
        System.out.println("\nDisplay a Array :- ");
        System.out.print("\nFirst Array is :-   ");
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+"  ");
        }
        System.out.print("\nSecond Array is :-   ");
        for(int i=0;i<n2;i++){
            System.out.print(arr2[i]+"  ");
        }

        Common.FindArrayCommonElement(arr1,arr2,n1,n2);

        a.close();
    }
}
