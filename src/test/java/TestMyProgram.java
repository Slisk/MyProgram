import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestMyProgram {
	MyProgram mp = new MyProgram(); 
	@Test
	public void testProgram() {
		 mp.program("Johan"); 
	}
	@Test 
	public void TestArrayLs() {
		ArrayList<String> value = new ArrayList<String>(); 
		value.addAll(Arrays.asList("a", "b", "c", "d")); 
		String temp = mp.arrayLs(value); 
		
		ArrayList<String> value2 = new ArrayList<String>(); 
		value2.addAll(Arrays.asList("A")); 
		String temp2 = mp.arrayLs(value2); 
	}
	
	


}
