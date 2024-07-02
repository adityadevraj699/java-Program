import java.util.Scanner;

public class SwitchExpression1 
    {    
public static void main(String[] args) 
{  
Scanner obj=new Scanner(System.in);  
System.out.print("enter any alfabate at A (a) to Z (z) :   ");
char ch=obj.next().charAt(0);    
String result=switch(ch)  
{  
case 'a','A'-> "Vowel"  ;
case 'e','E' -> "Vowel" ;  
case 'i','I' -> "Vowel" ;
case 'o','O' -> "Vowel" ;
case 'u','U' -> "Vowel" ;  
default ->  "Consonant" ;
} ;
System.out.println(result);
obj.close();
}    

}   
