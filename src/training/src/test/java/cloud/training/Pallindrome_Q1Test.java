package cloud.training;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.training.pallindrome_Q1.Pallindrome_Q1;

public class Pallindrome_Q1Test {
	
	
	@Test
	public void convertTest()
	{
		int x=1881;
		boolean pal = Pallindrome_Q1.convert(x);
		assertEquals(true, pal);
		
	}

	@Test
	public void convertNTest()
	{
		int y=21121;
		boolean npal = Pallindrome_Q1.convert(y);
		assertEquals(true, npal);
	}
}
