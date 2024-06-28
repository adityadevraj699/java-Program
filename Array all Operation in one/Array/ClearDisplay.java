package Array;
import java.io.IOException;
public class ClearDisplay {
    public static void clear(){
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
       
        clearConsole();

        System.out.println("Final Array is !");
    }

    public static void clearConsole() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            pb.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
