import java.util.*;
public class MissingElementFinder {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int a=0,b=0;
        int A[]=new int[100];
        for(int i=1;i<5;i++){
            A[i]=obj.nextInt();
        }
        for(int i=1;i<=5;i++){
            a=a+i;
        }
        for(int i=1;i<5;i++){
            b=b+A[i];
        }
        System.out.print(a-b);

        obj.close();

    }
}
