public class FinalException {
    public static void main(String args[])
	{
		int a=10,b;
		try
		{
			b=Integer.parseInt(args[0]);
			int ans=a/b;
			System.out.println("The ans is" +ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is genrating" +e);
			
	}
	finally
		{
			System.out.println("Always gets Executed");
		}
		System.out.println("After Try Block");
}
}
