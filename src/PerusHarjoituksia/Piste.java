/**
 * 
 */
package PerusHarjoituksia;

/**
 * @author oppi
 *
 */
public class Piste {
	
	private int xPos;
	private int yPos;
	private int ylaraja;
	private int alaraja;
	
	public Piste(){
		this.xPos = 0;
		this.yPos = 0;
	}
	
	public void setPoint(int x, int y){
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		return "Piste [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
	
	

}
