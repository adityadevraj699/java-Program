package Operation;

import java.util.Scanner;

import Array.ArrayDisplay;
import Array.ClearDisplay;

public class Concatenate {
    public static int[] join(int[] arr, Scanner sc) { 
        int rep=1;
        while (rep==1) {
            ClearDisplay.clear();
            ArrayDisplay.display(arr);
            int[] newArr = Arrayenter.array(sc); 
            int n = newArr.length + arr.length;
            int[] conArray = new int[n];
            System.arraycopy(arr, 0, conArray, 0, arr.length);
            System.arraycopy(newArr, 0, conArray, arr.length, newArr.length);

            System.out.println("press 1 if you want to continue Concatenate array otherwise press any key :- ");
            rep=sc.nextInt();
            arr = conArray;
            
        }
        
        return arr;
    }
}

