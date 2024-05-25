public class NumberException {
    public static void main(String Args[])
	{
		try
		{
		int num=Integer.parseInt("Amit");
		System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception");
	}
}
}
