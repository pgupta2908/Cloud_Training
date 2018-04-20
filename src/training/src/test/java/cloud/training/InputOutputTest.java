package cloud.training;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.training.d19042018_inputOutput_Q1.InputOutput_Q1;

public class InputOutputTest {

	@BeforeClass
	public void init()
	{
		InputOutput_Q1 ioObj = new InputOutput_Q1();
	}
	
	@Test
	public <T> void printOutputTest(List<T> list)
	{
		InputOutput_Q1 ioObj = new InputOutput_Q1();
		String[] list1 = ["gya123", "yuq11", "hjk1"];
		list1 = ioObj.printOutput(list1);
		assertArrayEquals("unknown ", list1, ["gya123", "yuq11", "hjk1"]);
	}
}
