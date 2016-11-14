/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi, Piia Loukeinen
 * Testipääohjelma luokalle Henkilo
 *
 */
public class Harj5_Testipaaohjelma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Henkilo eka = new Henkilo();
		Henkilo toka = new Henkilo("Jaska Jokunen", 22, 72, 180);
		Henkilo kolmas = new Henkilo();
		
		kolmas.setIka(50);
		kolmas.setNimi("Anneli");
		kolmas.setPaino(50);
		kolmas.setPituus(155);
		
		toka.setFakta("Harrastaa jalkapalloa");
		toka.setFakta("Tykkää kissoista");
		
		String ekanNimi = eka.getNimi();
		System.out.println("Ekan nimi: "+ ekanNimi);
		System.out.println(eka.toString());
		toka.tulosta();
		kolmas.tulosta();
		toka.tulostaFaktat();
		
	}

}
