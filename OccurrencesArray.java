import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int[] arr={2,3,4,5,3,7,4,2,4,2,2,2};
        System.out.println("enter your search element in array :- ");
        int element =obj.nextInt();
        int occ=countOccurrences(arr,element);
        System.out.println("your element was found is :- "+occ+" times.");
        obj.close();
    }
    public static int countOccurrences(int[] arr,int element){
        int occ=0;
        for(int num : arr){
            if(num==element){
                occ++;
            }
        }
        return occ;
    }
}
