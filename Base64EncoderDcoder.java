import java .util.*;
    public class Base64EncoderDcoder
    {
    public static void main(String args[])
    {
        String sample="India team win the t20 world cup";
        System.out.println("Sample string: \n" +sample);
        String BasicBase64format=Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Encoded string is \n" +BasicBase64format);
        byte[] actualByte=Base64.getDecoder().decode(BasicBase64format);
        String actualString=new String(actualByte);
        System.out.println("actual string is \n" +actualString);
    }
    }
