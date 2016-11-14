package TuntiHarjoituksia;

public class Tietokone {
	
	private int ika;
	private String nimi;
	private double hankintahinta;
	
	public Tietokone(int ika, String nimi, double hankintahinta){
		this.ika = ika;
		this.nimi = nimi;
		this.hankintahinta = hankintahinta;
	}

	@Override
	public String toString() {
		return "Tietokone [ika=" + ika + ", nimi=" + nimi + ", hankintahinta="
				+ hankintahinta + "]";
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getHankintahinta() {
		return hankintahinta;
	}

	public void setHankintahinta(double hankintahinta) {
		this.hankintahinta = hankintahinta;
	}
	

}
