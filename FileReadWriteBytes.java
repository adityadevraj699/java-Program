import java.io.*;

public class FileReadWriteBytes {
    public static void main(String[] args) {
        try (FileOutputStream fr = new FileOutputStream("abc.txt")) {
            String text = "I am Aditya Kumar\nfrom Meerut";
            byte[] b = text.getBytes();
            fr.write(b);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
             FileOutputStream r = new FileOutputStream("ded.txt")) {
            String p;
            while ((p = br.readLine()) != null) {
                byte[] arr = p.getBytes();
                r.write(arr);
                r.write('\n');
            }
            System.out.println("Successfully copied content to ded.txt!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
