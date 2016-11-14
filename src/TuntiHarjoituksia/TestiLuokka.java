/**
 * 
 */
package TuntiHarjoituksia;

/**
 * @author oppi
 *
 */
public class TestiLuokka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kissa kissa1 = new Kissa();
		Koira koira = new Koira();
		Kissa kissa2 = new Kissa();
		Kissa[] kissat = new Kissa[2];
		kissat[0] = kissa1;
		kissat[1] = kissa2;
		
		kissa1.nimi = "Mirri";
		koira.nimi = "Musti";
		
		System.out.println(koira);
		
		
		
		koira.jahtaa(kissa1);
		kissa1.karkuun(koira);
		
		

	}

}
