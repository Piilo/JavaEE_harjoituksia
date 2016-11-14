/**
 * 
 */
package PerusHarjoituksia;

import java.util.Scanner;

/**
 * @author oppi Piia Loukeinen
 * 
 */
public class Harj3 {

	/**
	 * @param args
	 * 
	 *            Kirjoita ohjelma, joka tulostaa jakauman kahden arpanopan
	 *            yhteisheiton tuloksesta, kun heittojen lukumäärä pyydetään
	 *            käyttäjältä. Satunnaistulos yhden arpanopan heitossa saadaan
	 *            seuraavalla lausekkeella: tulos = 1 + (int)( Math.random() * 6
	 *            ); Lisäksi tutkitaan toistokokeessa 2 peräkkäisen kutosen
	 *            todennäköisyyttä 1000:lla heitolla
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner lukija = new Scanner(System.in);
		System.out.print("Montako kertaa heitetään kahta noppaa?: ");
		int a = lukija.nextInt();
		lukija.close();

		noppa(a);
		System.out.println();

		toistokoe();

	}

	private static void toistokoe() {
		// TODO Auto-generated method stub
		int p = 0;
		int kaksiKutostaLkm = 0;
		while (p < 1001) {

			int ekaHeitto = 1 + (int) (Math.random() * 6);

			if (ekaHeitto == 6) {

				int tokaHeitto = 1 + (int) (Math.random() * 6);
				if (tokaHeitto == 6) {
					kaksiKutostaLkm++;

				}
				p++;

			} else {
				continue;

			}
		}

		double tulos = kaksiKutostaLkm / 1000.0;
		System.out
				.println("Todennäköisyys, että kutosen heiton jälkeen(heitetään 1000 krt) "
						+ "tulee toinen kutonen:"
						+ kaksiKutostaLkm
						+ " kpl, eli todennäköisyys: " + tulos);

	}

	private static void noppa(int a) {
		// TODO Auto-generated method stub

		int tk = 11;
		int[][] tulos = new int[tk][tk];

		for (int x = 2; x < tk + 2; x++) {
			tulos[0][x - 2] = x; // taulukon alustus
		}

		for (int i = 0; i < a; i++) {
			int noppa1 = 1 + (int) (Math.random() * 6);
			int noppa2 = 1 + (int) (Math.random() * 6);
			int summa = noppa1 + noppa2;
			// System.out.println(summa);

			for (int j = 0; j < tk; j++) {
				if (summa == tulos[0][j]) {
					tulos[1][j]++;
				}
			}

		}

		System.out.println("Jakauma kahden arpanopan yhteisheiton tuloksesta, heittojen lukumäärä: "
						+ a);

		for (int z = 0; z < tk; z++) {
			System.out.println("Summa:  " + tulos[0][z] + ":  " + tulos[1][z]
					+ "  kpl");
		}

	}

}
