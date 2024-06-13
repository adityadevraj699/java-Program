import java.util.Scanner;

public class ArraySearchMatrix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a size of row :- ");
        int n=obj.nextInt();
        System.out.print("Enter a size of column :-");
        int m=obj.nextInt();
        int array[][]=new int[n][m];
        System.out.println("Enter a 2D-Array :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=obj.nextInt();
            }
        }
        System.out.println("Display a array :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+ "   ");
            }
            System.out.println("\n");
        }
        System.out.print("Enter a element to search :-");
        int search=obj.nextInt();
        boolean num=search(array,n,m,search);
        if(num){
            System.out.println("YES!  element is present in array :- "+search);
        }
        else{
            System.out.println("NO!  element are not present in array .");
        }
        obj.close();
    }
    public static boolean search(int array[][],int n,int m,int search){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==search){
                    return true;
                }
            }

        }
        return false;
    }
}
