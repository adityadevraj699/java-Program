// Arithmetic Exception

class ArthimaticException
{
public static void main(String args[])
{
int a=30;
int b=0;
try{
int c=a/b;
System.out.println("Result is=" +c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can not Divide by Zero");
}
}
}