import java.util.*;
class SquarePattern{
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter a size of Square :-  ");
        int a=ab.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){

                System.out.print(" * ");

            }
            System.out.println("");
        }
    }
}