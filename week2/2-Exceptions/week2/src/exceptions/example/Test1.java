package exceptions.example;

public class Test1
{
	public static void main(String[] args)
	{
		try
		{
			int x = 0;
			int y = 5 / x;
		}
		catch (Exception e)
		{
			System.out.println("-exception-");
		}

		System.out.println("-finished-");
	}
}