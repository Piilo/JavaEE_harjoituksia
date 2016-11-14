/**
 * 
 */
package PerusHarjoituksia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author oppi Piia Loukeinen
 * 
 */
public class Harj2 {

	/**
	 * @param args
	 * 
	 *            Kirjoita ohjelma, joka pyytää käyttäjältä luokan
	 *            opiskelijoiden Ohjelmointi 1 -kurssin arvosanat ja tulostaa
	 *            arvosanajakauman käyttäen tähtiä seuraavasti: 0: 1: ** 2: ****
	 *            3: ******** 4: ***** 5: ********** Arvosanat pyydetään
	 *            yksitellen opiskelijoiden nimien mukaisessa
	 *            aakkosjärjestyksessä.
	 */
	public static void main(String[] args) {
		
		String[] opiskelijat = { "Aho", "Jokunen", "Järvinen", "Kettu",
				"Mäkinen", "Susi" };
		double[][] tulokset = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

		int y;
		for (y = 0; y < opiskelijat.length; y++) {
			tulokset[0][y] = y;
			// arvosanat ensimmäiseen sarakkeeseen
			

		}

		int x;
		for (x = 0; x < opiskelijat.length; x++) {
			@SuppressWarnings("resource")
			Scanner lukija = new Scanner(System.in);
			System.out.print("Anna opiskelijan " + opiskelijat[x]
					+ " arvosana> ");
			double a = lukija.nextDouble();

			int z;
			for (z = 0; z < opiskelijat.length; z++) {
				if (tulokset[0][z] == a) {
					tulokset[1][z]++;
				}
			}
		}

		int t;
		for (t = 0; t < opiskelijat.length; t++) {
			System.out.println("Arvosana: " + tulokset[0][t] + " "
					+ tulokset[1][t] + " kpl");
		}

	}

}
