import java.util.Scanner;

public class ArrayMatrixSwap {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int Array[][]=new int[100][100];
        int temp[]=new int[100];
        System.out.print("Enter a size of row in Matrix :-  ");
        int n=a.nextInt();
        System.out.print("Enter a size of column in Matrix :-  ");
        int m=a.nextInt();
        System.out.println("Enter a Element in Matrix :- ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                Array[i][j]=a.nextInt();
            }
        }
        System.out.println("Display a Original Matrix :- ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(Array[i][j]+"  ");
            }
            System.out.println("");
        }

        
        int choice;
        System.out.println("Enter your choice to change a Matrix :- ");
        System.out.println("1.   Row\n2.   Coloum");
        System.out.print("Choice :-");
        choice=a.nextInt();
        if(choice==1){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1){
                    temp[j]=Array[i][j];
                    Array[i][j]=Array[n][j];
                    Array[n][j]=temp[j];
                }
            }
        }
        System.out.println("Display a Swapped Matrix in row :- ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(Array[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    else if(choice==2){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1){
                    temp[i]=Array[i][j];
                    Array[i][j]=Array[i][m];
                    Array[i][m]=temp[i];
                }
            }
        }
        System.out.println("Display a Swapped Matrix in Column :- ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(Array[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    else{
        System.out.println("please Enter a valid value .");
    }
        a.close();
    }
}
