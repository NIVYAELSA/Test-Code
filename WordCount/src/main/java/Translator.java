package main;

public class Translator {

	public String translate(String word)
	{
		String flower = "flower";
		if(word.equals("blume") || word.equals("flor"))
		{
			return flower;
		}
		return word;
	}
	
	
}
