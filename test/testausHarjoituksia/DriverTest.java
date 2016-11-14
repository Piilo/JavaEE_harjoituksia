package testausHarjoituksia;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import testausHarjoituksia.Driver.Ajotapa;

@RunWith(MockitoJUnitRunner.class)
public class DriverTest {

	@Mock
	Car mockAuto;

	@Mock
	Engine mockEngine;

	@Before
	public void setUp() {
		when(mockAuto.laskeNopeus()).thenReturn(100.0);
		when(mockEngine.getCylinders()).thenReturn(6);
		when(mockEngine.getBrokenCylinders()).thenReturn(0);
	}

	@Test
	/*
	 * Testataan kun ajotapa aggressiivinen ja nopeus 100, ajoaika 1.5h
	 */
	public void testAja() {
		Driver testiKuski = new Driver(mockAuto, "kuski",
				Ajotapa.AGGRESSIIVINEN);
		double matkaArvo = testiKuski.aja(1.5);
		assertEquals(150, matkaArvo, 0.001);

	}

	@Test
	/*
	 * Testataan kun ajotapa tavallinen ja auton huippunopeus 100, ajoaika 1h
	 */
	public void testAja2() {
		Driver testiKuski = new Driver(mockAuto, "kuski", Ajotapa.TAVALLINEN);
		double matkaArvo = testiKuski.aja(1);
		assertEquals(70, matkaArvo, 0.001);

	}

	@Test
	/*
	 * Testataan kun ajotapa rauhallinen ja auton huippunopeus 100, ajoaika 1h
	 */
	public void testAja3() {
		Driver testiKuski = new Driver(mockAuto, "kuski", Ajotapa.RAUHALLINEN);
		double matkaArvo = testiKuski.aja(1.0);
		assertEquals(40, matkaArvo, 0.001);

	}

	@Test
	/*
	 * Testataan kun ajotapa aggressiivinen ja auton huippunopeus 100, ajoaika
	 * 3,5h
	 */
	public void testAja4() {
		Driver testiKuski = new Driver(mockAuto, "kuski",
				Ajotapa.AGGRESSIIVINEN);
		double matkaArvo = testiKuski.aja(3.5);
		assertEquals(350, matkaArvo, 0.001);

	}

	@Test
	/*
	 * Testataan kun ajotapa tavallinen ja auton huippunopeus 100, ajoaika 0h
	 */
	public void testAja5() {
		Driver testiKuski = new Driver(mockAuto, "kuski", Ajotapa.TAVALLINEN);
		double matkaArvo = testiKuski.aja(0);
		assertEquals(0, matkaArvo, 0.001);

	}

}
