import java.util.Scanner;
class Array7{
    public int Pick(int arr1[],int m)
    {
        if(m==1){
            return 0;
        }
        else if(arr1[0]>=arr1[1]){
            return 0;
        }
        if (arr1[m - 1] >= arr1[m - 2]){
            return m- 1;
        }
        for(int i=1;i<m;i++){
            if((arr1[i]>arr1[i-1] && arr1[i]>arr1[i+1])||arr1[i]>arr1[i-1] ) {
                return i;
            }
        }  
        return 0;  

    }
}
public class ArrayPeak {
    public static void main(String[] args) {
        
        Scanner a= new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter a size of Array :-  ");
        int n=a.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=a.nextInt();
        }
        System.out.println("The Array is :-  ");
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println(" ");
        
        Array7 ab=new Array7();
        System.out.println("The peak value of array and neighbours elewment are smaller Index is  :-  " +ab.Pick(arr,n));
    }


    
}
