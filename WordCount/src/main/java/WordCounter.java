package main;

import java.util.*;

public class WordCounter {
	
	private Map<String,Integer> wordCounterMap = new HashMap<>();
	public Translator translator = new Translator();
	
	
	
	
	
//	RestTemplate rest = new RestTemplate();
	
	
	
	
	
	
	
	/**
	 * Method to store the word and its count if it contains only alphabets
	 * 
	 * @param words
	 */
	public void addMethod(String sentence)
	{
		ProcessString.getInstance();
		if(null != ProcessString.getInstance())
		{
			for(String word : ProcessString.getInstance().extractWords(sentence))
			{				
					if(wordCounterMap.get(word) != null )
					{
						wordCounterMap.put(word, wordCounterMap.get(word)+1); // Incrementing the count by one if the word already exist in the map
					}
					else
					{
					
						String engWord = translator.translate(word); // Translating the word to its english version
						System.out.println(engWord);
						if( wordCounterMap.get(engWord.toLowerCase()) != null)
						{
							wordCounterMap.put(engWord.toLowerCase(), wordCounterMap.get(engWord)+1);
						}
						else
						{
							wordCounterMap.put(engWord.toLowerCase(), 1); // creating new entry for the word in the map by setting its count as 1
						}						
					}
				}
			
			}
		
		System.out.println(wordCounterMap);
	}
	
	
			
	/**
	 * Method to return the count of word passed 		
	 * 
	 * @param word
	 * @return
	 */
	public int getCount(String word)
	{
		int count = 0;
		if(null!= wordCounterMap.get(word))
		{
			count = wordCounterMap.get(word);
		}
		else
		{
			String engWord = translator.translate(word.toLowerCase());	
			if(null!= wordCounterMap.get(engWord) )
			{
				count = wordCounterMap.get(engWord);
			}
		}
		return count;
	}

}
