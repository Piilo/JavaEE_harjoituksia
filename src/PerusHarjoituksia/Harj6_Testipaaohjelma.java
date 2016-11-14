/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi, Piia Loukeinen
 *
 */
public class Harj6_Testipaaohjelma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] arvot = new double[]{1,2,3};
		Taulukko t = new Taulukko(arvot);
		
		t.tulosta();
		t.lisaaArvo(4);
		t.tulosta();
		
		double summa = t.laskeSumma();
		double ka = t.laskeKeskiarvo();
		double haj = t.laskeKeskihajonta();
		
		System.out.println("Summa: " + summa);
		System.out.println("Keskiarvo: " + ka);
		System.out.println("Keskihajonta: " + haj);
		System.out.println();
		
		t.poistaArvo(1.0);
		//t.lisaaArvo(2);
		
		summa = t.laskeSumma();
		ka = t.laskeKeskiarvo();
		haj = t.laskeKeskihajonta();
		
		System.out.println("Summa: " + summa);
		System.out.println("Keskiarvo: " + ka);
		System.out.println("Keskihajonta: " + haj);
		
		
	}

}
