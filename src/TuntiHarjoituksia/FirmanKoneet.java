package TuntiHarjoituksia;

import java.util.ArrayList;

public class FirmanKoneet {
	/*
	 *     kaksi konstruktoria (constructors without parameters and with parameter 
	 *     maxNumberOfComputers eli tietokoneiden maksimimäärä) lisaaKone (addComputer)
	 *     yhteishinta (countTotalPrice) toString (tulostaa kaikki tietokoneet)
	 */
	private static final int LUKUMAARA= 10;
	private int maxMaara;
	private int koneitaHankittu;
	private ArrayList<Tietokone> koneet;
	
	public FirmanKoneet(int koneidenMaara){
		koneet = new ArrayList<Tietokone>(koneidenMaara);
		maxMaara = koneidenMaara;
		koneitaHankittu = 0;
		
	}
	
	public FirmanKoneet(){
		koneet = new ArrayList<Tietokone>(LUKUMAARA);
		maxMaara = LUKUMAARA;
		koneitaHankittu = 0;
	}
	
	public void lisaaKone(Tietokone kone){
		if (koneitaHankittu >= maxMaara){
			System.out.println("Liikaa jo koneita, ei voida lisätä uutta");
		}else{
			koneet.add(kone);
			koneitaHankittu++;
		}
		
	}
	
	public double yhteisHinta(){
		double summa = 0;
		for(int i = 0; i < koneet.size(); i++){
			summa += koneet.get(i).getHankintahinta();
		}
		return summa;
	}
	
	
	

	public String toString() {
		for (int i = 0; i < koneet.size(); i++){
			System.out.println(koneet.get(i).toString());
			
		}
		return "";
	}

	public static void main(String[] args) {
		FirmanKoneet tietokoneet = new FirmanKoneet();
		Tietokone hp = new Tietokone(5,"hp elitebook",650.00);
		Tietokone app = new Tietokone(2,"Apple macBook",1190);
		Tietokone lenovo = new Tietokone(3,"Lenovo ThinkPad",790.0);
		Tietokone fujitsu = new Tietokone(1,"fujitsu Siemens",950);
		
		tietokoneet.lisaaKone(hp);
		tietokoneet.lisaaKone(app);
		tietokoneet.lisaaKone(lenovo);
		tietokoneet.lisaaKone(fujitsu);
		
		System.out.println("Koneiden yhteishinta: "+tietokoneet.yhteisHinta());
		System.out.println(hp);
		System.out.println();
		tietokoneet.toString();
		

	}

}
