import java.util.Scanner;
public class ArrayMajority {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int flag=0, index=0;
        System.out.print("Enter a size of Array :- ");
        int n=obj.nextInt();
        int array[]=new int[n];
        System.out.println("Enter a element in array :- ");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }

        int max=array[0];
        for(int i=1;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("maximun :-   "+max);
        int temp[]=new int[max+1];
        for(int i=0;i<n;i++){
            temp[array[i]]+=1;
           // System.out.println("index   :-   "+temp[i]);
        }
        for(int i=0;i<=max;i++){
            if(temp[i]>(n/2)){
                flag=1;
                index=i;
            }
        }
        if(flag==1){
            System.out.println("yes  :-   "+index);
        }
        else{
            System.out.println("no !");
        }
        obj.close();
    }
}
