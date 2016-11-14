/**
 * 
 */
package TuntiHarjoituksia;

/**
 * @author oppi
 *
 */
public class PaaohjelmaMatkustaja_Bussi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matkustaja pekka = new Matkustaja();
		pekka.setKohde("Tampere");
		pekka.setNimi("Pekka Puupää");
		pekka.setPaikanHinta(15.70);
		System.out.println(pekka);
		
		Matkustaja aino = new Matkustaja("Aino Ainoa", "Jyväskylä",25.6);
		Matkustaja erkki = new Matkustaja("Erkki Eerikäinen", "Kuhmo", 3.50);
		Matkustaja aimo = new Matkustaja("Aimo A", "Helsinki", 55.00);
		Matkustaja virpi = new Matkustaja("Virpi V","Oulu", 28.75);
		
		System.out.println(aino);
		System.out.println(erkki);
		System.out.println(virpi);
		System.out.println(pekka);
		System.out.println(aimo);
		System.out.println();
		System.out.println();
		
		Bussi bussi = new Bussi(5);
		
		bussi.lisaaMatkustaja(aino);
		bussi.lisaaMatkustaja(pekka);
		bussi.lisaaMatkustaja(aimo);
		bussi.lisaaMatkustaja(virpi);
		
		bussi.tulostaTiedot();
		
		System.out.println();
		System.out.println();
		
		bussi.poistaViimeinen();
		bussi.tulostaTiedot();
		
		System.out.println();
		System.out.println();
		
		bussi.lisaaMatkustaja(aino);
		bussi.lisaaMatkustaja(pekka);
		bussi.lisaaMatkustaja(aimo);
		bussi.tulostaTiedot();
		System.out.println();
		System.out.println("vapaat paikat: "+bussi.vielaVapaata());
		bussi.poistaViimeinen();
		System.out.println("vapaat paikat: "+bussi.vielaVapaata());
		System.out.println("Matkustajien maksama yhteishinta: "+ String.format("%.2f", bussi.yhteishinta()));
		

	}

}
