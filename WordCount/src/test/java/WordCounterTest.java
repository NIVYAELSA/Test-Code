package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.WordCounter;

public class WordCounterTest {
	
	WordCounter wordCounter; 
	@BeforeEach
	void setup()
	{
		wordCounter = new WordCounter();
	}
	
	@Test
	void countTest()
	{
		String sentence = "hi hello h89i flower hello flor hey blume";
		wordCounter.addMethod(sentence);
		assertAll( "Count check",()->assertEquals(3, wordCounter.getCount("flower")), ()->assertEquals(1, wordCounter.getCount("flower")),
				()->assertEquals(1, wordCounter.getCount("h891")));
	}
	

}
