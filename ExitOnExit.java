import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("welcome to Exit on Exit !");
        while (true) {
            System.out.print("enter your command : ");
            String command=obj.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
            
        }
        System.out.println("succesfully exit !");
        obj.close();
    }
}
