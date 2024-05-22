import java.util.*;
public class PatternBorder {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter a size of row :-  ");
        int n = ab.nextInt();
        System.out.print("Enter a size of column :-   ");
        int m = ab.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }
}
