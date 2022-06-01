package input;
import java.util.*;

public class InputCenter {

	Scanner sc = new Scanner(System.in);
	
	public String getString(String input)
	{
		System.out.println(input);
		
		try {
			String value = sc.nextLine();
			if(!value.isEmpty())
			{
				return value;
			}
		}
		catch(Exception e)
		{
			sc.nextLine();
			System.out.println("String input only");
		}
		return getString(input);
	}
	
	public int getInt(String input)
	{
		System.out.println(input);
		try {
			int value = sc.nextInt();
			sc.nextLine();
			return value;
		}
		catch(Exception e)
		{
			sc.nextLine();
			System.out.println("integer input only");
		}
		return getInt(input);
	}
	
	public long getLong(String input)
	{
		System.out.println(input);
		
		try {
			long value = sc.nextLong();
			sc.nextLine();
			return value;
		}
		catch(Exception e)
		{
			sc.nextLine();
			System.out.println("long input only");
		}
		return getLong(input);
	}
	
	public boolean getBoolean(String input)
	{
		System.out.println(input);
		
		try {
			boolean value = sc.nextBoolean();
			sc.nextLine();
			return value;
		}
		catch(Exception e)
		{
			sc.nextLine();
			System.out.println("boolean input only");
		}
		return getBoolean(input);
	}
	
	public double getDouble(String input)
	{
		System.out.println(input);
		
		try {
			double value = sc.nextDouble();
			sc.nextLine();
			return value;
		}
		catch(Exception e)
		{
			sc.nextLine();
			System.out.println("double input only");
		}
		return getDouble(input);
	}
}
