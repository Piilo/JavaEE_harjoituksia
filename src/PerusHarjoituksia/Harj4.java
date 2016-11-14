/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi, Piia Loukeinen
 * 
 */
public class Harj4 {

	/**
	 * @param args
	 *            Funktiot keskiarvo, summa ja keskihajonta
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] taul = new double [args.length];
		for (int i = 0; i<args.length; i++){
			
			try{
				Double luku = Double.parseDouble(args[i]);
				taul[i]= luku;
			}catch (NumberFormatException e){
				System.out.println("Virhe syötteessä");
				taul[i]= 0;
			}
			
			
		}

		double summa = Harj4.laskeSumma(taul); 
													
		double keskiarvo = laskeKeskiarvo(taul);
		double keskihajonta = laskeKeskihajonta(taul);
		System.out.println("Summa: " + summa);
		System.out.println("Keskiarvo: " + keskiarvo);
		System.out.println("Keskihajonta: " + keskihajonta);

	}

	private static double laskeKeskihajonta(double[] taulukko) {
		double n;
		double haj;
		double ka = laskeKeskiarvo(taulukko);
		double tApu[] = new double[taulukko.length];

		for (int i = 0; i < taulukko.length; i++) {
			n = (ka - taulukko[i]) * (ka - taulukko[i]);
			tApu[i] = n;
		}

		double summa = laskeSumma(tApu);
		haj = Math.sqrt(summa / taulukko.length);

		return haj;
	}

	private static double laskeKeskiarvo(double[] taulukko) {

		double summa = laskeSumma(taulukko);
		return summa / taulukko.length;
	}

	private static double laskeSumma(double[] taulukko) {
		double summa = 0;

		for (int i = 0; i < taulukko.length; i++) {
			summa += taulukko[i];
		}
		return summa;

	}
}
