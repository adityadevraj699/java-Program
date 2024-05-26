import java.util.Scanner;

class ArithmeticCalculator{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter a First number :-  ");
        double num1=a.nextDouble();
        System.out.print("Enter a Second number :-  ");
        double num2=a.nextDouble();

       
        int choice1=1;
        int i=2;
        
        while(choice1==1){
            if(i>2){
                System.out.print("Enter your "+i+"th number :-   ");
                int s=a.nextInt();
                num2=s;
            }
            System.out.println("Enter your Choice :-");
            System.out.println("1. Addition  \n\n2. Subtraction  \n\n3. Multiply  \n\n4. Divide  ");
            int choice = a.nextInt();
        if(choice==1){
            num1=num1+num2;
            System.out.println("Total sum of number is :- "+num1);
            i++;
        }
        else if(choice==2){
            num1=num1-num2;
            System.out.println("Total subtraction number is :- "+num1);
            i++;
        }
        else if(choice==3){
            num1=num1*num2;
            System.out.println("Total Multiply of number is :-  "+num1);
            i++;
        }
        else if (choice==4){
            num1=num1/num2;
            System.out.println("Total divide of number is :- "+num1);
            i++;
        }
        else{
            System.out.println("Default choice please select correct input. ");
        }
        System.out.println("\n\nPress 1 to continue of calculation :- ");
        choice1=a.nextInt();
        
    }
        a.close();
    }

}