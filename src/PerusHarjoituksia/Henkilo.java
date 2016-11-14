/**
 * 
 */
package PerusHarjoituksia;

import java.util.ArrayList;

/**
 * @author oppi, Piia Loukeinen
 * 
 */
public class Henkilo {

	private String nimi;
	private int ika, pituus, paino;
	private ArrayList<String> faktoja = new ArrayList();
	

	public Henkilo() {
		this.nimi = "Eino Esimerkki";
		this.ika = 25;
		this.pituus = 175;
		this.paino = 70;

	}

	public Henkilo(String nimi, int ika, int paino, int pituus) {
		this.nimi = nimi;
		this.paino = paino;
		this.ika = ika;
		this.pituus = pituus;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", ika=" + ika + ", pituus=" + pituus
				+ ", paino=" + paino + "]";
	}

	public void tulosta() {
		// String n = this.nimi;
		System.out.println(" Hei, olen " + nimi + " ja olen " + ika
				+ "-vuotias. Painan " + paino + " kiloa" + " ja olen " + pituus
				+ " pitkä");
	}
	
	public void setFakta(String f){
		faktoja.add(f);
	}
	
	public void tulostaFaktat(){
		System.out.println("Henkilö "+nimi +" " +faktoja.toString());
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	public int getPituus() {
		return pituus;
	}

	public void setPituus(int pituus) {
		this.pituus = pituus;
	}

	public int getPaino() {
		return paino;
	}

	public void setPaino(int paino) {
		this.paino = paino;
	}

}
