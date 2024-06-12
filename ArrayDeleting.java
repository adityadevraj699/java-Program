import java.util.Scanner;

public class ArrayDeleting {
   public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
        System.out.println("Enter a size of array :- ");
        int n=obj.nextInt();
        
        int array[]=new int[n];
        System.out.println("Enter a array element :- ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("Enter a deleting element :- ");
        int del=obj.nextInt();
        int newarray[]=deleting(array,n,del);
        System.out.println("After deleting a element :- ");
        for(int i=0;i<newarray.length;i++){
            System.out.print(newarray[i]+ " ");
        }
        obj.close();
   } 
   public static int[] deleting(int array[],int n,int del){
    int occ=0;
    for(int i=0;i<n;i++){
        if(array[i]==del){
            occ++;
        }
    }
    if(occ==0)return array;
    int newsize=array.length-occ;
    int newarray[]=new int[newsize];
    int i=0,j=0;
    while(i<n){
        if(array[i]!=del){
            newarray[j]=array[i];
            j++;
        }
        i++;
    }
    
    return newarray;
   }
}
