package testausHarjoituksia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EngineTest {

	@Test
	/*
	 * Testataan konstruktori kun kaikki menee hyvin
	 */
	public void testEngine() {
		Engine testiM = new Engine(100, 6, 0);
		assertEquals(100, testiM.getPower());
		assertEquals(6, testiM.getCylinders());
		assertEquals(0, testiM.getBrokenCylinders());

	}

	@Test
	/*
	 * Testataan konstruktori kun alustetaan väärin, rikkinäisiä sylintereitä
	 * enemmän kuin ehjiä
	 */
	public void testEngine2() {
		Engine testiM = new Engine(100, 2, 5);
		assertEquals(2, testiM.getBrokenCylinders());

	}

	@Test
	/*
	 * Kun rikkinäisiä ei ole vielä, testataan, että sylintereitä rikkoutuu
	 */
	public void testMeneRikki() {

		int rikkinaisetSyl = 0;
		Engine testiMoottori = new Engine(200, 6, rikkinaisetSyl);
		int hajoaa = testiMoottori.meneRikki();
		assertNotSame(hajoaa, rikkinaisetSyl);

	}

	@Test
	/*
	 * Kun rikkinäisiä on jo valmiiksi, tarkistetaan että niitä tulee lisää
	 */
	public void testMeneRikki2() {

		int rikkinaisetSyl = 2;
		Engine testiMoottori = new Engine(200, 6, rikkinaisetSyl);
		int hajoaa = testiMoottori.meneRikki();
		assertTrue(testiMoottori.getBrokenCylinders() > 2);
	}

	@Test
	/*
	 * Tarkistetaan, että rikkinäisiä ei voi olla sylinterien määrää enempää
	 */
	public void testMeneRikki3() {

		int rikkinaisetSyl = 1;
		Engine testiMoottori = new Engine(200, 1, rikkinaisetSyl);
		int rikkinaistenLkm = testiMoottori.meneRikki();
		assertEquals(1, rikkinaistenLkm);
	}

}
