package countchar;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import input.InputCenter;

public class CountChar {
	
	private String countChar(String input)
	{
		TreeMap<Character,Integer> map = new TreeMap<>();
		
		int length = input.length();
		
		for(int i = 0 ; i < length ; i++)
		{
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i),0)+1);
			

		}
		
		StringBuilder build = new StringBuilder();
		
		for(Map.Entry<Character, Integer> value : map.entrySet())
		{
			build.append(value.getKey()).append(value.getValue());
		}
		
		return build.toString();
	}
	
	public static void main(String[] args)
	
	{
		CountChar countChar = new CountChar();
		
		InputCenter input = new InputCenter();
		
		System.out.println(countChar.countChar(input.getString("input")));
	}
}
