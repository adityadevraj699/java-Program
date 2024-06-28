package Array;

import java.util.Scanner;

public class ArrayInsertion {
    public static int[] insert(int[] arr, Scanner sc) { 
        int rep = 1;
        
        while (rep == 1) {
            ClearDisplay.clear();
            ArrayDisplay.display(arr);
            System.out.println("Enter your choice to insert: ");
            System.out.println("1. Insert at beginning\n2. Insert at end\n3. Insert at index\n4. Insert at after and before in given element from  array ");
            int choice = sc.nextInt();

            int n = arr.length + 1;
            int[] newArr = new int[n];

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the value to insert at the beginning:");
                    int valueAtBeginning = sc.nextInt();
                    newArr[0] = valueAtBeginning;
                    System.arraycopy(arr, 0, newArr, 1, arr.length);
                }
                case 2 -> {
                    System.out.println("Enter the value to insert at the end:");
                    int valueAtEnd = sc.nextInt();
                    System.arraycopy(arr, 0, newArr, 0, arr.length);
                    newArr[arr.length] = valueAtEnd;
                }
                case 3 -> {
                    System.out.println("Enter the index at which to insert the value:");
                    int index = sc.nextInt();
                    if (index < 0 || index > arr.length) {
                        System.out.println("Invalid index. Please try again.");
                        continue;
                    }
                    System.out.println("Enter the value to insert at the given index:");
                    int valueAtIndex = sc.nextInt();
                    System.arraycopy(arr, 0, newArr, 0, index);
                    newArr[index] = valueAtIndex;
                    System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
                }
                case 4 -> {
                    System.out.println("Enter an element from the array to insert after and before:");
                    int element = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == element) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Element not found in array. Please try again.");
                        continue;
                    }
                    System.out.println("Enter a value to insert after the element:");
                    int after = sc.nextInt();
                    System.out.println("Enter a value to insert before the element:");
                    int before = sc.nextInt();

                    n = arr.length + 2;  
                    newArr = new int[n];
                    System.arraycopy(arr, 0, newArr, 0, index);  
                    newArr[index] = before;  
                    newArr[index + 1] = element; 
                    newArr[index + 2] = after;
                    System.arraycopy(arr, index + 1, newArr, index + 3, arr.length - index - 1);  
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }

            }

            arr = newArr;
            

            System.out.println("Press 1 to continue or any other key to exit: ");
            rep = sc.nextInt();
            
        }

        return arr;
    }
}
