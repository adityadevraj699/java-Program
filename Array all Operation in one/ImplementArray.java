import java.util.Scanner;
import Array.*;
import Operation.*;

public class ImplementArray {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            int Maximum = Integer.MIN_VALUE;
            int SecondMaximum = Integer.MIN_VALUE;
            int Minimum = Integer.MIN_VALUE;
            int SecondMinimum = Integer.MIN_VALUE;
            System.out.println("Enter the size of array: ");
            int n = obj.nextInt();
            int[] array = new int[n];
            System.out.println("Enter elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = obj.nextInt();
            }
            

            System.out.println("Display the array: ");
            ArrayDisplay.display(array);

            int repeat = 1;
            while (repeat == 1) {
                System.out.println("Enter your choice: ");
                System.out.println("1. Insertion\n2. Deletion\n3. Concatenate of  two Array\n4. Marge a array\n5. Reverse the Array\n6. Maximun and Second Maximun Element in array\n7. Minimum and Second Minimun Element in array");
                int choice = obj.nextInt();

                array=switch (choice) {
                    case 1 -> ArrayInsertion.insert(array, obj);              
                    case 2 -> ArrayDeletion.delete(array, obj); 
                    case 3 ->Concatenate.join(array,obj);
                    case 4->Marge.sortarrayadd(array,obj);
                    case 5->Inverse.ArrayReverse(array);
                    case 6->{
                        int[] result = MaxAndSecondMax.findMaxAndSecondMax(array);
                        Maximum=result[0];
                        SecondMaximum = result[1];
                        System.out.println("Maximun :- " +Maximum);
                        System.out.println("Second Maximun :- "+SecondMaximum);
                        yield array;
                    }
                    case 7->{
                        int[] resultmin=MinAndSecondMin.findMinAndSecondMin(array);
                        Minimum=resultmin[0];
                        SecondMinimum = resultmin[1];
                        System.out.println("Maximun :- " +Minimum);
                        System.out.println("Second Maximun :- "+SecondMinimum);
                        yield array;

                    }
                    default -> {
                        System.out.println("Wrong choice.");
                        System.exit(0);
                        yield array;
                    }
                };
                ClearDisplay.clear();
                ArrayDisplay.display(array);
                
                System.out.println("If you want to continue this process ArrayImplementation & Operation , press 1, otherwise press any other key: ");
                repeat = obj.nextInt();
                int[] result = MaxAndSecondMax.findMaxAndSecondMax(array);
                Maximum=result[0];
                SecondMaximum= result[1];
                int[] resultmin=MinAndSecondMin.findMinAndSecondMin(array);
                Minimum=resultmin[0];
                SecondMinimum = resultmin[1];
                
            }
            ClearDisplay.clear();
            ArrayDisplay.display(array);
            System.out.println("Maximun :- " +Maximum);
            System.out.println("Second Maximun :- "+SecondMaximum);
            System.out.println("Maximun :- " +Minimum);
            System.out.println("Second Maximun :- "+SecondMinimum);
            

        }
    }
}
