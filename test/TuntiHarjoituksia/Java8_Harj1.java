/**
 * 
 */
package TuntiHarjoituksia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * @author oppi
 *
 */
public class Java8_Harj1 {
	
	final static List<Integer> numbers = Arrays.asList(5,10,15,20,11,16,21,26,25,3); 

	@Test
	public void collectEvenNumbers() {
		
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		
		//.map(n -> tee kaikille alkioille jtn)
		
		
		assertEquals((Integer)evenNumbers.size(), (Integer)4); 

	}
	
	@Test
	public void collectOddNumbers() {
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n %2 != 0).collect(Collectors.toList());
		
        assertEquals((Integer)evenNumbers.size(), (Integer)6); 
	}
	
	@Test
	public void sortArray() {
		
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        assertEquals(sortedList.get(0), (Integer)3); 
        assertEquals(sortedList.get(4), (Integer)15); 
        assertEquals(sortedList.get(numbers.size()-1), (Integer)26); 
		//fail("Not yet implemented");
	}
	

}
