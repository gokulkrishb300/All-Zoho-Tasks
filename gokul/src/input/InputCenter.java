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
			System.out.println("INteger input only");
		}
		return getInt(input);
	}
}
