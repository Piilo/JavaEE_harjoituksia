package testausHarjoituksia;

import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

	@Mock
	Driver mockKuski;

	@Mock
	Engine mockEngine;

	@Mock
	Engine mockEngine2;

	@Mock
	Engine mockEngine3;

	@Before
	public void setUp() {
		when(mockEngine.getBrokenCylinders()).thenReturn(3);
		when(mockEngine.getCylinders()).thenReturn(6);
		when(mockEngine2.getBrokenCylinders()).thenReturn(0);
		when(mockEngine2.getCylinders()).thenReturn(6);
		when(mockEngine3.getBrokenCylinders()).thenReturn(4);
		when(mockEngine3.getCylinders()).thenReturn(4);
		// when(mockEngine.setBrokenCylinders(anyInt())).thenReturn(3);
	}

	@Test
	/*
	 * Testataan laskeNopeus, kun nopeus on 0;
	 */
	public void testLaskeNopeus() {
		Car testiAuto = new Car("Mersu", "xxx", 0, mockEngine, mockKuski);
		double arvo = testiAuto.laskeNopeus();
		assertEquals(0, arvo, 0.0001);
	}

	@Test
	/*
	 * Testataan normaalitapaus, sylintereitä rikki 3/6
	 */
	public void testLaskeNopeus2() {
		Car testiAuto = new Car("Mersu", "xxx", 300, mockEngine, mockKuski);
		double arvo = testiAuto.laskeNopeus();
		assertEquals(150, arvo, 0.0001);
	}

	@Test
	/*
	 * Testataan normaalitapaus, sylintereitä rikki 0/6
	 */
	public void testLaskeNopeus3() {
		Car testiAuto = new Car("Mersu", "xxx", 300, mockEngine2, mockKuski);
		double arvo = testiAuto.laskeNopeus();
		assertEquals(300, arvo, 0.0001);
	}

	@Test
	/*
	 * Testataan kun kaikki sylinterit on rikki
	 */
	public void testLaskeNopeus4() {
		Car testiAuto = new Car("Mersu", "xxx", 300, mockEngine3, mockKuski);
		double arvo = testiAuto.laskeNopeus();
		assertEquals(0, arvo, 0.0001);
	}

}
