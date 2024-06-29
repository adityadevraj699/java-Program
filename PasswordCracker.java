import java.util.Scanner;

public class PasswordCracker {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Welcome to set your password!");
        String password;
        
        do{
            System.out.println("please enter your password :- ");
            password = obj.next();
        }while(!isvalidPassword(password));
        System.out.println("Thanks for entering a valid password !");
        obj.close();
    }
    public static boolean isvalidPassword(String password){
        return password.length()>6;
    }
}
