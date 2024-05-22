import java.util.*;
public class TriangleReverse {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter a size of Triangle :-  ");
        int n=ab.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
    }
}
