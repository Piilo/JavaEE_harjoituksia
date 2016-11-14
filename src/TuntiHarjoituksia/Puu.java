/**
 * 
 */
package TuntiHarjoituksia;

/**
 * @author oppi
 */
public class Puu {

	private String laji;
	private double vuosikasvu;
	private int ika;

	public Puu() {

	}

	public String getLaji() {
		return laji;
	}

	public void setLaji(String laji) {
		this.laji = laji;
	}

	public double getVuosikasvu() {
		return vuosikasvu;
	}

	public void setVuosikasvu(double vuosikasvu) {
		this.vuosikasvu = vuosikasvu;
	}

	public int getIka() {
		return ika;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}
	
	private static void println(Puu puu) {
		double korkeus = puu.getIka()*puu.getVuosikasvu();
		System.out.println("Puun korkeus tällä hetkellä: "+ String.format("%.2f", korkeus));		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Puu manty = new Puu();

		 manty.setLaji("Mänty");

		 manty.setVuosikasvu(0.3);

		 manty.setIka(12);

		 println(manty);     // tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*12=4.8 m)

		 manty.lisaaVuosia(5); // lisää ikää 5 vuodella

		 println(manty);    // tulostaa puun lajin ja korkeuden tällä hetkellä (0.4 m*17=6.8 m)

	}

	private void lisaaVuosia(int i) {
		this.ika += ika+i;
		
	}

	

}
