package main;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessString {
	
	private static ProcessString processString = null;
	
	private ProcessString()
	{
		
	}

	public static ProcessString getInstance()
	{
		if(null == processString)
		{
			processString = new ProcessString();
		}
		return processString;
	}
	
	public List<String> extractWords(String sentence)
	{
		String [] words = sentence.split("\\s+");
		
		return Arrays.stream(words).filter(s->s.matches("[a-zA-Z]+")).map(str -> str.toLowerCase()).collect(Collectors.toList()); 
				
	}
}
