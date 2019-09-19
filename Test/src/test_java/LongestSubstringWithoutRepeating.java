package test_java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) 
	{
		String str = "AABBCDDEF";
		String ss =longestUniqueSubsttr(str);
		//System.out.println(ss);

	}
	public static String longestUniqueSubsttr(String input)
	{
		
		String output= "";
		for(int start = 0; start <input.length(); start++)
		{
			Set<Character> visit = new HashSet<Character>();
			int end = start;
			for(; end<input.length(); end++)
			{
				char ch = input.charAt(end);
				if(!visit.contains(ch))
				{
					visit.add(ch);
				}
				else break;
			}
			if(output.length()<end-start+1)
			{
				output = input.substring(start, end);
				System.out.println(output);
				
			}
		}
				
		return output;
	}
}
