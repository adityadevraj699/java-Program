import java.util.Scanner;

public class FibbonaciSeriesRecursion {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your length :- ");
        int position =obj.nextInt();
        for(int i=1;i<=position;i++){
            System.out.println(fibbonacci(i)+" ");
        }
        obj.close();
    }
    public static int fibbonacci(int position){
        System.out.print(" ");
    if(position==1){
        return 0;
    }
    if(position==2){
        return 1;
    }
    return fibbonacci(position-1)+fibbonacci(position-2);
}

}
