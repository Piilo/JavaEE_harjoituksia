/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi, Piia Loukeinen a) ohjelma, joka tulostaa 10-kertotaulun b)
 *         Ohjelma, joka tulostaa joulukuusen, joulukuusen tulostuksessa vielä
 *         hiukan vikaa, aivot nyrjähti
 */
public class Harj1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tulos = 0;
		int x = 0; // kerrottava

		for (x = 1; x <= 10; x++) {
			tulos = 10 * x;
			System.out.println(x + " kertaa 10 = " + tulos);

		}

		int z;

		int tLkm = 1;

		for (z = 1; z <= 8; z++) {

			if (z < 6) {
				int r = 0;
				while (r < 5 - tLkm / 2) {
					piirraTyhja();

					r++;
				}
				int k = 0;
				while (k < tLkm) {
					piirraTahti();
					k++;
				}
				tLkm++;
				System.out.println();

			} else {
				for (int i = 0; i < 3; i++) {
					piirraTyhja();
				}
				for (int j = 0; j < 3; j++) {
					piirraTahti();

				}
				System.out.println();
			}

		}

	}

	private static void piirraTyhja() {
		System.out.print(" ");

	}

	private static void piirraTahti() {

		System.out.print("* ");

	}

}
