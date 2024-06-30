import java.util.Scanner;

public class GuessingGame {

    int random;
    GuessingGame(){
        this.random=(int)Math.ceil(Math.random()*100) ;
    }
    int guess(int guessNumber){
        return guessNumber-random;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game= new GuessingGame();
        System.out.println("Welcome to the Guessing game guess this umber between 1 to 100 !");
        int guess,guessNumber,attempt=1;
        while(true){
            System.out.print("Enter your guess your number :  ");
            guess= input.nextInt();
            guessNumber=game.guess(guess);
            if(guessNumber==0){
                System.out.printf("Hurry ! you guess this number at %d attempted : %d",attempt,guess);
                break;
            } else if (guessNumber<0) {
                System.out.println("please guess higher number ! ");
            }
            else {
                System.out.println("please guess lower Number !");
            }
            attempt++;
        }

        input.close();
    }
}
