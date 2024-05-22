import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner ab= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter a size of array :-  ");
        int n=ab.nextInt();
        System.out.println("Enter a element of array :- ");
        try{
        for(int i=0;i<n;i++){
            arr[i]=ab.nextInt();
        }
        System.out.println("Display a element of array :- ");
        
             for(int i=0;i<n;i++)
             {
            System.out.print(arr[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException .");
        }
        finally{
            System.out.println("Always print because its in final .");
        }

        String a ="aditya";
        try{
        int m=Integer.parseInt(a);
        System.out.println("Integer :- "+m);
        }
        catch(NumberFormatException e){
            System.out.println("this is string but not a numerical string so its can't change in Integer .");
        }
        try{
            System.out.println("element is :-  "+arr[4]);
            System.out.println("element2 is :-  "+arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of index value ");

        }
        
    
       
       

    }
}
