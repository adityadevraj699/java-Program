public class ThrowException {
    public static void main(String args[])
	{
		int a,b;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			if((b<=0 || a<0))
				throw new ArithmeticException();
			int ans=a/b;
			System.out.println("The ans is:" +ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry we could divide both number should be non-zero positive");
		}
	}
}
