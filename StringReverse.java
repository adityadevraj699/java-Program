//import java.io.*;
public class StringReverse {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String a ="Aditya",b="";
        char c;
        for(int i=0;i<a.length();i++){
            c=a.charAt(i);
            System.out.println(c);
            b=c+b;
            System.out.println(c);
        }
        
        System.err.println(b);


    }
}
