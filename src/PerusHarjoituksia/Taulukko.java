/**
 * 
 */
package PerusHarjoituksia;

import java.util.ArrayList;

/**
 * @author oppi, Piia Loukeinen
 *
 */
public class Taulukko {
	
	private ArrayList<Double> taulukko = new ArrayList();
	
	
	public Taulukko(double[] arvot){
		for (int i = 0; i < arvot.length; i++){
			taulukko.add(arvot[i]);
		}
	}
	
	public void lisaaArvo(double arvo){
		taulukko.add(arvo);
	
	}
	
	public void poistaArvo(double arvo){
		
		taulukko.remove(arvo);
	}
	
	public void tulosta(){
		
		System.out.println(taulukko.toString());
	}
	
	public double laskeKeskihajonta() {
		double n;
		double haj;
		double ka = laskeKeskiarvo();
		double tApu[] = new double[taulukko.size()];

		for (int i = 0; i < taulukko.size(); i++) {
			n = (ka - taulukko.get(i)) * (ka - taulukko.get(i));
			tApu[i] = n;
		}
		
		double summa = 0;
		for (int j = 0; j < tApu.length; j++){
			summa =+ tApu[j];
		}
		
		haj = Math.sqrt(summa / taulukko.size());

		return haj;
	}

	public double laskeKeskiarvo() {

		double summa = laskeSumma();
		return summa / taulukko.size();
	}

	public double laskeSumma() {
		double summa = 0;

		for (int i = 0; i < taulukko.size(); i++) {
			summa += taulukko.get(i);
		}
		
		
		return summa;

	}
	
	
}
