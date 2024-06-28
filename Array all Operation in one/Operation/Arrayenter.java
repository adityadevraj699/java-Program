package Operation;

import java.util.Scanner;

public class Arrayenter {
    public static int[] array(Scanner sc) {
        System.out.println("Enter the size of the new array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
