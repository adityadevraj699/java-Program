package Operation;

import java.util.Scanner;
import Array.ArrayDisplay;
import Array.ClearDisplay;

public class Marge {
    public static int[] sortarrayadd(int[] arr, Scanner sc) {
        int rep = 1;
        while (rep == 1) {
            ClearDisplay.clear();
            ArrayDisplay.display(arr);
            int[] newArr = Arrayenter.array(sc);
            int n = arr.length;
            int m = newArr.length;
            arr=Arraysort.sort(arr, sc);
            newArr=Arraysort.sort(newArr, sc);

            int[] merge = new int[n + m];
            int i = 0, j = 0, k = 0;

            
            while (i < n && j < m) {
                if (arr[i] <= newArr[j]) {
                    merge[k++] = arr[i++];
                } else {
                    merge[k++] = newArr[j++];
                }
            }
            
            while (i < n) {
                merge[k++] = arr[i++];
            }
            
            while (j < m) {
                merge[k++] = newArr[j++];
            }

            arr = merge;
            

            System.out.println("Press 1 if you want to continue merge process, otherwise press any other key: ");
            rep = sc.nextInt();
        }
        return arr;
    }
}
