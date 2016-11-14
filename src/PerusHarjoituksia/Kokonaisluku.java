/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi
 *
 */
public class Kokonaisluku {
	
	private int arvo;
	private int alaraja = 0;
	private int ylaraja = 100;
	
	public Kokonaisluku(){
		//this.arvo = 0;
	}
	

	public int getArvo() {
		return arvo;
	}



	public void setArvo(int arvo) throws RajaPoikkeus {
		if (arvo < alaraja || arvo >ylaraja){
			throw new RajaPoikkeus(alaraja, ylaraja);
		}else{
			this.arvo = arvo;
		}
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Kokonaisluku luku = new Kokonaisluku();
		//luku.setArvo(105);
		
	}

}
