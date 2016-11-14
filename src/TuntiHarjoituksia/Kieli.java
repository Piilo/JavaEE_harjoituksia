/**
 * 
 */
package TuntiHarjoituksia;

/**
 * @author oppi
 *
 */
public class Kieli {
	
	
	private String nimi;
	private String koodi;
	
	public Kieli(String nimi, String koodi){
		this.nimi = nimi;
		this.koodi = koodi;
	}
	
	public Kieli(){
		
	}
	
	public void tulosta(){
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Kieli [nimi=" + nimi + ", koodi=" + koodi + "]";
	}
	

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kieli suomi = new Kieli();
		suomi.nimi = "suomi";
		suomi.koodi = "fi";
		Kieli ruotsi = new Kieli("ruosti", "ru");
		Kieli englanti = new Kieli("englanti", "en");
		
		Object[] t = new Object[3];
		t[0] = suomi;
		t[1] = ruotsi;
		t[2] = englanti;
		
		for (int i = 0; i < t.length; i++){
			((Kieli) t[i]).tulosta();
		}
		
		
	}

}
