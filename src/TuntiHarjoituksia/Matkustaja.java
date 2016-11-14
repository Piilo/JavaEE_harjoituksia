package TuntiHarjoituksia;

public class Matkustaja {
	
	private String kohde;
	private double paikanHinta;
	private String nimi;
	
	
	public Matkustaja(String nimi,String kohde, double paikanHinta) {
	//	super();
		this.kohde = kohde;
		this.paikanHinta = paikanHinta;
		this.nimi = nimi;
	}
	
	public Matkustaja(){
		
	}


	@Override
	public String toString() {
		return nimi + " matkustaa kaupunkiin "+kohde+ " hintaan "+paikanHinta +" euroa.";
	}




	public String getKohde() {
		return kohde;
	}


	public void setKohde(String kohde) {
		this.kohde = kohde;
	}


	public double getPaikanHinta() {
		return paikanHinta;
	}


	public void setPaikanHinta(double paikanHinta) {
		this.paikanHinta = paikanHinta;
	}


	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	
	

}
