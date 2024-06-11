import java.util.Scanner;
abstract class Demo{
    public abstract int Addition(int a,int b);
    public abstract int Subtraction(int a,int b);
    public abstract int Multiplication(int a,int b);
    public abstract int Division(int a,int b);
}
abstract class add extends Demo{
   
    public int Addition(int a,int b) {
        a +=b;
       System.out.println("addition :- "+a);
       return a;
        
    }
}
abstract class sub extends add{

    public int Subtraction(int a,int b) {
        a -=b;
       System.out.println("Subtraction :- "+a);
       return a;
        
    }
}
abstract class mul extends sub{

    public int Multiplication(int a,int b) {
        a *=b;
        System.out.println("Multiplication :- "+a);
        return a;
        
    }
}

class div extends mul{
    public int Division(int a,int b) {
       if(b!=0){
        a/=b;
        System.out.println("Division :- "+a);
        return a;
       }
       else{
        System.out.println("invalit input b!=0");
        System.exit(0);
        return 0;
       }
        
    }

}
public class AbstractCalculator {
 
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your first number :- ");
    int num1 =obj.nextInt();
    System.out.println("Enter your Secound number :- ");
    int num2=obj.nextInt();
    Demo obj1=new div();
    
    int choice1=1;
    int i=2;
    while (choice1==1) {
        if(i>2){
            System.out.println("enter your "+i+"th number :- ");
            int s=obj.nextInt();
            num2=s;
        }
        System.out.println("Enter your choice :- ");
        System.out.println("1.addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int choice=obj.nextInt();
        switch (choice) {
            case 1:
            int p1=obj1.Addition(num1,num2);
            num1=p1;
           i++;
           break;
           case 2:
            int p2=obj1.Subtraction(num1,num2);
            num1=p2;
           i++;
           break;
           case 3:
            int p3=obj1.Multiplication(num1,num2);
            num1=p3;
           i++;
           break;
           case 4:
            int p4=obj1.Division(num1,num2);
            num1=p4;
           i++;
           break;
           default:
               break;
           }
           System.out.println("press '1' continue to calculation :- ");
           choice1=obj.nextInt();
    }
    System.out.println("Exit calculation .");
    
    
    obj.close();
  }

 
}
