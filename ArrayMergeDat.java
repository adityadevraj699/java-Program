import java.util.Scanner;

public class ArrayMergeDat {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a size of array 1 :- ");
        int n=obj.nextInt();
        System.out.println("Enter a size of array 2 :- ");
        int m=obj.nextInt();
        int array[]=new int[n];
        int array1[]=new int[m];
        System.out.println("Enter a Array 1 :- ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("Enter a Array 2 :- ");
        for(int i=0;i<m;i++){
            array1[i]=obj.nextInt();
        }
        merge(array,array1,n,m);
        
        obj.close();
    }
    public static void merge(int a[],int b[],int n,int m){
        int merge[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]>=b[j]){
                merge[k]=b[j];
                j++;
            }
            else{
                merge[k]=a[i];
                i++;
            }
            k++;
            
        }
        while(i<n){
            merge[k]=a[i];
            k++;
            i++;
        }
        while(j<m){
            merge[k]=b[j];
            k++;
            j++;
        }
        System.out.println("Merge array :- ");
        for(i=0;i<m+n;i++){
            System.out.print(merge[i]+ " ");
        } 
    }
}
