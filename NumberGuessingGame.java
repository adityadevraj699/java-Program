import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);

        int num = 5,guess;
        System.out.println("Welcome to the number guessing game !");
        do{
            System.out.println("please guess the number between 0 to 10");
            guess = obj.nextInt();
        }while(num != guess);
        System.out.println("you have succesfully guessed the number !");
        obj.close();

    }
}
