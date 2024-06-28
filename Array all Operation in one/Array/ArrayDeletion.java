package Array;

import java.util.Scanner;

public class ArrayDeletion {
    public static int[] delete(int[] arr, Scanner sc) { 
        int rp = 1;
        
        while (rp == 1) {
            ClearDisplay.clear();
            ArrayDisplay.display(arr);
            if (arr.length == 0) {
                System.out.println("Array is already empty.");
                return arr;
            }
            
            System.out.println("Enter your choice to delete: ");
            System.out.println("1. Delete at beginning\n2. Delete at end\n3. Delete at  given index\n4. Delete at after and before in given element from  array");
            int choice = sc.nextInt();
            int n = arr.length - 1;
            int[] newArr = new int[n];

            switch (choice) {
                case 1 -> {
                    
                    System.arraycopy(arr, 1, newArr, 0, n);
                }
                case 2 -> {
                   
                    System.arraycopy(arr, 0, newArr, 0, n);
                }
                case 3 -> {
                    System.out.println("Enter the index at which to delete the value:");
                    int index = sc.nextInt();
                    if (index < 0 || index >= arr.length) {
                        System.out.println("Invalid index. Please try again.");
                        continue;
                    }
                    System.arraycopy(arr, 0, newArr, 0, index);
                    System.arraycopy(arr, index + 1, newArr, index, n - index);
                }
                case 4 -> {
                    System.out.println("Enter an element from the array to delete along with its previous and next elements:");
                    int element = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == element) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1 || index == 0 || index == arr.length - 1) {
                        System.out.println("Element not found in array or has no preceding or following elements. Please try again.");
                        continue;
                    }
                    n = arr.length - 3; 
                    newArr = new int[n];
                    System.arraycopy(arr, 0, newArr, 0, index - 1); 
                    System.arraycopy(arr, index + 2, newArr, index - 1, arr.length - index - 2); 
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            }

            arr = newArr;

            System.out.println("Press 1 to continue or any other key to exit: ");
            rp = sc.nextInt();
        }
        return arr;
    }
}
