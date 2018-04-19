package cloud.training;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.pallindrome_Q1.Pallindrome_Q1;

public class StringReverseTest {
	
	Pallindrome_Q1 pallindrome;
	
	@BeforeClass
	public void init() {
		pallindrome = new Pallindrome_Q1();
	}


	@Test
	public void checkNumberIsNotPalindrome() {
		
		int nonPal = 121212;
		
		boolean bool = pallindrome.convert(nonPal);
		
		assertEquals(false, bool);
		
		
	}
	
	@Test
	public void checkNumberIsPalindrome() {
		
		int pal = 121;
		
		boolean bool = pallindrome.convert(pal);
		
		assertEquals(true, bool);
		
		
	}
	
	
}
