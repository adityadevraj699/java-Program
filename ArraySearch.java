import java.util.Scanner;

class ArraySearch{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int i;
        Scanner a=new Scanner(System.in);
        int array[]=new int[100];
        System.out.print("Enter a size of array :-  ");
        int n=a.nextInt();
        System.out.println("Enter a Array :- ");
        for(i=0;i<n;i++){
            array[i]=a.nextInt();
        }
        System.out.print("Display a array :- ");
        for(i=0;i<n;i++){
            System.out.print(array[i]+ "  ");
        }
        System.out.print("\nEnter a searching element :-  ");
        int k=a.nextInt();
        for(i=0;i<n;i++){
            if(array[i]==k){
                System.out.println("yes Element is present in Array .");
                break;
            }
            
        }
        if(i==n){
            System.out.println("Data not found");
        }

        a.close();
    }

}