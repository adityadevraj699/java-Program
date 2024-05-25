import java.util.Scanner;
class Marge{
    public void M(int array1[],int array2[],int m,int n1,int n2){
        int Marge[]=new int[m];

        for(int i=0;i<n1;i++){
            Marge[i]=array1[i];
        }
        for(int i=0;n1<m;i++){
            Marge[n1]=array2[i];
            n1++;
        }

        System.out.print("Marge Array is :-    ");
        for(int i=0;i<m;i++){
            System.out.print(Marge[i]+" ");
        }
    }
}
public class ArrayMarge {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
		int array1[] =new int[100];
        int array2[]=new int[100]; 
		System.out.print("Enter a size of array1 :-  ");
        int n1=a.nextInt();
        System.out.println("Enter array1 element :- ");
        for(int i=0;i<n1;i++){
            array1[i]=a.nextInt();
        }
        System.out.print("Enter a size of array2 :-  ");
        int n2=a.nextInt();
        System.out.println("Enter array2 element :- ");
        for(int i=0;i<n2;i++){
            array2[i]=a.nextInt();
        }

        int m=n1+n2;

        Marge ab=new Marge();
        ab.M(array1,array2,m,n1,n2);
        a.close();
    }
}
