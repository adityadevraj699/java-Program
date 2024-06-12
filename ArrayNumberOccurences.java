import java.util.Scanner;

public class ArrayNumberOccurences {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a size of array :- ");
        int n=obj.nextInt();
        int array[]=new int[n];
        System.out.println("Enter a array element :- ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("Enter a Occurences number :- ");
        int occ=obj.nextInt();
        int num=occurence(array,n,occ);
        System.out.println("total number occurence is :- "+num);
        obj.close();
    }
    public static int occurence(int array[],int n,int occ){
        int num=0;
        for(int i=0;i<n;i++){
            if(array[i]==occ){
                num++;
            }
        }
        return num;
    }
}
