import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Array[] = new int[100];
        System.out.print("Enter a size of array: ");
        int n = obj.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            Array[i] = obj.nextInt();
        }
        System.out.println("Display array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + "  ");
        }

        boolean palindrome = isPalindrome(Array, n);
        if (palindrome) {
            System.out.println("\nYES! The array is a palindrome.");
        } else {
            System.out.println("\nNO! The array is not a palindrome.");
        }

        obj.close();
    }

    public static boolean isPalindrome(int array[], int n) {
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
