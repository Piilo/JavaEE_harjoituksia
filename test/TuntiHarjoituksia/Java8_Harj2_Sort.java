package TuntiHarjoituksia;



import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class Java8_Harj2_Sort {
	
	final static List<Worker> disneyWorkers = Arrays.asList( 
	        new Worker("Duck, Donald", "1934-05-21"), 
	        new Worker("Mouse, Mickey", "1928-11-18"), 
	        new Worker("Goofy", "1932-06-01"), 
	        new Worker("Black, Pete", "1925-06-01"), 
	        new Worker("McDuck, Scrooge", "1947-12-01"), 
	        new Worker("Duck, Louie", "1937-06-01"), 
	        new Worker("Duck, Huey", "1937-06-01"), 
	        new Worker("Duck, Dewey", "1937-06-01"), 
	        new Worker("Duck, Daisy", "1940-06-01"), 
	        new Worker("Duck, Grandma", "1943-06-01"), 
	        new Worker("Gander, Gladstone", "1948-01-01"), 
	        new Worker("Goose, Gus", "1939-05-03"), 
	        new Worker("Pluto", "1930-06-01"), 
	        new Worker("Mouse, Minnie", "1928-11-18"), 
	        new Worker("Horsecollar, Horace", "1929-06-01"), 
	        new Worker("Gearloose, Gyro", "1952-05-01"), 
	        new Worker("Helper, Little", "1956-06-01"), 
	        new Worker("Beeva, Eega", "1947-05-01"), 
	        new Worker("O'Hara, Chief", "1935-06-01"), 
	        new Worker("Blot, Phantom", "1939-05-20") 
	        );




	@Test
	public void test() {
		
		Collections.sort(disneyWorkers, new Comparator<Worker>(){
			@Override
			public int compare(Worker worker1, Worker worker2){
				return worker1.getName().compareTo(worker2.getName());
			}
		});
		
		assertEquals(disneyWorkers.get(0).toString(), new Worker("Beeva, Eega", "1947-05-01").toString()); 
	    assertEquals(disneyWorkers.get(9).toString(), new Worker("Gander, Gladstone", "1948-01-01").toString());
	    assertEquals(disneyWorkers.get(disneyWorkers.size()-1).toString(), new Worker("Pluto", "1930-06-01").toString());
	}
	
	@Test
	public void test2() {
		
		
	//	List<Worker> sorted = Arrays.copyOf(disneyWorkers,disneyWorkers.size());
	//	Arrays.sort(disneyWorkers, (Worker w1, Worker w2) -> w1.getName()compareTo(w2.getName()) );
		
		Collections.sort(disneyWorkers, new Comparator<Worker>(){
			@Override
			public int compare(Worker worker1, Worker worker2){
				return worker1.getName().compareTo(worker2.getName());
			}
		});
		
		assertEquals(disneyWorkers.get(0).toString(), new Worker("Beeva, Eega", "1947-05-01").toString()); 
	    assertEquals(disneyWorkers.get(9).toString(), new Worker("Gander, Gladstone", "1948-01-01").toString());
	    assertEquals(disneyWorkers.get(disneyWorkers.size()-1).toString(), new Worker("Pluto", "1930-06-01").toString());
	}

}
