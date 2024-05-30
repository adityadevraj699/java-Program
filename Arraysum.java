import java.util.Scanner;

public class Arraysum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int Array[]=new int[5];
        for(int i=0;i<4;i++){
            Array[i]=a.nextInt();
        }
        for(int i=0;i<4;i++){
            if((Array[i]+Array[i+1])==9){
                System.out.print(i+" "+(i+1));
                break;
            }
        }
        a.close();
    }
}
